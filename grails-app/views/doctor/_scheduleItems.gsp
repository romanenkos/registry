
<g:hiddenField name="scheduleItems[0].day" value="${registry.DayOfWeek.MON}"/>
<g:hiddenField name="scheduleItems[1].day" value="${registry.DayOfWeek.TUE}"/>
<g:hiddenField name="scheduleItems[2].day" value="${registry.DayOfWeek.WED}"/>
<g:hiddenField name="scheduleItems[3].day" value="${registry.DayOfWeek.THU}"/>
<g:hiddenField name="scheduleItems[4].day" value="${registry.DayOfWeek.FRI}"/>

<table border="1">
    <tr>
        <td rowspan="2" width="10%">День тижня</td>
        <td colspan="2" width="45%">Поточний тиждень</td>
        %{--<td colspan="2" width="45%">Наступний тиждень</td>--}%
    </tr>
    <tr>
        <td width="35%">Час прийому</td>
        <td width="10%">Кабінет</td>
        %{--<td width="35%">Час прийому</td>--}%
        %{--<td width="10%">Кабінет</td>--}%
    </tr>
    <tr>
        <td>ПН.${doctorInstance?.scheduleItems[0]?.day}</td>
        <td><g:textField name="scheduleItems[0].workingTime" value="${doctorInstance?.scheduleItems[0]?.workingTime}"/></td>
        <td><g:textField name="scheduleItems[0].room" value="${doctorInstance?.scheduleItems[0]?.room}"/></td>
        %{--<td><g:textField name="scheduleItems[0].workingTimeNext" value="${doctorInstance?.scheduleItems[0]?.workingTimeNext}"/></td>--}%
        %{--<td><g:textField name="scheduleItems[0].roomNext" value="${doctorInstance?.scheduleItems[0]?.roomNext}"/></td>--}%
    </tr>
    <tr>
        <td>ВТ. ${doctorInstance?.scheduleItems[1]?.day}</td>
        <td><g:textField name="scheduleItems[1].workingTime" value="${doctorInstance?.scheduleItems[1]?.workingTime}"/></td>
        <td><g:textField name="scheduleItems[1].room" value="${doctorInstance?.scheduleItems[1]?.room}"/></td>
        %{--<td><g:textField name="scheduleItems[1].workingTimeNext" value="${doctorInstance?.scheduleItems[1]?.workingTimeNext}"/></td>--}%
        %{--<td><g:textField name="scheduleItems[1].roomNext" value="${doctorInstance?.scheduleItems[1]?.roomNext}"/></td>--}%
    </tr>
    <tr>
        <td>СР. ${doctorInstance?.scheduleItems[2]?.day}</td>
        <td><g:textField name="scheduleItems[2].workingTime" value="${doctorInstance?.scheduleItems[2]?.workingTime}"/></td>
        <td><g:textField name="scheduleItems[2].room" value="${doctorInstance?.scheduleItems[2]?.room}"/></td>
        %{--<td><g:textField name="scheduleItems[2].workingTimeNext" value="${doctorInstance?.scheduleItems[2]?.workingTimeNext}"/></td>--}%
        %{--<td><g:textField name="scheduleItems[2].roomNext" value="${doctorInstance?.scheduleItems[2]?.roomNext}"/></td>--}%
    </tr>
    <tr>
        <td>ЧТ. ${doctorInstance?.scheduleItems[3]?.day}</td>
        <td><g:textField name="scheduleItems[3].workingTime" value="${doctorInstance?.scheduleItems[3]?.workingTime}"/></td>
        <td><g:textField name="scheduleItems[3].room" value="${doctorInstance?.scheduleItems[3]?.room}"/></td>
        %{--<td><g:textField name="scheduleItems[3].workingTimeNext" value="${doctorInstance?.scheduleItems[3]?.workingTimeNext}"/></td>--}%
        %{--<td><g:textField name="scheduleItems[3].roomNext" value="${doctorInstance?.scheduleItems[3]?.roomNext}"/></td>--}%
    </tr>
    <tr>
        <td>ПТ. ${doctorInstance?.scheduleItems[4]?.day}</td>
        <td><g:textField name="scheduleItems[4].workingTime" value="${doctorInstance?.scheduleItems[4]?.workingTime}"/></td>
        <td><g:textField name="scheduleItems[4].room" value="${doctorInstance?.scheduleItems[4]?.room}"/></td>
        %{--<td><g:textField name="scheduleItems[4].workingTimeNext" value="${doctorInstance?.scheduleItems[4]?.workingTimeNext}"/></td>--}%
        %{--<td><g:textField name="scheduleItems[4].roomNext" value="${doctorInstance?.scheduleItems[4]?.roomNext}"/></td>--}%
    </tr>
</table>