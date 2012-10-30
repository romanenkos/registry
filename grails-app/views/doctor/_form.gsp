<%@ page import="registry.Doctor" %>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'lastName', 'error')} ">
    <label for="lastName">
        <g:message code="doctor.lastName.label" default="Last Name"/>

    </label>
    <g:textField name="lastName" value="${doctorInstance?.lastName}"/>
</div>
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'firstName', 'error')} ">
    <label for="firstName">
        <g:message code="doctor.firstName.label" default="First Name"/>

    </label>
    <g:textField name="firstName" value="${doctorInstance?.firstName}"/>
</div>


<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'middleName', 'error')} ">
    <label for="middleName">
        <g:message code="doctor.middleName.label" default="Middle Name"/>

    </label>
    <g:textField name="middleName" value="${doctorInstance?.middleName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'speciality', 'error')} required">
    <label for="speciality">
        <g:message code="doctor.speciality.label" default="Speciality"/>
        <span class="required-indicator">*</span>
    </label>
    <g:render template="/shared/specialitySelect" model="['doctorInstance' : doctorInstance]"/>
</div>
<div>
    %{--<g:link controller="scheduleItem" action="editForDoctor" id="${doctorInstance?.id}">Редагувати розклад роботи</g:link>--}%
    <g:render template="scheduleItems"/>
</div>

