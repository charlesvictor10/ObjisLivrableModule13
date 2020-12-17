package com.objis.mavenapps;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.objis.demojson.domaine.Employe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Employe employe = new Employe("Ba", "Amadou");
        
        // Object vers fichier JSON
        File resultFile = new File("employe.json");
        mapper.writeValue(resultFile, employe);
    }
}
