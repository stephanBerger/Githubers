<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="fr.wildcodeschool.githubtracker.model.Githubers"%>
<%@ page import="java.util.ArrayList"%>

<%@ include file="header.jsp"%>
<!-- <ul class="list-group"> -->
<!--<%-- 	<% --%>
// 		ArrayList<Githubers> liste = (ArrayList<Githubers>) request
// 				.getAttribute("listGithubers");

// 		for (Githubers str : liste) {
// 			out.println("<li class=\"list-group-item list-group-item-dark\">" + str.getName()
// 					+ " " + str.getEmail() + " " + str.getId() + " "
// 					+ str.getLogin() + " " + str.getAvatarUrl() + "<li>");
// 		}
<%-- 	%> --%>
<!-- </ul> -->
<table class="table table-bordered">
	<thead>
		<tr>
			<th scope="col">Name</th>
			<th scope="col">Email</th>
			<th scope="col">Login</th>
			<th scope="col">Id</th>
			<th scope="col">AvatarURL</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listGithubers}" var="str">
			<tr>
				<td><c:out value="${str.name}" /></td>
				<td><c:out value="${str.email}" /></td>
				<td><c:out value="${str.login}" /></td>
				<td><c:out value="${str.id}" /></td>
				<td><c:out value="${str.avatarUrl}"/></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<a href="index">Retour </a>
</body>
</html>