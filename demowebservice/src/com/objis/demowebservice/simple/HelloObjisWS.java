package com.objis.demowebservice.simple;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface="com.objis.demowebservice.simple.HelloObjis")
@HandlerChain(file = "LogMessageHandler.xml")
public class HelloObjisWS implements HelloObjis {

	public String ditBonjour(String nom) {
		return "Hello, " +  nom + " !";
	}

}
