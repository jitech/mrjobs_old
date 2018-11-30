<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Mr.Jobs</title>
		
	<link href="css/style.css" rel="stylesheet">	
	<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet"/>
	
	<script src="js/script.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>	
	
</head>
<body class="body">
	
	<div id="header" class="header"> 	
		<center>
			 <div class="header-content">
			 	<jsp:include page="header.jsp" />
			 </div>
		</center>		
	</div>
		
	<div id="content" class="content"> 	
		
		<center>
		<div class="content-content">
		<c:choose>
			<c:when test="${page != null}">
        		<jsp:include page="${page}.jsp" />
   			</c:when>
    		<c:otherwise>
        		<jsp:include page="not-found.jsp" />
    		</c:otherwise> 	
		</c:choose>
		</div>
		</center>
		
	</div>	
		
	<div id="footer" class="footer"> 	
		<center>
			<div class="footer-content">
				<jsp:include page="footer.jsp" />
			</div>
		</center>	
	</div>
	
</body>
</html>