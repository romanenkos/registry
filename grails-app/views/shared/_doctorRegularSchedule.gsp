<%@ page import="registry.Doctor" %>
<table>
    <thead>
    <tr>
        <th>День тижня</th>
        <th>Часи прийому</th>
        <th>№ кабiнету</th>
    </tr>
    </thead>
    <tbody>
    <g:if test="${doctor.getRegularScheduleItems().size() <= 0}">
        <tr class="even" ><td colspan="3">Нажаль графiк роботи лiкаря на данний момент не вiдомий</td></tr>
    </g:if>
    <g:each in="${doctor.getRegularScheduleItems()}" status="i" var="item">
        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
            <td>${item.day.name}</td>
            <td>${item.workingTime}</td>
            <td>${item.room}</td>
        </tr>
    </g:each>
    </tbody>
</table>