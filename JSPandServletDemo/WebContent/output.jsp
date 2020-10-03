<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <c:out value="${fn:toLowerCase('B2 TECH')}" ></c:out>
      <c:out value="${fn:toUpperCase('b2 Tech')}" ></c:out>
      <c:out value="${fn:contains('I am a owner of B2 TECH ','B2 TECH')}" ></c:out>
      <c:out value="${fn:indexOf('I am a owner of B2 TECH ','asfdf')}" ></c:out>
      <c:out value="${fn:length('B2 TECH')}" ></c:out>
</body>
</html> 