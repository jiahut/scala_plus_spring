<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<ul>
    <c:forEach items="${users}" var="user">
        <li>${user.desc() }</li>
    </c:forEach>
</ul>
