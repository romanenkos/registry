app = angular.module 'MyApp', []

app.controller 'DoctorsListCtrl', ($scope, $http) ->
    $http.get('doctors').success (data) -> $scope.doctors = data
    $scope.showSchedule = (doctorId) ->
      $http.get("schedule/#{doctorId}").success (data) -> $scope.scheduleItems = data
