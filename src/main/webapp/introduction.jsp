<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="base.css" rel="stylesheet">
    <meta charset="UTF-8"/>
    <title>Contagion</title>
</head>
<body>
<img src="images/dacha.jpg" alt="dacha">
<p>${texts.getIntroduction()}</p>

<form action="/game_logic" method="get">
    <button name="number" value="1">Попытаться уснуть.</button>
</form>
<script src="bootstrap.bundle.min.js"></script>
</body>
</html>
