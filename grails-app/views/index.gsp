<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Главная</title>
</head>

<body>
<g:render template="/shared/navigtion"/>
<g:render template="/shared/searchByAddressForm"/>
<g:render template="/shared/searchByNameForm"/>

<table>
    <tr>
        <td>
            <div id="controller-list" role="navigation">
                <h2>Available Controllers:</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName }}">
                        <li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
                    </g:each>
                </ul>
            </div>
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>