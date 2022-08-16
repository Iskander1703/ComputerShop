var app = angular.module('rams', []);

app.controller("ramsController", function ($scope, $http) {

    $scope.successGetRamsCallback = function (response) {
        $scope.ramList = response.data;
        $scope.errormessage="";
    };

    $scope.errorGetRamsCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to get list of rams";
    };

    $scope.getRams = function () {
        $http.get('/mcga/api/rams').then($scope.successGetRamsCallback, $scope.errorGetRamsCallback);
    };

    $scope.successDeleteRamCallback = function (response) {
        for (var i = 0; i < $scope.ramList.length; i++) {
            var j = $scope.ramList[i];
            if (j.id === $scope.deletedId) {
                $scope.ramList.splice(i, 1);
                break;
            }
        }
        $scope.errormessage="";
    };

    $scope.errorDeleteRamCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to delete Ram; check if there are any related records exist. Such records should be removed first";
    };

    $scope.deleteRam = function (id) {
        $scope.deletedId = id;
        $http.delete('/mcga/api/deleteRam/' + id).then($scope.successDeleteRamCallback, $scope.errorDeleteRamCallback);
    };

    $scope.successAddRamCallback = function (response) {
        $http.get('/mcga/api/rams').then($scope.successGetRamsCallback, $scope.errorGetRamsCallback);
        $scope.errormessage="";
    };

    $scope.errorAddRamCallback = function (error) {
        console.log(error);
        $scope.errormessage="Impossible to add new Ram; check if it's number is unique";
    };

    $scope.addRam = function () {
        var JSONObject =
            {
                "company":$scope.inputcompany,
                "model":$scope.inputmodel,
                "type":$scope.inputtype,
                "size":$scope.inputsize,
                "price":$scope.inputprice,
                "amount":$scope.inputamoutn
            }
        // var jsonData = JSON.parse( JSONObject );
        return $http({
            method: 'POST',
            url:'/mcga/api/rams',
            data: JSON.stringify(JSONObject),
        }).then($scope.successAddRamCallback, $scope.errorAddRamCallback);
    };

});