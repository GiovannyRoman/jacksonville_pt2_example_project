angular.module('app').controller('UserDetailController', ['UserDetailService', '$routeParams', function(UserDetailService, $routeParams)
{
	
	var ctrl = this;
	
	UserDetailService.getUserDetails($routeParams.id).then(function(result){
		ctrl.user = result.data;
	});
	
}]);