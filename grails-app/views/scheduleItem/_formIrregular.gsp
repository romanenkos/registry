<%@ page import="registry.ScheduleItem" %>


<g:hiddenField name="type" value="${registry.ScheduleItemType.IRREGULAR}"/>
<div class="fieldcontain">
    <label for="doctor">Доктор
    </label>
    ${scheduleItemInstance?.doctor?.fullName}
    <g:hiddenField name="doctor.id" value="${scheduleItemInstance?.doctor?.id}"/>
</div>


<div class="fieldcontain ${hasErrors(bean: scheduleItemInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="scheduleItem.date.label" default="Date" />
        <span class="required-indicator">*</span>
	</label>
	<g:textField name="date"/>
</div>

<div class="fieldcontain ${hasErrors(bean: scheduleItemInstance, field: 'workingTime', 'error')} ">
    <label for="workingTime">
        <g:message code="scheduleItem.workingTime.label" default="Working Time" />

    </label>
    <g:textField name="workingTime" value="${scheduleItemInstance?.workingTime}"/>
</div>


<div class="fieldcontain ${hasErrors(bean: scheduleItemInstance, field: 'room', 'error')} ">
	<label for="room">
		<g:message code="scheduleItem.room.label" default="Room" />
		
	</label>
	<g:textField name="room" value="${scheduleItemInstance?.room}"/>
</div>