<%--
  Created by IntelliJ IDEA.
  User: Simple
  Date: 29.05.13
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Sample.HelloWorld" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%--@ page import="java.io.*" --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Sample JSP page</title>
      <link rel="stylesheet" type="text/css" href="styles.css"/>
  </head>
  <body>
    <%--<h3 class="message"><%=HelloWorld.getMessage()%></h3>--%>
    <form action="index.jsp">
        <p>Введите слово для поиска: <input type="text" name=word ></p>
        <p><input type="submit" value="Поиск"></p>

    <%

        String str = request.getParameter("word");
        String res = HelloWorld.getResult(str);
        if (res != "")
         out.println(res);

    %>
    </form>
  </body>
</html>