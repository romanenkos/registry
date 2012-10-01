<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Дiльницi</title>
</head>
<body>
<g:render template="/shared/navigtion"/>
<div id="" class="content scaffold-list" role="main">
    <h1>Дiльницi</h1>
    <table>
        <thead>
        <tr>
            <th>№</th>
            <th>Адреси</th>
            <th>Лiкарi</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${districts}" status="d" var="district">
            <tr class="${(d % 2) == 0 ? 'even' : 'odd'}">
                <td>${district.number}</td>
                <td>
                    <g:each in="${district.addresses}" status="a" var="address">
                        ${address.address} ${a < (district.addresses.size() - 1) ? '<br/> ' : ''}
                    </g:each>
                </td>
                <td>
                    <g:each in="${district.doctors}" status="doc" var="doctor">
                        <g:link controller="searchDoctor" action="scheduleById" id="${doctor.id}">${doctor.fullName}</g:link> ${doc < (district.doctors.size() - 1) ? '<br/> ' : ''}
                    </g:each>
                </td>
                <td>
                    <g:link controller="district" action="edit" id="${district.id}">Редагувати</g:link>
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>
