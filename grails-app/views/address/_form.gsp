<%@ page import="registry.Address" %>
<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'address', 'error')} ">
    <label for="address">Адреса</label>
    <g:textArea name="address" cols="50" rows="2" maxlength="500" value="${addressInstance?.address}"/>
</div>
<g:hiddenField name="district.id" value="${addressInstance?.district?.id}"/>

