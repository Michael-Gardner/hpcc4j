#!/bin/bash
#
# Common utilities used by tools for automating tagging and release
#

#We want any failures to be fatal

set -e

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

REMOTE=origin
FORCE=
DRYRUN=
IGNORE=
RETAG=
VERBOSE=
VERSIONFILE=pom.xml
if [ ! -f $VERSIONFILE ]; then
  VERSIONFILE=$SCRIPT_DIR/pom.xml
fi

POSITIONAL=()
while [[ $# -gt 0 ]]
do
  key="$1"
  case $key in
    -f|--force)
    FORCE=-f
    shift
    ;;
    -i|--ignore)
    IGNORE=$1
    shift
    ;;
    -v|--verbose)
    VERBOSE=$1
    shift
    ;;
    --retag)
    RETAG=$1
    shift
    ;;
    -d|--dryrun)
    DRYRUN=$1
    shift
    ;;
    -r|--remote)
    if [ $# -eq 1 ] ; then
      echo "$1 option requires an argument"
      exit 2
    fi
    REMOTE="$2"
    shift 
    shift
    ;;
    *)    # unknown option
    POSITIONAL+=("$1") # save it in an array for later
    shift # past argument
    ;;
  esac
done
set -- "${POSITIONAL[@]}" # restore positional parameters

if [ "$#" -ge 1 ] ; then
  VERSIONFILE=$1
  shift 1
fi
if [ ! -f $VERSIONFILE ]; then
  echo "File $VERSIONFILE not found"
  exit 2
fi

GIT_BRANCH=$(git rev-parse --symbolic-full-name --abbrev-ref HEAD)

function check_program()
{
  local _program=$1
  if ! 'which ${_program}'; then
    echo "Program ${_program} not found on system, required for scripts"
    exit 1
  fi
}


# brute-force way to read cmake values by "parsing" the line that sets them
# note that this makes some assumptions about how the version.cmake is laid out!

function parse_pom()
{
  check_program xpath
  local _file=$1
  local _name=$2
  local _result=$(xpath -q -e //project/version/text\(\) $_file)
  eval "$_name='$_result'" 
}

function doit()
{
    if [ -n "$VERBOSE" ] || [ -n "$DRYRUN" ] ; then echo $1 ; fi
    if [ -z "$DRYRUN" ] ; then eval $1 ; fi
}
















