var app = angular.module("crudApp",["ngRoute"]);

app.config(function($routeProvider){
    $routeProvider
        .when("/",{
            templateUrl: "index.htm"
        })
        .when("/view",{
            templateUrl: "viewUser.htm"
        })
        .otherwise({
            redirectTo: "/"
        });
})

app.run(['$rootScope', function($rootScope) {
    $rootScope.users = [
        {id: 1, firstName:"chi",lastName: "le"},
        {id: 2, firstName:"tho",lastName: "huynh"},
        {id: 3, firstName:"tai",lastName: "le"},
    ];

    
}]);
app.controller('crudCtrl',['$scope', function($scope){

    if(localStorage.getItem('users') === null){
        localStorage.setItem("users",JSON.stringify($scope.users));
    }else{
        $scope.users = JSON.parse(localStorage.getItem('users'));
    }

}]);

app.controller('createUserCtrl',['$scope', function($scope){
    $scope.id = "";
    $scope.firstName="";
    $scope.lastName ="";
    $scope.addUser = function(){
        $scope.users.push({id: $scope.id, firstName: $scope.firstName, lastName: $scope.lastName});
    };

}]);