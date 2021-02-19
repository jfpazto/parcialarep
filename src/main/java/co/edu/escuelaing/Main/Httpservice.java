package co.edu.escuelaing.Main;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
public class Httpservice {
    public static String get(String operation, String number){

        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://calculatorserver1.herokuapp.com/lee?operation="+operation+"&number="+number)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();



    }

}
