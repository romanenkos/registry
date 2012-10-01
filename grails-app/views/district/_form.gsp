<%@ page import="registry.District" %>


<g:hiddenField name="number" value="${districtInstance?.number}"/>
<div class="fieldcontain ${hasErrors(bean: districtInstance, field: 'doctors', 'error')} ">
    <label for="doctors">
        <g:message code="district.doctors.label" default="Doctors"/>

    </label>
    <g:select name="doctors" from="${registry.Doctor.list()}" multiple="multiple" optionKey="id" size="5"
              optionValue="fullName" value="${districtInstance?.doctors*.id}" class="many-to-many"/>
</div>


<div class="fieldcontain ${hasErrors(bean: districtInstance, field: 'addresses', 'error')} ">
    <label for="addresses">

    </label>
    <g:link controller="address" action="create" params="['district.id': districtInstance?.id]">Додати адресу</g:link>
    <table>
        <tr>
            <th>Адреса</th>
            <th></th>
            <th></th>
        </tr>
        <g:each in="${districtInstance?.addresses ?}" var="a">
            <tr>
                <td>${a?.address.encodeAsHTML()}</td>
                <td><g:link controller="address" action="edit" id="${a.id}">Редагувати</g:link></td>
                <td><g:link controller="address" action="delete" id="${a.id}">Видалити</g:link></td>
            </tr>
        </g:each>

    </table>

</div>




