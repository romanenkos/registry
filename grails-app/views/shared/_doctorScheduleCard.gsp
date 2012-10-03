<table>
    <thead>
    <tr>
        <th colspan="3">${doctor?.speciality?.getName()}&nbsp;${doctor?.fullName}</th></tr>
    <tr>
        <th>Звичайний розклад роботи</th>
        <th>Найближчі корегування</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <tr class="even">
        <td>
            <g:render template="/shared/doctorRegularSchedule" model="[doctor: doctor]"/>
        </td>
        <td>
            <g:render template="/shared/doctorIrregularSchedule" model="[doctor: doctor]"/>
        </td>
    </tr>
    <tr>
        <td>
            <g:link action="createRegular" id="${doctor?.id}">Додати/Редагувати запис розкладу</g:link><br/>

        </td>
        <td>
            <g:link action="createIrregular" id="${doctor?.id}">Додати/Змінити корегування розкладу</g:link><br/>
        </td>
    </tr>
    </tbody>
</table>
