/**
 * HelloObjisWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.objis.demowenservice.simple;

public class HelloObjisWSServiceLocator extends org.apache.axis.client.Service implements com.objis.demowenservice.simple.HelloObjisWSService {

    public HelloObjisWSServiceLocator() {
    }


    public HelloObjisWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloObjisWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloObjisWS
    private java.lang.String HelloObjisWS_address = "http://localhost:8080/WebServiceProject/services/HelloObjisWS";

    public java.lang.String getHelloObjisWSAddress() {
        return HelloObjisWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloObjisWSWSDDServiceName = "HelloObjisWS";

    public java.lang.String getHelloObjisWSWSDDServiceName() {
        return HelloObjisWSWSDDServiceName;
    }

    public void setHelloObjisWSWSDDServiceName(java.lang.String name) {
        HelloObjisWSWSDDServiceName = name;
    }

    public com.objis.demowenservice.simple.HelloObjisWS getHelloObjisWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloObjisWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloObjisWS(endpoint);
    }

    public com.objis.demowenservice.simple.HelloObjisWS getHelloObjisWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.objis.demowenservice.simple.HelloObjisWSSoapBindingStub _stub = new com.objis.demowenservice.simple.HelloObjisWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloObjisWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloObjisWSEndpointAddress(java.lang.String address) {
        HelloObjisWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.objis.demowenservice.simple.HelloObjisWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.objis.demowenservice.simple.HelloObjisWSSoapBindingStub _stub = new com.objis.demowenservice.simple.HelloObjisWSSoapBindingStub(new java.net.URL(HelloObjisWS_address), this);
                _stub.setPortName(getHelloObjisWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloObjisWS".equals(inputPortName)) {
            return getHelloObjisWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://simple.demowenservice.objis.com", "HelloObjisWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://simple.demowenservice.objis.com", "HelloObjisWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloObjisWS".equals(portName)) {
            setHelloObjisWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
