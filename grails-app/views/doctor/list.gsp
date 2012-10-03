
<%@ page import="registry.Speciality; registry.Doctor" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'doctor.label', default: 'Doctor')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-doctor" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
    <g:render template="/shared/navigtion" model="[create: true]"/>


		<div id="list-doctor" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>

                        <g:sortableColumn property="lastName" title="${message(code: 'doctor.lastName.label', default: 'Last Name')}" />
						<g:sortableColumn property="firstName" title="${message(code: 'doctor.firstName.label', default: 'First Name')}" />

						<g:sortableColumn property="middleName" title="${message(code: 'doctor.middleName.label', default: 'Middle Name')}" />
					
						<g:sortableColumn property="speciality" title="${message(code: 'doctor.speciality.label', default: 'Speciality')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${doctorInstanceList}" status="i" var="doctorInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                        <td>${fieldValue(bean: doctorInstance, field: "lastName")}</td>
						<td><g:link action="edit" id="${doctorInstance.id}">${fieldValue(bean: doctorInstance, field: "firstName")}</g:link></td>

                        <td>${fieldValue(bean: doctorInstance, field: "middleName")}</td>
					
						<td>${doctorInstance.speciality?.getName()}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${doctorInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
