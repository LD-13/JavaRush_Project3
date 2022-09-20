<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <link href="main.css" rel="stylesheet">
    <title>Contagion</title>
</head>
<body>
<h1>Welcome to contagion!</h1>
<img src="images/main_img.jpg" alt="Here should be a cool img">
<form action="/start" method="post">
    <label> Введите имя:
        <input type="text" name="name" placeholder="твоё имя будет...">
    </label>
    <input type="submit" value="Начать игру.">
</form>
</body>
</html>
