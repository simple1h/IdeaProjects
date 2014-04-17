package Sample;
import java.io.UnsupportedEncodingException;

/**
 * Created with IntelliJ IDEA.
 * User: Simple
 * Date: 29.05.13
 * Time: 20:36
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    public static String getMessage(){

        return "Hello World!!!";
    }
    public static String getResult (String src) throws UnsupportedEncodingException {
        String srcn;
        String str = "";
        if (src != null && src != ""){
            //byte[] b= src.getBytes("Cp1251");
            srcn = new String(src.getBytes("ISO-8859-1"),"UTF-8");
            str = srcn + " = Результат";
        }
        return str;
    }

}
