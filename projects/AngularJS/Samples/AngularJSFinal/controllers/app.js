app.controller('mainCtrl', function($scope, $http){
    
    $scope.data = {};

    $http.get('http://127.0.0.1:5500/AngularJSFinal/json/books.json').then(
        function(data){
            $scope.data.books = data.data;
        },
        function(err){
            $scope.data.error = err;
        }
    );
});
