/**
 * EspSoapFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package org.hpccsystems.ws.client.gen.wsworkunits.v1_69_axis2;

public class EspSoapFault extends java.lang.Exception {
    private static final long serialVersionUID = 1506545277929L;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_69_axis2.WsWorkunitsStub.Exceptions faultMessage;

    public EspSoapFault() {
        super("EspSoapFault");
    }

    public EspSoapFault(java.lang.String s) {
        super(s);
    }

    public EspSoapFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public EspSoapFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69_axis2.WsWorkunitsStub.Exceptions msg) {
        faultMessage = msg;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69_axis2.WsWorkunitsStub.Exceptions getFaultMessage() {
        return faultMessage;
    }
}
