/**
 * TutorialWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tutorial.services;

public class TutorialWSServiceLocator extends org.apache.axis.client.Service implements com.tutorial.services.TutorialWSService {

    public TutorialWSServiceLocator() {
    }


    public TutorialWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TutorialWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TutorialWS
    private java.lang.String TutorialWS_address = "http://localhost:8080/TutorialWebService/services/TutorialWS";

    public java.lang.String getTutorialWSAddress() {
        return TutorialWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TutorialWSWSDDServiceName = "TutorialWS";

    public java.lang.String getTutorialWSWSDDServiceName() {
        return TutorialWSWSDDServiceName;
    }

    public void setTutorialWSWSDDServiceName(java.lang.String name) {
        TutorialWSWSDDServiceName = name;
    }

    public com.tutorial.services.TutorialWS getTutorialWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TutorialWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTutorialWS(endpoint);
    }

    public com.tutorial.services.TutorialWS getTutorialWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tutorial.services.TutorialWSSoapBindingStub _stub = new com.tutorial.services.TutorialWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getTutorialWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTutorialWSEndpointAddress(java.lang.String address) {
        TutorialWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tutorial.services.TutorialWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tutorial.services.TutorialWSSoapBindingStub _stub = new com.tutorial.services.TutorialWSSoapBindingStub(new java.net.URL(TutorialWS_address), this);
                _stub.setPortName(getTutorialWSWSDDServiceName());
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
        if ("TutorialWS".equals(inputPortName)) {
            return getTutorialWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.tutorial.com", "TutorialWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.tutorial.com", "TutorialWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TutorialWS".equals(portName)) {
            setTutorialWSEndpointAddress(address);
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
