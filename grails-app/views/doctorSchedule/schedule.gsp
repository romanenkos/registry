<%@ page import="registry.ScheduleItem" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Schedule for doctor ${doctor.fullName}</title>
</head>
<body>
<g:render template="/shared/navigtion"/>
<div id="list-scheduleItem" class="content scaffold-list" role="main">
    <h1>Schedule for doctor ${doctor.fullName}</h1>
    <table>
        <thead>
        <tr>
            <th>Day</th>
            <th>Room</th>
            <th>WorkingTime</th>
            <th>Date</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${items}" status="i" var="item">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                <td>${item.day}</td>
                <td>${item.room}</td>
                <td>${item.workingTime}</td>
                <td><g:formatDate format="dd-MM-yyyy" date="${item.date}"/></td>
            </tr>
        </g:each>
        <tr>
            <td colspan="3">
                <g:if test="${w > 0}">
                    <g:link action="schedule" params="[id: doctor.id, w: w - 1]">Back</g:link>
                </g:if>
                <g:link action="schedule" params="[id: doctor.id, w: w + 1]">Forward</g:link>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
