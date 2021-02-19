package co.edu.escuelaing.Main;

import static spark.Spark.*;
//import edu.escuelaing.arep.components.HttpRequest;

import spark.Request;
import spark.Response;


import org.json.JSONObject;



public class Main {
    public static void main(String[] args) {
        port(getPort());
        
        get("/lee",(req,res)->{
            String operation = req.queryParams("operation");
            String number = req.queryParams("number");
            JSONObject jsonObject = new JSONObject(Httpservice.get(operation,number));
            return jsonObject;
        });


    }
    /*
    public static String saida(String numero1, String numero2)
    {
    	
    	Calculadora calculadora=new Calculadora();
    	
    	double res=calculadora.realizaOp(numero1, numero2);
    	String tira=String.valueOf(res);
    	return tira;
    }*/
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 2000;
    }
}