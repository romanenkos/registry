<table>
    <thead>
    <tr>
        <th>Пошук за адресою</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>
            <div id="searchForm" class="content" role="main">
                <g:form controller="address" action="search" method="GET">
                    Введіть назву вулиці або провулка <g:textField title="Назва вулиці" name="address"/>
                    <g:submitButton title="Search" name="submit"/>
                </g:form>
            </div>
        </td>
    </tr>
    </tbody>
</table>