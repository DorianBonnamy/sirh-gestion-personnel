<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
			List<Collaborateur> listeCollabo = (List<Collaborateur>) request.getAttribute("listeCollabo");
			for (Collaborateur collabo : listeCollabo) {
		%>
		<li><%=collabo.getNom()%> - <%=collabo.getPrenom()%> - <%=collabo.getMatricule() %></li>
		<%
			}
		%>
	</ul>
</body>
</html>