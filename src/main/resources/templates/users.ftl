<html>
<head>
    <title>Title</title>
    <link href="../static/css/styles.css" rel="stylesheet" type="text/css">
</head>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already in System!
    </div>
    <table>
        <tr>
            <th>Login</th>
            <th>Password</th>
        </tr>
        <#list usersFromServer as user>
            <tr>
                <td>${user.userId}</td>
                <td>${user.login}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>