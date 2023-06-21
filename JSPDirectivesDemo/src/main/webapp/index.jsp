<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>JSPDirectivesDemo</title>

This is content from the main file (index.jsp).

<%@ include file="file1.jsp"%>

<hr>
Example of using JSTL taglibs for formatting output
<br>
<p>
    Currency =
    <fmt:formatNumber value="149" type="currency" />
</p>
<p>
    <fmt:setLocale value="en_US" />
    Current date and time is
    <fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="<%=new java.util.Date()%>" />
</p>
