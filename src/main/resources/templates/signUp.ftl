<#ftl encoding='UTF-8'>
<html>
<head>
    <link href="../static/css/styles.css" rel="stylesheet">
    <link href="../static/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please SignUp!
    </div>
    <form method="post" action="/signUp">
        <label for="login">Login
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <br>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <br>
        <label for="remember-me">
            <input type="checkbox" id="remember-me" name="remember-me">Запомнить меня</label>
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>