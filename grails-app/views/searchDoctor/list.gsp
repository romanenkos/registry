<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Спеціалісти</title>
</head>
<body>
<g:render template="/shared/navigtion"/>
<div id="" class="content scaffold-list" role="main">
    <h1>Спеціалісти</h1>
    <table>
        <thead>
        <tr>
            <th>Спеціалізація</th>
            <th>П.І.Б</th>
            <th></th>
            <sec:ifLoggedIn>
                <th></th>
            </sec:ifLoggedIn>
        </tr>
        </thead>
        <tbody>
        <g:each in="${specialists}" status="i" var="item">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                <td>${item.speciality.name}</td>
                <td>${item.fullName}</td>
                <td><g:link controller="searchDoctor" action="scheduleById" id="${item.id}">Графiк роботи</g:link></td>
                <sec:ifLoggedIn>
                    <td><g:link controller="doctor" action="edit" id="${item.id}">Редагувати</g:link></td>
                </sec:ifLoggedIn>

            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>
