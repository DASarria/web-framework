package app.examples;

import java.io.IOException;
import java.net.URISyntaxException;

import app.HttpServer;


public class MathServices {
    public static void main (String[] args) throws IOException, URISyntaxException{
        HttpServer.get("/pi", (req,res) -> "PI= " + Math.PI);
        HttpServer.get("/hello", (req,res) -> "Hello World" );
        HttpServer.get("/euler", (req,res)-> euler());
        HttpServer.main(args);
    }
    public static String euler(){
        return "e= " + Math.E;
    }
}
