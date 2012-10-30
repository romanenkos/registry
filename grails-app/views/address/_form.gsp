<%@ page import="registry.Address" %>
<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'kind', 'error')} ">
    <label for="kind">Тип (вул. пров. тощо)</label>
    <g:textField name="kind" maxlength="500" value="${addressInstance?.kind}"/>
</div>
<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'street', 'error')} ">
    <label for="street">Назва</label>
    <g:textField name="street" value="${addressInstance?.street}"/>
</div>
<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'street', 'error')} ">
    <label for="street">Номера</label>
    <g:textArea name="numbers" cols="50" rows="2" maxlength="500" value="${addressInstance?.numbers}"/>
</div>
<g:hiddenField name="district.id" value="${addressInstance?.district?.id}"/>

