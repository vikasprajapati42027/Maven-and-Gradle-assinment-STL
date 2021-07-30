<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor:"red">
<%@include file="header.html" %>

  <h3>Dear  <jsp:getProperty property="username" name="ob"/>welcome to this page</h3>
  
   
   <% 
   String username=request.getParameter("username");
   session.setAttribute("user",username);
   session.setMaxInactiveInterval(30);
   
   int times=session.getMaxInactiveInterval();
   String encodeProductUrl=response.encodeURL("ProductServlet");
   %>
   <p>Session time out :<%=times%></p>
   <p>To enjoy shopping <a href="<%=encodeProductUrl%>">Click Here</a></p>
  
   <%@include file="footer.html" %>
</body>
</html>