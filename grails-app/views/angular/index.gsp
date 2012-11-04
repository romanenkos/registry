<%@ page contentType="text/html;charset=UTF-8" %>
<html ng-app="MyApp">
<head>
    <r:require modules="angularTestCoffee"/>
    <r:layoutResources/>
</head>

<body>
<div class="container-fluid" ng-controller="DoctorsListCtrl">
    <div class="row-fluid">
        <div class="span2">
            <!--Sidebar content-->
            Search: <input ng-model="query" ng-click="showSchedule()">
        </div>
        <table border="1">
            <tr>
                <td>
                    <div class="span10" style="overflow-y: scroll;">
                        <ul class="doctors">
                            <li ng-repeat="doctor in doctors | filter:query" ng-click="showSchedule(doctor.id)">
                                {{doctor.lastName}}&nbsp;{{doctor.firstName}}&nbsp;{{doctor.middleName}}
                            </li>
                        </ul>
                    </div>
                </td>
                <td style="vertical-align: top">
                    <ul class="scheduleItems">
                        <li ng-repeat="item in scheduleItems">
                            {{item.day}}&nbsp;{{item.workingTime}}&nbsp;{{item.room}}
                        </li>
                    </ul>
                <td>
            <tr>
        </table>
    </div>
</div>
</body>
<r:layoutResources/>
</html>