var app = angular.module("crudApp",[]);
console.log(app);
app.controller('crudCtrl',['$scope', function($scope){

    if(localStorage.getItem('users') === null){
        $scope.users = [
            {id: 1, firstName:"chi",lastName: "le"},
            {id: 2, firstName:"tho",lastName: "huynh"},
            {id: 3, firstName:"tai",lastName: "le"},
        ];
        localStorage.setItem("users",JSON.stringify($scope.users));
    }else{
        $scope.users = JSON.parse(localStorage.getItem('users'));
    }

}]);