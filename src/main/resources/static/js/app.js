
var app = angular.module('app', []);

app.controller('ExampleController', function ExampleController($scope) {
	
    $scope.users = [
        {
            name: 'Michael Boren',
            city: 'Memphis',
            state: 'Tennessee'
        }, {
            name: 'Dillon Callis',
            city: 'Memphis',
            state: 'Tennessee'
        }, {
            name: 'Dave Chris',
            city: 'Anchorage',
            state: 'Alaska'
        }
    ];
    
    $scope.myCustomFunction = () =>
    {
    	return "THIS FUNCTION HAS BEEN EXECUTED";
    }
    
});