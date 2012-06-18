<%@ page import="registry.ScheduleItem" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Schedule for doctor ${doctor.fullName}</title>
</head>
<body>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create">QWE</g:link></li>
    </ul>
</div>
<div id="list-scheduleItem" class="content scaffold-list" role="main">
    <h1>Schedule for doctor ${doctor.fullName}</h1>
    <table>
        <thead>
        <tr>
            <th>Day</th>
            <th>From</th>
            <th>To</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${items}" status="i" var="item">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                <td>${item.day}</td>
                <td>${item.from}</td>
                <td>${item.to}</td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>
