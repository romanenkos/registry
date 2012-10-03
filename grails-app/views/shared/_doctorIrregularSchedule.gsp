<%@ page import="registry.Doctor" %>
<table>
    <thead>
    <tr>
        <th>Дата</th>
        <th>Часи прийому</th>
        <th>№ кабiнету</th>
    </tr>
    </thead>
    <tbody>
    <g:if test="${doctor?.getIrregularScheduleItems().size() <= 0}">
        <tr class="even" ><td colspan="3">Змін у розкладі не передбачається</td></tr>
    </g:if>
    <g:each in="${doctor?.getIrregularScheduleItems()}" status="i" var="item">
        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
            <td>${item.date}</td>
            <td>${item.workingTime}</td>
            <td>${item.room}</td>
        </tr>
    </g:each>
    </tbody>
</table>