package com.objis.demowenservice.simple;

public class HelloObjisWSProxy implements com.objis.demowenservice.simple.HelloObjisWS {
  private String _endpoint = null;
  private com.objis.demowenservice.simple.HelloObjisWS helloObjisWS = null;
  
  public HelloObjisWSProxy() {
    _initHelloObjisWSProxy();
  }
  
  public HelloObjisWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloObjisWSProxy();
  }
  
  private void _initHelloObjisWSProxy() {
    try {
      helloObjisWS = (new com.objis.demowenservice.simple.HelloObjisWSServiceLocator()).getHelloObjisWS();
      if (helloObjisWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloObjisWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloObjisWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloObjisWS != null)
      ((javax.xml.rpc.Stub)helloObjisWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.objis.demowenservice.simple.HelloObjisWS getHelloObjisWS() {
    if (helloObjisWS == null)
      _initHelloObjisWSProxy();
    return helloObjisWS;
  }
  
  public java.lang.String ditBonjour(java.lang.String nom) throws java.rmi.RemoteException{
    if (helloObjisWS == null)
      _initHelloObjisWSProxy();
    return helloObjisWS.ditBonjour(nom);
  }
  
  
}