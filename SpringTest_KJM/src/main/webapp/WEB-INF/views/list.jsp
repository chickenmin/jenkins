<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<table border="1px;">
				<thead>
					<tr>
						<td>직업명</td>
						<td>아이디</td>
						<td>최소연봉</td>
						<td>최대연봉</td>
					</tr>
				</thead>	
				<tbody>
					<c:forEach var="vo" items="${lists}" varStatus="vs">
						<tr>
							<td>${vo.job_id}</td>
							<td>${vo.job_title}</td>
							<td>${vo.min_salary}</td>
							<td>${vo.max_salary}</td>
						</tr>
					</c:forEach>
				</tbody>	
			</table>
</body>
</html>