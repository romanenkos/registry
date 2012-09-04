<table>
    <thead>
    <tr>
        <th>Пошук за прізвищем лікаря</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>
            <div id="searchForm" class="content" role="main">
                <g:form controller="searchDoctor" action="byLastName" method="GET">
                    Введіть прізвище лікаря <g:textField title="Прізвище" name="lastName"/>
                    <g:submitButton title="Search" name="submit"/>
                </g:form>
            </div>
        </td>
    </tr>
    </tbody>
</table>