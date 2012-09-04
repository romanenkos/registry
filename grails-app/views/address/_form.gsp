<%@ page import="registry.Address" %>



<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="address.address.label" default="Address" />
		
	</label>
	<g:textArea name="address" cols="40" rows="5" maxlength="500" value="${addressInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'district', 'error')} required">
	<label for="district">
		<g:message code="address.district.label" default="District" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="district" name="district.id" from="${registry.District.list()}" optionKey="id" required="" value="${addressInstance?.district?.id}" class="many-to-one"/>
</div>

