var app = angular.module('graphicsCards', []);

app.controller("graphicsCardsController", function ($scope, $http) {

    $scope.successGetGraphicsCardsCallback = function (response) {
        $scope.graphicsCardList = response.data;
        $scope.errormessage="";
    };

    $scope.errorGetGraphicsCardsCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to get list of Graphics Card";
    };

    $scope.getGraphicsCards = function () {
        $http.get('/mcga/api/graphicsCards').then($scope.successGetGraphicsCardsCallback, $scope.errorGetGraphicsCardsCallback);
    };

    $scope.successDeleteGraphicsCardCallback = function (response) {
        for (var i = 0; i < $scope.graphicsCardList.length; i++) {
            var j = $scope.graphicsCardList[i];
            if (j.id === $scope.deletedId) {
                $scope.graphicsCardList.splice(i, 1);
                break;
            }
        }
        $scope.errormessage="";
    };

    $scope.errorDeleteGraphicsCardCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to delete GraphicsCard; check if there are any related records exist. Such records should be removed first";
    };

    $scope.deleteGraphicsCard = function (id) {
        $scope.deletedId = id;
        $http.delete('/mcga/api/deleteGraphicsCard/' + id).then($scope.successDeleteGraphicsCardCallback, $scope.errorDeleteGraphicsCardCallback);
    };

    $scope.successAddGraphicsCardCallback = function (response) {
        $http.get('/mcga/api/graphicsCards').then($scope.successGetGraphicsCardsCallback, $scope.errorGetGraphicsCardsCallback);
        $scope.errormessage="";
    };

    $scope.errorAddGraphicsCardCallback = function (error) {
        console.log(error);
        $scope.errormessage="Impossible to add new Graphics Card; check if it's number is unique";
    };

    $scope.addGraphicsCard = function () {
        var JSONObject =
            {
                "company":$scope.inputcompany,
                "model":$scope.inputmodel,
                "price":$scope.inputprice,
                "amount":$scope.inputamoutn
            }
        // var jsonData = JSON.parse( JSONObject );
        return $http({
            method: 'POST',
            url:'/mcga/api/graphicsCard',
            data: JSON.stringify(JSONObject),
        }).then($scope.successAddGraphicsCardCallback, $scope.errorAddGraphicsCardCallback);
    };

});