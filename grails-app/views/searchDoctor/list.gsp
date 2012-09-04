<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Специалисты</title>
</head>
<body>
<g:render template="/shared/navigtion"/>
<div id="" class="content scaffold-list" role="main">
    <h1>Специалисты</h1>
    <table>
        <thead>
        <tr>
            <th>Специализация</th>
            <th>Ф.И.О</th>
            <th>Расписание</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${specialists}" status="i" var="item">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                <td>${item.speciality.name}</td>
                <td>${item.fullName}</td>
                <td><g:link controller="searchDoctor" action="scheduleById" id="${item.id}">Графiк роботи</g:link></td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>
