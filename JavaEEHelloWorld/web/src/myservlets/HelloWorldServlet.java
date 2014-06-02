package myservlets;

import mybeans.HelloWorldBean;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by Simple on 22.04.14.
 */
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/helloworld")
public class HelloWorldServlet extends javax.servlet.http.HttpServlet {

    @EJB
    private HelloWorldBean helloWorldBean;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String hello=helloWorldBean.sayHello();
        request.setAttribute("hello",hello);
        request.getRequestDispatcher("hello.jsp").forward(request,response);

    }
}
