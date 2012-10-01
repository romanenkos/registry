<%@ page import="registry.Address" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'address.label', default: 'Address')}" />
		<title>Додати адресу до дільниці № ${addressInstance?.district?.id}</title>
	</head>
	<body>

    <g:render template="/shared/navigtion"/>
		<div id="create-address" class="content scaffold-create" role="main">
			<h1>Додати адресу до дільниці № ${addressInstance?.district?.id}</h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${addressInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${addressInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form action="save" >
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="save" value="Додати" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
