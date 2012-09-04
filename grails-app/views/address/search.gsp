<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Адреси</title>
</head>
<body>
<g:render template="/shared/navigtion"/>
<div id="" class="content scaffold-list" role="main">
    <h1>Адреси</h1>
    <table>
        <thead>
        <tr>
            <th>Виберіть відповідну адресу</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${addresses}" status="a" var="address">
            <tr class="${(a % 2) == 0 ? 'even' : 'odd'}">
                <td><g:link controller="searchDoctor" action="scheduleByDistrict" id="${address.district.id}">${address.address}</g:link></td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>
