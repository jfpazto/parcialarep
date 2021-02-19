package co.edu.escuelaing.Main;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
public class Cliente {
    public static void main(String[] args) {
        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://serverfinal1.herokuapp.com/lee?operation=tan&number=3.14")
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println(response.getBody());
    }

}
