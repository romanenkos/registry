function DoctorsListController($scope, $http) {
    $http.get('doctors').success(function (data) {
        $scope.doctors = data;
    });

    $scope.showSchedule = function (doctorId) {
        if (undefined != doctorId) {
            $http.get('schedule/' + doctorId).success(function (data) {
                $scope.scheduleItems = data;
            });
        } else {
            $scope.scheduleItems = '';
        }

    }

}