package SEServletClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello World!" );
/*        if (args.length != 2) {
            System.err.println("Usage:  java Reverse "
                    + "http://<location of your servlet/script>"
                    + " string_to_reverse");
            System.exit(1);
        }*/

//        String stringToReverse = URLEncoder.encode(args[1], "UTF-8");
        String stringToReverse = URLEncoder.encode("Test OwnServlet", "UTF-8");
        String urlStr = "http://localhost:8080/OwnServlet/simple";

//        URL url = new URL(args[0]);
        URL url = new URL(urlStr);
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        OutputStreamWriter out = new OutputStreamWriter(
                connection.getOutputStream());
        out.write("string=" + stringToReverse);
        out.close();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));
        String decodedString;
        while ((decodedString = in.readLine()) != null) {
            System.out.println(decodedString);
        }
        in.close();
    }
}
