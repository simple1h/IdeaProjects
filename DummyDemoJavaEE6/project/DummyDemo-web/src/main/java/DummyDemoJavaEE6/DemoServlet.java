package DummyDemoJavaEE6;

import DummyDemoJavaEE6.intf.IEjbFacadeLocal;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by Simple on 25.04.14.
 */
@WebServlet
public class DemoServlet extends HttpServlet
{
    @EJB
    private IEjbFacadeLocal been;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String respone=been.getMessageFromEjb("request from servlet");
        String responseTemplate =
                "<html>\n" +
                        "<body>\n" +
                        "<h2>" + respone + "</h2>\n" +
                        "</body>\n" +
                        "</html>";
        response.getWriter().write(responseTemplate);

    }
}
