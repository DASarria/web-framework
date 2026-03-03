package app.examples;

import java.io.IOException;
import java.net.URISyntaxException;

import app.HttpServer;


public class MathServices {
    public static void main (String[] args) throws IOException, URISyntaxException{
        HttpServer.staticfiles("/webroot");
        HttpServer.get("/App/pi", (req,res) -> "PI= " + Math.PI);
        HttpServer.get("/App/euler", (req,res)-> euler());
        HttpServer.get("/App/hello", (req,res) -> {
            String name = req.getValues("name");
            if(name.isEmpty()){
                return "Hello World!";
            } else {
                return "Hello " + name;
            }
        });

        HttpServer.main(args);
    }
    public static String euler(){
        return "e= " + Math.E;
    }
}
