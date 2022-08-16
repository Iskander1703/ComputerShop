var app = angular.module('powerUnits', []);

app.controller("powerUnitsController", function ($scope, $http) {

    $scope.successGetPowerUnitCallback = function (response) {
        $scope.powerUnitList = response.data;
        $scope.errormessage="";
    };

    $scope.errorGetPowerUnitCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to get list of rams";
    };

    $scope.getPowerUnits = function () {
        $http.get('/mcga/api/powerUnits').then($scope.successGetPowerUnitCallback, $scope.errorGetPowerUnitCallback);
    };

    $scope.successDeletePowerUnitCallback = function (response) {
        for (var i = 0; i < $scope.powerUnitList.length; i++) {
            var j = $scope.powerUnitList[i];
            if (j.id === $scope.deletedId) {
                $scope.powerUnitList.splice(i, 1);
                break;
            }
        }
        $scope.errormessage="";
    };

    $scope.errorDeletePowerUnitCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to delete PowerUnit; check if there are any related records exist. Such records should be removed first";
    };

    $scope.deletePowerUnit = function (id) {
        $scope.deletedId = id;
        $http.delete('/mcga/api/deletePowerUnit/' + id).then($scope.successDeletePowerUnitCallback, $scope.errorDeletePowerUnitCallback);
    };

    $scope.successAddPowerUnitCallback = function (response) {
        $http.get('/mcga/api/powerUnits').then($scope.successGetPowerUnitCallback, $scope.errorGetPowerUnitCallback);
        $scope.errormessage="";
    };

    $scope.errorAddPowerUnitCallback = function (error) {
        console.log(error);
        $scope.errormessage="Impossible to add new PowerUnit; check if it's number is unique";
    };

    $scope.addPowerUnit = function () {
        var JSONObject =
            {
                "company":$scope.inputcompany,
                "model":$scope.inputmodel,
                "power":$scope.inputpower,
                "price":$scope.inputprice,
                "amount":$scope.inputamoutn
            }
        // var jsonData = JSON.parse( JSONObject );
        return $http({
            method: 'POST',
            url:'/mcga/api/powerUnit',
            data: JSON.stringify(JSONObject),
        }).then($scope.successAddPowerUnitCallback, $scope.errorAddPowerUnitCallback);
    };

});