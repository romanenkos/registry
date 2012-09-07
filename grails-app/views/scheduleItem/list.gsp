<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Розклад роботи лікарів</title>
</head>

<body>
<g:render template="/shared/navigtion"/>
<div id="" class="content scaffold-list" role="main">
    <h1>Розклад роботи лікарів</h1>
    <g:render template="/shared/doctorScheduleCard" collection="${specialists}" var="doctor"/>
    <div class="pagination">
        <g:paginate total="${specialistsTotal}"/>
    </div>
</div>
</body>
</html>