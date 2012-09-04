<%@ page import="registry.ScheduleItem" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>${specialist.speciality.name},&nbsp;${specialist.fullName}. Графiк роботи.</title>
</head>
<body>
<g:render template="/shared/navigtion"/>
<div id="list-scheduleItem" class="content scaffold-list" role="main">
    <h1>Спецiалiзацiя: ${specialist.speciality.name}</h1>
    <h1>ПIБ: ${specialist.fullName}</h1>
    <g:render template="/shared/doctorSchedule" model="[doctor: specialist]" />
</div>
</body>
</html>
