package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet(name = "HS",urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      /*  response.setContentType("text/html");
        var out =response.getWriter();
        out.println("<h1>Hello from HelloServlet ^_^ </h1>");
        out.println("<h2> Protocole utilisé : "+request.getProtocol()+"</h2>");
        out.println("<h2> Methode utilisé : "+request.getMethod()+"</h2>");
        out.println("<h2> nom utilisé : "+request.getServerName()+"</h2>");
        out.println("<h2> chemin utilisé : "+request.getServletPath()+"</h2>");
        out.println("<h2> port utilisé : "+request.getServerPort()+"</h2>");*/

        request.getRequestDispatcher("/secondControleur").forward(request,response);

    }
}