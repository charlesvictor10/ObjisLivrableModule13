package com.objis.demowebservice.simple;

import javax.xml.ws.Endpoint;

public class HelloPublisher {
	
	public static final String URI = "http://localhost:8888/hello" ;
			
	public static void main(String[] args) {
		
		HelloObjisWS impl = new HelloObjisWS();
		
		Endpoint endpoint = Endpoint.publish(URI, impl);
		
		boolean status = endpoint.isPublished();
		
		System.out.println("Web Service disponible ? " + status);
		
		
	}
}
