package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form")
public class UIFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Nom : " + request.getParameter("nom"));
        out.println("Prenom : "+ request.getParameter("prenom"));
        if(request.getParameterValues("radio1")[0].equals("mas"))
            out.print("C'est un homme. Il");
        else
            out.print("C'est une femme. Elle");

        out.print(" a ecrit : ");
        out.println(request.getParameter("textarea"));*/
        request.getRequestDispatcher("reponse.jsp").forward(request,response);

    }
}
