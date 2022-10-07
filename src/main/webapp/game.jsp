<%@ page import="com.contagion.GameLogic" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="base.css" rel="stylesheet">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <title>Game</title>
</head>
<body>

<img src="${imgUrl}" alt="non">
<p>${story}</p>
<c:choose>
    <c:when test="${isDead}">
        <form action="/restart" method="post">
        <button>Смэрть. Начать сначала.</button>
        </form>
    </c:when>
    <c:when test="${isSurvive}">
        <form action="/restart" method="post">
            <button>Игра окончена. Начать сначала.</button>
        </form>
    </c:when>
    <c:otherwise>
        <form action="/game_logic" method="get">
            <button name="number" value="${nxt}">${btn1}</button>
        </form>
        <form action="/game_logic" method="get">
            <button name="number" value="${end}">${btn2}</button>
        </form>
    </c:otherwise>
</c:choose>
</body>
</html>

