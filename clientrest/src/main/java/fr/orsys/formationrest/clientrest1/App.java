package fr.orsys.formationrest.clientrest1;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class App 
{
    public static void main( String[] args )
    {
    	try {
    		// GET Method
    		Client client = Client.create();

    		WebResource webResource = client
    		   .resource("http://localhost:8080/monwebservicerest/rest/message");

    		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

    		if (response.getStatus() != 200) {
    		   throw new RuntimeException("Failed : HTTP error code : "
    			+ response.getStatus());
    		}

    		String output = response.getEntity(String.class);
    		System.out.println("Output from Server .... \n");
    		System.out.println(output);
    		
    		// POST Method
    		String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
    		
    		ClientResponse responses = webResource.type("application/json").post(ClientResponse.class, input);
    		
    		if(response.getStatus() != 201) {
    			throw new RuntimeException("Failed: HTTP error code: "+responses.getStatus());
    		}
    		
    		System.out.println("Output from Server .... \n");
    		String outputs = response.getEntity(String.class);
    		System.out.println(outputs);
    	  } catch (Exception e) {
    		e.printStackTrace();
    	  }
    	}
    }
