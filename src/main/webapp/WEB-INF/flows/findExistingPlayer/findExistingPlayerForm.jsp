<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html
  xmlns:c="http://java.sun.com/jsp/jstl/core"
  xmlns:jsp="http://java.sun.com/JSP/Page"
  xmlns:spring="http://www.springframework.org/tags"
  xmlns:form="http://www.springframework.org/tags/form">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Find Existing Player(s)</title>
</head>
<body>
	<h2>Find Existing Player(s)</h2>
	<p>
	  Has anyone in your family registered with us in the
	  past?  If so, enter you information below:
	</p>
	
	<form:form commandName="playerSearchCriteria" action="${flowExcecutionUrl}" >
	  <label for="firstName">Player First Name</label>
	  <form:input path="firstName" /><br/>
	  
	  <label for="lastName">Player Last Name</label>
	  <form:input path="lastName" /><br/>
	  
	  <label for="birthDate">Birth Date</label>
	  <form:input path="birthDate" /><br/>
	  
	  <label for="homePhone">Home Phone:</label>
	  <form:input path="homePhone" /><br/>
	  
	  <input type="submit" name="_eventId_skip" value="Skip"/>
	  <input type="submit" name="_eventId_find" value="Find"/>
	  
	</form:form>
</body>
</html>