
var app = angular.module('app', []);

app.controller('ExampleController', function ExampleController($scope, $http) {


    $http.get('user/allUsers')
        .then(function(all) {
            $scope.users = all.data;
        });

});