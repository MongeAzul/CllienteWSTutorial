package com.tutorial.services;

public class TutorialWSProxy implements com.tutorial.services.TutorialWS {
  private String _endpoint = null;
  private com.tutorial.services.TutorialWS tutorialWS = null;
  
  public TutorialWSProxy() {
    _initTutorialWSProxy();
  }
  
  public TutorialWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initTutorialWSProxy();
  }
  
  private void _initTutorialWSProxy() {
    try {
      tutorialWS = (new com.tutorial.services.TutorialWSServiceLocator()).getTutorialWS();
      if (tutorialWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tutorialWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tutorialWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tutorialWS != null)
      ((javax.xml.rpc.Stub)tutorialWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.tutorial.services.TutorialWS getTutorialWS() {
    if (tutorialWS == null)
      _initTutorialWSProxy();
    return tutorialWS;
  }
  
  public java.lang.String algo(java.lang.String pAlgo) throws java.rmi.RemoteException{
    if (tutorialWS == null)
      _initTutorialWSProxy();
    return tutorialWS.algo(pAlgo);
  }
  
  
}