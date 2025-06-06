/**
 * TpLogFileResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wstopology.latest;

/** TpLogFileResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class TpLogFileResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogFileResponse", "ns1");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfEspException
      localExceptions;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExceptionsTracker = false;

  public boolean isExceptionsSpecified() {
    return localExceptionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfEspException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

  /** field for Name */
  protected java.lang.String localName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNameTracker = false;

  public boolean isNameSpecified() {
    return localNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getName() {
    return localName;
  }

  /**
   * Auto generated setter method
   *
   * @param param Name
   */
  public void setName(java.lang.String param) {
    localNameTracker = param != null;

    this.localName = param;
  }

  /** field for Type */
  protected java.lang.String localType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTypeTracker = false;

  public boolean isTypeSpecified() {
    return localTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getType() {
    return localType;
  }

  /**
   * Auto generated setter method
   *
   * @param param Type
   */
  public void setType(java.lang.String param) {
    localTypeTracker = param != null;

    this.localType = param;
  }

  /** field for StartDate */
  protected java.lang.String localStartDate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartDateTracker = false;

  public boolean isStartDateSpecified() {
    return localStartDateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getStartDate() {
    return localStartDate;
  }

  /**
   * Auto generated setter method
   *
   * @param param StartDate
   */
  public void setStartDate(java.lang.String param) {
    localStartDateTracker = param != null;

    this.localStartDate = param;
  }

  /** field for EndDate */
  protected java.lang.String localEndDate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEndDateTracker = false;

  public boolean isEndDateSpecified() {
    return localEndDateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEndDate() {
    return localEndDate;
  }

  /**
   * Auto generated setter method
   *
   * @param param EndDate
   */
  public void setEndDate(java.lang.String param) {
    localEndDateTracker = param != null;

    this.localEndDate = param;
  }

  /** field for LastHours */
  protected int localLastHours;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLastHoursTracker = false;

  public boolean isLastHoursSpecified() {
    return localLastHoursTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getLastHours() {
    return localLastHours;
  }

  /**
   * Auto generated setter method
   *
   * @param param LastHours
   */
  public void setLastHours(int param) {

    // setting primitive attribute tracker to true
    localLastHoursTracker = param != java.lang.Integer.MIN_VALUE;

    this.localLastHours = param;
  }

  /** field for FirstRows */
  protected int localFirstRows;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFirstRowsTracker = false;

  public boolean isFirstRowsSpecified() {
    return localFirstRowsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getFirstRows() {
    return localFirstRows;
  }

  /**
   * Auto generated setter method
   *
   * @param param FirstRows
   */
  public void setFirstRows(int param) {

    // setting primitive attribute tracker to true
    localFirstRowsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localFirstRows = param;
  }

  /** field for LastRows */
  protected int localLastRows;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLastRowsTracker = false;

  public boolean isLastRowsSpecified() {
    return localLastRowsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getLastRows() {
    return localLastRows;
  }

  /**
   * Auto generated setter method
   *
   * @param param LastRows
   */
  public void setLastRows(int param) {

    // setting primitive attribute tracker to true
    localLastRowsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localLastRows = param;
  }

  /** field for Reversely */
  protected boolean localReversely;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localReverselyTracker = false;

  public boolean isReverselySpecified() {
    return localReverselyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getReversely() {
    return localReversely;
  }

  /**
   * Auto generated setter method
   *
   * @param param Reversely
   */
  public void setReversely(boolean param) {

    // setting primitive attribute tracker to true
    localReverselyTracker = true;

    this.localReversely = param;
  }

  /** field for Zip */
  protected boolean localZip;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localZipTracker = false;

  public boolean isZipSpecified() {
    return localZipTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getZip() {
    return localZip;
  }

  /**
   * Auto generated setter method
   *
   * @param param Zip
   */
  public void setZip(boolean param) {

    // setting primitive attribute tracker to true
    localZipTracker = true;

    this.localZip = param;
  }

  /** field for FilterType */
  protected int localFilterType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilterTypeTracker = false;

  public boolean isFilterTypeSpecified() {
    return localFilterTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getFilterType() {
    return localFilterType;
  }

  /**
   * Auto generated setter method
   *
   * @param param FilterType
   */
  public void setFilterType(int param) {

    // setting primitive attribute tracker to true
    localFilterTypeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localFilterType = param;
  }

  /** field for LogData */
  protected java.lang.String localLogData;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogDataTracker = false;

  public boolean isLogDataSpecified() {
    return localLogDataTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLogData() {
    return localLogData;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogData
   */
  public void setLogData(java.lang.String param) {
    localLogDataTracker = param != null;

    this.localLogData = param;
  }

  /** field for HasDate */
  protected boolean localHasDate =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localHasDateTracker = false;

  public boolean isHasDateSpecified() {
    return localHasDateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getHasDate() {
    return localHasDate;
  }

  /**
   * Auto generated setter method
   *
   * @param param HasDate
   */
  public void setHasDate(boolean param) {

    // setting primitive attribute tracker to true
    localHasDateTracker = true;

    this.localHasDate = param;
  }

  /** field for FileSize */
  protected long localFileSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileSizeTracker = false;

  public boolean isFileSizeSpecified() {
    return localFileSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getFileSize() {
    return localFileSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileSize
   */
  public void setFileSize(long param) {

    // setting primitive attribute tracker to true
    localFileSizeTracker = param != java.lang.Long.MIN_VALUE;

    this.localFileSize = param;
  }

  /** field for PageFrom */
  protected long localPageFrom =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToLong("0");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPageFromTracker = false;

  public boolean isPageFromSpecified() {
    return localPageFromTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getPageFrom() {
    return localPageFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageFrom
   */
  public void setPageFrom(long param) {

    // setting primitive attribute tracker to true
    localPageFromTracker = param != java.lang.Long.MIN_VALUE;

    this.localPageFrom = param;
  }

  /** field for PageTo */
  protected long localPageTo;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPageToTracker = false;

  public boolean isPageToSpecified() {
    return localPageToTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getPageTo() {
    return localPageTo;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageTo
   */
  public void setPageTo(long param) {

    // setting primitive attribute tracker to true
    localPageToTracker = param != java.lang.Long.MIN_VALUE;

    this.localPageTo = param;
  }

  /** field for PageNumber */
  protected int localPageNumber =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("0");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPageNumberTracker = false;

  public boolean isPageNumberSpecified() {
    return localPageNumberTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPageNumber() {
    return localPageNumber;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageNumber
   */
  public void setPageNumber(int param) {

    // setting primitive attribute tracker to true
    localPageNumberTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPageNumber = param;
  }

  /** field for PrevPage */
  protected int localPrevPage = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("-1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPrevPageTracker = false;

  public boolean isPrevPageSpecified() {
    return localPrevPageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPrevPage() {
    return localPrevPage;
  }

  /**
   * Auto generated setter method
   *
   * @param param PrevPage
   */
  public void setPrevPage(int param) {

    // setting primitive attribute tracker to true
    localPrevPageTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPrevPage = param;
  }

  /** field for NextPage */
  protected int localNextPage = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("-1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNextPageTracker = false;

  public boolean isNextPageSpecified() {
    return localNextPageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getNextPage() {
    return localNextPage;
  }

  /**
   * Auto generated setter method
   *
   * @param param NextPage
   */
  public void setNextPage(int param) {

    // setting primitive attribute tracker to true
    localNextPageTracker = param != java.lang.Integer.MIN_VALUE;

    this.localNextPage = param;
  }

  /** field for TotalPages */
  protected int localTotalPages;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTotalPagesTracker = false;

  public boolean isTotalPagesSpecified() {
    return localTotalPagesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getTotalPages() {
    return localTotalPages;
  }

  /**
   * Auto generated setter method
   *
   * @param param TotalPages
   */
  public void setTotalPages(int param) {

    // setting primitive attribute tracker to true
    localTotalPagesTracker = param != java.lang.Integer.MIN_VALUE;

    this.localTotalPages = param;
  }

  /** field for AcceptLanguage */
  protected java.lang.String localAcceptLanguage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAcceptLanguageTracker = false;

  public boolean isAcceptLanguageSpecified() {
    return localAcceptLanguageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getAcceptLanguage() {
    return localAcceptLanguage;
  }

  /**
   * Auto generated setter method
   *
   * @param param AcceptLanguage
   */
  public void setAcceptLanguage(java.lang.String param) {
    localAcceptLanguageTracker = param != null;

    this.localAcceptLanguage = param;
  }

  /** field for LogFieldNames */
  protected org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspStringArray localLogFieldNames;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogFieldNamesTracker = false;

  public boolean isLogFieldNamesSpecified() {
    return localLogFieldNamesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspStringArray getLogFieldNames() {
    return localLogFieldNames;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogFieldNames
   */
  public void setLogFieldNames(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspStringArray param) {
    localLogFieldNamesTracker = param != null;

    this.localLogFieldNames = param;
  }

  /**
   * @param parentQName
   * @param factory
   * @return org.apache.axiom.om.OMElement
   */
  public org.apache.axiom.om.OMElement getOMElement(
      final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
      throws org.apache.axis2.databinding.ADBException {

    return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
  }

  public void serialize(
      final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
    serialize(parentQName, xmlWriter, false);
  }

  public void serialize(
      final javax.xml.namespace.QName parentQName,
      javax.xml.stream.XMLStreamWriter xmlWriter,
      boolean serializeType)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

    java.lang.String prefix = null;
    java.lang.String namespace = null;

    prefix = parentQName.getPrefix();
    namespace = parentQName.getNamespaceURI();
    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

    if (serializeType) {

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wstopology");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":TpLogFileResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "TpLogFileResponse",
            xmlWriter);
      }
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"), xmlWriter);
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
    }
    if (localTypeTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Type", xmlWriter);

      if (localType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localType);
      }

      xmlWriter.writeEndElement();
    }
    if (localStartDateTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "StartDate", xmlWriter);

      if (localStartDate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("StartDate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localStartDate);
      }

      xmlWriter.writeEndElement();
    }
    if (localEndDateTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "EndDate", xmlWriter);

      if (localEndDate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEndDate);
      }

      xmlWriter.writeEndElement();
    }
    if (localLastHoursTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "LastHours", xmlWriter);

      if (localLastHours == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("LastHours cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastHours));
      }

      xmlWriter.writeEndElement();
    }
    if (localFirstRowsTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "FirstRows", xmlWriter);

      if (localFirstRows == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("FirstRows cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstRows));
      }

      xmlWriter.writeEndElement();
    }
    if (localLastRowsTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "LastRows", xmlWriter);

      if (localLastRows == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("LastRows cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastRows));
      }

      xmlWriter.writeEndElement();
    }
    if (localReverselyTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Reversely", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Reversely cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReversely));
      }

      xmlWriter.writeEndElement();
    }
    if (localZipTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Zip", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Zip cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localZip));
      }

      xmlWriter.writeEndElement();
    }
    if (localFilterTypeTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "FilterType", xmlWriter);

      if (localFilterType == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("FilterType cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFilterType));
      }

      xmlWriter.writeEndElement();
    }
    if (localLogDataTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "LogData", xmlWriter);

      if (localLogData == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LogData cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogData);
      }

      xmlWriter.writeEndElement();
    }
    if (localHasDateTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "HasDate", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("HasDate cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasDate));
      }

      xmlWriter.writeEndElement();
    }
    if (localFileSizeTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "FileSize", xmlWriter);

      if (localFileSize == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("FileSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageFromTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "PageFrom", xmlWriter);

      if (localPageFrom == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageToTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "PageTo", xmlWriter);

      if (localPageTo == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageTo cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageTo));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageNumberTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "PageNumber", xmlWriter);

      if (localPageNumber == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageNumber cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNumber));
      }

      xmlWriter.writeEndElement();
    }
    if (localPrevPageTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "PrevPage", xmlWriter);

      if (localPrevPage == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PrevPage cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrevPage));
      }

      xmlWriter.writeEndElement();
    }
    if (localNextPageTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "NextPage", xmlWriter);

      if (localNextPage == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("NextPage cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextPage));
      }

      xmlWriter.writeEndElement();
    }
    if (localTotalPagesTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "TotalPages", xmlWriter);

      if (localTotalPages == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("TotalPages cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPages));
      }

      xmlWriter.writeEndElement();
    }
    if (localAcceptLanguageTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "AcceptLanguage", xmlWriter);

      if (localAcceptLanguage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("AcceptLanguage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localAcceptLanguage);
      }

      xmlWriter.writeEndElement();
    }
    if (localLogFieldNamesTracker) {
      if (localLogFieldNames == null) {
        throw new org.apache.axis2.databinding.ADBException("LogFieldNames cannot be null!!");
      }
      localLogFieldNames.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LogFieldNames"),
          xmlWriter);
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wstopology")) {
      return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
  }

  /** Utility method to write an element start tag. */
  private void writeStartElement(
      java.lang.String prefix,
      java.lang.String namespace,
      java.lang.String localPart,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
      xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
    } else {
      if (namespace.length() == 0) {
        prefix = "";
      } else if (prefix == null) {
        prefix = generatePrefix(namespace);
      }

      xmlWriter.writeStartElement(prefix, localPart, namespace);
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
  }

  /** Util method to write an attribute with the ns prefix */
  private void writeAttribute(
      java.lang.String prefix,
      java.lang.String namespace,
      java.lang.String attName,
      java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
      xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
    } else {
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
      xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
    }
  }

  /** Util method to write an attribute without the ns prefix */
  private void writeAttribute(
      java.lang.String namespace,
      java.lang.String attName,
      java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attValue);
    } else {
      xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
    }
  }

  /** Util method to write an attribute without the ns prefix */
  private void writeQNameAttribute(
      java.lang.String namespace,
      java.lang.String attName,
      javax.xml.namespace.QName qname,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {

    java.lang.String attributeNamespace = qname.getNamespaceURI();
    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
    if (attributePrefix == null) {
      attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
    }
    java.lang.String attributeValue;
    if (attributePrefix.trim().length() > 0) {
      attributeValue = attributePrefix + ":" + qname.getLocalPart();
    } else {
      attributeValue = qname.getLocalPart();
    }

    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attributeValue);
    } else {
      registerPrefix(xmlWriter, namespace);
      xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
    }
  }
  /** method to handle Qnames */
  private void writeQName(
      javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
      java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
      if (prefix == null) {
        prefix = generatePrefix(namespaceURI);
        xmlWriter.writeNamespace(prefix, namespaceURI);
        xmlWriter.setPrefix(prefix, namespaceURI);
      }

      if (prefix.trim().length() > 0) {
        xmlWriter.writeCharacters(
            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      } else {
        // i.e this is the default namespace
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }

    } else {
      xmlWriter.writeCharacters(
          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
  }

  private void writeQNames(
      javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
      // we have to store this data until last moment since it is not possible to write any
      // namespace data after writing the charactor data
      java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
      java.lang.String namespaceURI = null;
      java.lang.String prefix = null;

      for (int i = 0; i < qnames.length; i++) {
        if (i > 0) {
          stringToWrite.append(" ");
        }
        namespaceURI = qnames[i].getNamespaceURI();
        if (namespaceURI != null) {
          prefix = xmlWriter.getPrefix(namespaceURI);
          if ((prefix == null) || (prefix.length() == 0)) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix, namespaceURI);
          }

          if (prefix.trim().length() > 0) {
            stringToWrite
                .append(prefix)
                .append(":")
                .append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        } else {
          stringToWrite.append(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
        }
      }
      xmlWriter.writeCharacters(stringToWrite.toString());
    }
  }

  /** Register a namespace prefix */
  private java.lang.String registerPrefix(
      javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
      prefix = generatePrefix(namespace);
      javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
      while (true) {
        java.lang.String uri = nsContext.getNamespaceURI(prefix);
        if (uri == null || uri.length() == 0) {
          break;
        }
        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
  }

  /** Factory class that keeps the parse method */
  public static class Factory {
    private static org.apache.commons.logging.Log log =
        org.apache.commons.logging.LogFactory.getLog(Factory.class);

    /**
     * static method to create the object Precondition: If this object is an element, the current or
     * next start element starts this object and any intervening reader events are ignorable If this
     * object is not an element, it is a complex type and the reader is at the event just after the
     * outer start element Postcondition: If this object is an element, the reader is positioned at
     * its end element If this object is a complex type, the reader is positioned at the end element
     * of its outer element
     */
    public static TpLogFileResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      TpLogFileResponse object = new TpLogFileResponse();

      int event;
      javax.xml.namespace.QName currentQName = null;
      java.lang.String nillableValue = null;
      java.lang.String prefix = "";
      java.lang.String namespaceuri = "";
      try {

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        currentQName = reader.getName();

        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
          java.lang.String fullTypeName =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
          if (fullTypeName != null) {
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1) {
              nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix == null ? "" : nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

            if (!"TpLogFileResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (TpLogFileResponse)
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ExtensionMapper
                      .getTypeObject(nsUri, type, reader);
            }
          }
        }

        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();

        reader.next();

        while (!reader.isEndElement()) {
          if (reader.isStartElement()) {

            if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfEspException.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Name" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Type" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "StartDate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StartDate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStartDate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "EndDate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EndDate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEndDate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LastHours")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LastHours" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLastHours(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "FirstRows")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FirstRows" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFirstRows(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LastRows")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LastRows" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLastRows(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Reversely")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Reversely" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setReversely(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Zip")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Zip" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setZip(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "FilterType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FilterType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFilterType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LogData")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogData" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogData(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "HasDate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "HasDate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setHasDate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "FileSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FileSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PageFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PageTo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageTo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageTo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PageNumber")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageNumber" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageNumber(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PrevPage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PrevPage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPrevPage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "NextPage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NextPage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNextPage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TotalPages")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TotalPages" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTotalPages(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "AcceptLanguage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AcceptLanguage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAcceptLanguage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LogFieldNames")
                    .equals(reader.getName())) {

              object.setLogFieldNames(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else {
              // 3 - A start element we are not expecting indicates an invalid parameter was passed

              throw new org.apache.axis2.databinding.ADBException(
                  "Unexpected subelement " + reader.getName());
            }

          } else {
            reader.next();
          }
        } // end of while loop

      } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
      }

      return object;
    }
  } // end of factory class
}
