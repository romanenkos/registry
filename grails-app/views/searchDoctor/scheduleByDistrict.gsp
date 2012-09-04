<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Розклад роботи лікарів</title>
</head>
<body>
<g:render template="/shared/navigtion"/>
<div id="" class="content scaffold-list" role="main">
    <h1>Розклад роботи лікарів для дільниці № ${district.number}</h1>
    <table>
        <thead>
        <tr>
            <th>ПІБ</th>
            <th>Розклад роботи</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${district.doctors}" status="d" var="doctor">
            <tr class="${(d % 2) == 0 ? 'even' : 'odd'}">
                <td>${doctor.fullName}</td>
                <td>
                    <g:render template="/shared/doctorSchedule" model="[doctor: doctor]" />
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>
