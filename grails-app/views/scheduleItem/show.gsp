
<%@ page import="registry.ScheduleItem" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'scheduleItem.label', default: 'ScheduleItem')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-scheduleItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-scheduleItem" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list scheduleItem">
			
				<g:if test="${scheduleItemInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="scheduleItem.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:formatDate date="${scheduleItemInstance?.date}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${scheduleItemInstance?.day}">
				<li class="fieldcontain">
					<span id="day-label" class="property-label"><g:message code="scheduleItem.day.label" default="Day" /></span>
					
						<span class="property-value" aria-labelledby="day-label"><g:fieldValue bean="${scheduleItemInstance}" field="day"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${scheduleItemInstance?.doctor}">
				<li class="fieldcontain">
					<span id="doctor-label" class="property-label"><g:message code="scheduleItem.doctor.label" default="Doctor" /></span>
					
						<span class="property-value" aria-labelledby="doctor-label"><g:link controller="doctor" action="show" id="${scheduleItemInstance?.doctor?.id}">${scheduleItemInstance?.doctor?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${scheduleItemInstance?.room}">
				<li class="fieldcontain">
					<span id="room-label" class="property-label"><g:message code="scheduleItem.room.label" default="Room" /></span>
					
						<span class="property-value" aria-labelledby="room-label"><g:fieldValue bean="${scheduleItemInstance}" field="room"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${scheduleItemInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="scheduleItem.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${scheduleItemInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${scheduleItemInstance?.workingTime}">
				<li class="fieldcontain">
					<span id="workingTime-label" class="property-label"><g:message code="scheduleItem.workingTime.label" default="Working Time" /></span>
					
						<span class="property-value" aria-labelledby="workingTime-label"><g:fieldValue bean="${scheduleItemInstance}" field="workingTime"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${scheduleItemInstance?.id}" />
					<g:link class="edit" action="edit" id="${scheduleItemInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
