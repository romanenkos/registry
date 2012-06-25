<%@ page import="registry.ScheduleItem" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>
        <g:if test="${address}">
            Results for address: ${address.address}
        </g:if>
        <g:else>
            Type address to find doctors for your district
        </g:else>
    </title>
</head>

<body>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>

<div id="searchForm" class="content" role="main">
    <g:form action="search" method="GET">
        <g:textField title="Address" name="address"/>
        <g:submitButton title="Search" name="submit"/>
    </g:form>
</div>

<g:if test="${district}">
    <div id="result" class="content">
        <h1>Doctors for district: ${district.number}</h1>
        <table>
            <thead>
            <tr>
                <th>Doctor</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${district.doctors}" status="i" var="item">
                <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                    <td>${item.fullName}</td>
                </tr>
            </g:each>
            </tbody>
        </table>
    </div>
</g:if>
</body>
</html>
