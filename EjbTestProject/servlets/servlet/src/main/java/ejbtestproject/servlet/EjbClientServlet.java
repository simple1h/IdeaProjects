package ejbtestproject.servlet;

import ejbtestproject.ejb.TestBean;

import java.io.IOException;

/**
 * Created by Simple on 23.04.14.
 */
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/helloworld")
public class EjbClientServlet  extends javax.servlet.http.HttpServlet
{
    @EJB
    private TestBean helloWorldBean;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String hello=helloWorldBean.sayHello();
        request.setAttribute("hello",hello);
        request.getRequestDispatcher("hello.jsp").forward(request,response);

    }
}
