/**
 * WUQuerySetFilterType.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WUQuerySetFilterType bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUQuerySetFilterType implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName(
          "urn:hpccsystems:ws:wsworkunits", "WUQuerySetFilterType", "ns1");

  /** field for WUQuerySetFilterType */
  protected java.lang.String localWUQuerySetFilterType;

  private static java.util.HashMap _table_ = new java.util.HashMap();

  // Constructor

  protected WUQuerySetFilterType(java.lang.String value, boolean isRegisterValue) {
    localWUQuerySetFilterType = value;
    if (isRegisterValue) {

      _table_.put(localWUQuerySetFilterType, this);
    }
  }

  public static final java.lang.String _All =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToString("All");

  public static final java.lang.String _Id =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Id");

  public static final java.lang.String _Name =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Name");

  public static final java.lang.String _Alias =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Alias");

  public static final java.lang.String _Status =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Status");

  public static final WUQuerySetFilterType All = new WUQuerySetFilterType(_All, true);

  public static final WUQuerySetFilterType Id = new WUQuerySetFilterType(_Id, true);

  public static final WUQuerySetFilterType Name = new WUQuerySetFilterType(_Name, true);

  public static final WUQuerySetFilterType Alias = new WUQuerySetFilterType(_Alias, true);

  public static final WUQuerySetFilterType Status = new WUQuerySetFilterType(_Status, true);

  public java.lang.String getValue() {
    return localWUQuerySetFilterType;
  }

  public boolean equals(java.lang.Object obj) {
    return (obj == this);
  }

  public int hashCode() {
    return toString().hashCode();
  }

  public java.lang.String toString() {

    return localWUQuerySetFilterType.toString();
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

    // We can safely assume an element has only one type associated with it

    java.lang.String namespace = parentQName.getNamespaceURI();
    java.lang.String _localName = parentQName.getLocalPart();

    writeStartElement(null, namespace, _localName, xmlWriter);

    // add the type details if this is used in a simple type
    if (serializeType) {
      java.lang.String namespacePrefix =
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsworkunits");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":WUQuerySetFilterType",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "WUQuerySetFilterType",
            xmlWriter);
      }
    }

    if (localWUQuerySetFilterType == null) {

      throw new org.apache.axis2.databinding.ADBException("WUQuerySetFilterType cannot be null !!");

    } else {

      xmlWriter.writeCharacters(localWUQuerySetFilterType);
    }

    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsworkunits")) {
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

    public static WUQuerySetFilterType fromValue(java.lang.String value)
        throws java.lang.IllegalArgumentException {
      WUQuerySetFilterType enumeration = (WUQuerySetFilterType) _table_.get(value);

      // handle unexpected enumeration values properly
      if (enumeration == null) {

        throw new java.lang.IllegalArgumentException();
      }
      return enumeration;
    }

    public static WUQuerySetFilterType fromString(
        java.lang.String value, java.lang.String namespaceURI)
        throws java.lang.IllegalArgumentException {
      try {

        return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

      } catch (java.lang.Exception e) {
        throw new java.lang.IllegalArgumentException();
      }
    }

    public static WUQuerySetFilterType fromString(
        javax.xml.stream.XMLStreamReader xmlStreamReader, java.lang.String content) {
      if (content.indexOf(":") > -1) {
        java.lang.String prefix = content.substring(0, content.indexOf(":"));
        java.lang.String namespaceUri =
            xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
        return WUQuerySetFilterType.Factory.fromString(content, namespaceUri);
      } else {
        return WUQuerySetFilterType.Factory.fromString(content, "");
      }
    }

    /**
     * static method to create the object Precondition: If this object is an element, the current or
     * next start element starts this object and any intervening reader events are ignorable If this
     * object is not an element, it is a complex type and the reader is at the event just after the
     * outer start element Postcondition: If this object is an element, the reader is positioned at
     * its end element If this object is a complex type, the reader is positioned at the end element
     * of its outer element
     */
    public static WUQuerySetFilterType parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUQuerySetFilterType object = null;
      // initialize a hash map to keep values
      java.util.Map attributeMap = new java.util.HashMap();
      java.util.List extraAttributeList =
          new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

      int event;
      javax.xml.namespace.QName currentQName = null;
      java.lang.String nillableValue = null;
      java.lang.String prefix = "";
      java.lang.String namespaceuri = "";
      try {

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        currentQName = reader.getName();

        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();

        while (!reader.isEndElement()) {
          if (reader.isStartElement() || reader.hasText()) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "WUQuerySetFilterType" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            if (content.indexOf(":") > 0) {
              // this seems to be a Qname so find the namespace and send
              prefix = content.substring(0, content.indexOf(":"));
              namespaceuri = reader.getNamespaceURI(prefix);
              object = WUQuerySetFilterType.Factory.fromString(content, namespaceuri);
            } else {
              // this seems to be not a qname send and empty namespace incase of it is
              // check is done in fromString method
              object = WUQuerySetFilterType.Factory.fromString(content, "");
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
