<%--
  Created by IntelliJ IDEA.
  User: bouich ilham
  Date: 4/11/2023
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>REPONSE</title>
</head>
<body>
<p>Nom : <%=request.getParameter("nom")%></p>
<p>Prenom : <%=request.getParameter("prenom")%></p>
<% if(request.getParameterValues("radio1")[0].equals("mas")) {%>
C'est un homme. Il
<%} else { %>

C'est une femme. Elle <% } %>
a ecrit : <%= request.getParameter("textarea")%>
</p>


</body>
</html>
