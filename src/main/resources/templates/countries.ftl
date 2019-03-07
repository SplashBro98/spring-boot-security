<html>
<head>
    <title>Title</title>
    <link href="../css/styles.css" rel="stylesheet" type="text/css">
</head>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already in System!
    </div>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
        </tr>
        <#list countriesFromServer as country>
            <tr>
                <td>${country.countryId}</td>
                <td>${country.name}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>