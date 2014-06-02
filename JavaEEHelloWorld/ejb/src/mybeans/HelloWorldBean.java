package mybeans;

import javax.ejb.Stateless;

/**
 * Created by Simple on 22.04.14.
 */
@Stateless(name = "HelloWorldEJB")
public class HelloWorldBean {
    public HelloWorldBean() {
    }
    public String sayHello() {
        return "Hello, World!";
    }
}
