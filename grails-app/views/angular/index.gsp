<%@ page contentType="text/html;charset=UTF-8" %>
<html ng-app>
<head>
    <script language="JavaScript" src="${resource(dir: 'js', file: 'angular.js')}"></script>
    <script language="JavaScript" src="${resource(dir: 'js', file: 'angular-resource.js')}"></script>
    <script language="JavaScript" src="${resource(dir: 'js', file: 'controllers.js')}"></script>
    <title></title>
</head>

<body ng-controller="DoctorsListController">
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            <!--Sidebar content-->

            Search: <input ng-model="query">

        </div>
        <table>
            <tr>
                <td>
                    <div class="span10">
                        <!--Body content-->

                        <ul class="doctors">
                            <li ng-repeat="doctor in doctors | filter:query">
                                <span ng-src="{{doctor.id}}"
                                      ng-click="showSchedule(doctor.id)">{{doctor.lastName}}&nbsp;{{doctor.firstName}}&nbsp;{{doctor.middleName}}</span>

                            </li>
                        </ul>
                    </div>
                </td>
                <td>
                    <div>
                        <ul class="scheduleItems">
                            <li ng-repeat="item in scheduleItems">
                                {{item.day}}&nbsp;{{item.workingTime}}&nbsp;{{item.room}}

                            </li>
                        </ul>
                    </div>
                <td>
            <tr>
        </table>
    </div>
</div>
</body>
</html>