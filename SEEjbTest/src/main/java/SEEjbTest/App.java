package SEEjbTest;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import TestEJBProject.*;

import java.util.Hashtable;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NamingException {
        System.out.println( "Hello World!" );
        try
        {
/*            Properties props = new Properties();

            props.setProperty("java.naming.factory.initial",
                    "com.sun.enterprise.naming.SerialInitContextFactory");

            props.setProperty("java.naming.factory.url.pkgs",
                    "com.sun.enterprise.naming");

            props.setProperty("java.naming.factory.state",
                    "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            // optional.  Defaults to localhost.  Only needed if web server is running
            // on a different host than the appserver
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");

            // optional.  Defaults to 3700.  Only needed if target orb port is not 3700.
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            InitialContext ic = new InitialContext(props);*/

            InitialContext ic = new InitialContext();
            TestBeanRemote testBeanRemote = (TestBeanRemote) ic.lookup("java:global/TestEJBProject.TestBeanRemote");
            System.out.println(testBeanRemote.getMessage());
        } catch (NamingException ex) {
            ex.printStackTrace();
        }

    }
}
