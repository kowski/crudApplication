<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<body>
	<c:forEach items="${students}" var="item">
    ${item}<br>
	</c:forEach>
</body>
</html>
