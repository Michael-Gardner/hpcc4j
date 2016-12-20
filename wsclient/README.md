Wsclient Project
=======================

Java API for interaction with ESP services

The project is configured to be built using Maven. To build the projects using Maven, navigate to the base directory of this project and issue the following command:

`mvn install`

For more information on how to use Maven see http://maven.apache.org

wsclient contains:
- API which Standardize and facilitate interaction with HPCC Web based Services.
    *The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis and JSch(Java Secure Channel) for secure ftp transfers


** PLEASE NOTE **

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

* From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

 * Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

* From the JAVA editor, choose Source->Format

wsclient version | hpccsystems-platform version
--- | ---
1.0.0 | 6.2.0
