/**
 * TutorialWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tutorial.services;

public interface TutorialWSService extends javax.xml.rpc.Service {
    public java.lang.String getTutorialWSAddress();

    public com.tutorial.services.TutorialWS getTutorialWS() throws javax.xml.rpc.ServiceException;

    public com.tutorial.services.TutorialWS getTutorialWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
