package com.objis.demowebservice.simple;

import javax.xml.ws.Endpoint;

public class HelloPublisher {	
	public static final String URI = "http://localhost:8888/hello" ;		
	public static void main(String[] args) {
		// Cree une instance de l'implémentataion
		HelloObjisWS impl = new HelloObjisWS();	
		// Rend disponible l'instance
		Endpoint endpoint = Endpoint.publish(URI, impl);
		// Tester la disponibilité du endpoint
		boolean status = endpoint.isPublished();		
		System.out.println("Web Service disponible ? " + status);		
	}
}
