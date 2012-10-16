<div class="nav" role="navigation">
    <ul>
        <li><g:link class="home" uri="/">Головна</g:link></li>
        <li><g:link class="list" controller="districts">Дiльниці</g:link></li>
        <li><g:link class="list" controller="searchDoctor" action="allDistrctDoctors">Дiльничі лікарі</g:link></li>
        <li><g:link class="list" controller="searchDoctor" action="allSpecialists">Спеціалісти</g:link></li>
        <li>
            <sec:ifLoggedIn><g:link controller='logout'><sec:username/> Вихід</g:link></sec:ifLoggedIn>
            <sec:ifNotLoggedIn><g:link controller='login' action='auth'>Вхід</g:link></sec:ifNotLoggedIn>
        </li>
    </ul>
<sec:ifLoggedIn>
    <ul>
        <li><g:link class="list" controller="scheduleItem" action="list">Редагування графіку роботи</g:link></li>
        <li><g:link class="list" controller="district" action="list">Редагування дільниць</g:link></li>
        <li><g:link class="list" controller="doctor" action="list">Редагування лікарів</g:link></li>
        <g:if test="${create}">
            <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
        </g:if>
        <li><g:link class="list" controller="backup" action="backup">Відіслати данні на пошту</g:link></li>
    </ul>
    </sec:ifLoggedIn>
</div>