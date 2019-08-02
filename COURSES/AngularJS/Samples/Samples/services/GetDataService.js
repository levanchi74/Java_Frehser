myApp.service("GetDataService", ["$http", "$q", function ($http, $q) {
    return {
        getDataFromInternet: function() {
            var deferred = $q.defer();
            
            $http({
                method: 'GET',
                url: 'https://api.github.com/users/mralexgray/repos'
            }).then(
                function successCallback(value) {
                    deferred.resolve(value);
                },
                function errorCallback(reason) {
                    deferred.reject(reason);
                },
                function notifyCallback(value) {
                    deferred.notify(value);
                }
            );
            
            return deferred.promise;
        }
    };
}]);
