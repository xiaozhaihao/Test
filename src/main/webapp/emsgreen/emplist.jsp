<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" contentType="text/html; utf-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/emsgreen/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20 
							<br />
							<a href="${pageContext.request.contextPath}/admin/logout">安全退出</a>
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome ${sessionScope.admin.name}!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Salary
							</td>
							<td>
								Age
							</td>
							<td>
								Operation
							</td>
						</tr>
						<c:forEach var="user" items="${list}">
							<tr class="row1">
								<td>
									${user.id}
								</td>
								<td>
									${user.name}
								</td>
								<td>
									${user.salary}
								</td>
								<td>
									${user.age}
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/user/delete?id=${user.id}">delete emp</a>&nbsp;<a href="${pageContext.request.contextPath}/user/preUpdate?id=${user.id}">update emp</a>
								</td>
							</tr>
						</c:forEach>

					</table>
					<p>
						<input type="button" class="button" value="Add Employee" onclick="location='${pageContext.request.contextPath}/emsgreen/addEmp.jsp'"/>
					</p>
				</div>
				<a href="">1</a>
				<a href="">2</a>
				<a href="">3</a>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
