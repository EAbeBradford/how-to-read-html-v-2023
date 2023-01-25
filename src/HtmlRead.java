import java.net.*;
import java.io.*;

public class HtmlRead {

    public static void main(String[] args) {
        HtmlRead h = new HtmlRead();
    }

    public HtmlRead(){

        try{
            System.out.println();
            URL url = new URL("https://www.espn.com/");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }
            reader.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }



}
