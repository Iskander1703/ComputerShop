var app = angular.module('motherBoards', []);

app.controller("motherBoardsController", function ($scope, $http) {

    $scope.successGetMotherBoardsCallback = function (response) {
        $scope.motherBoardList = response.data;
        $scope.errormessage="";
    };

    $scope.errorGetMotherBoardsCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to get list of Mother Boards";
    };

    $scope.getMotherBoards = function () {
        $http.get('/mcga/api/motherBoards').then($scope.successGetMotherBoardsCallback, $scope.errorGetMotherBoardsCallback);
    };

    $scope.successDeleteMotherBoardCallback = function (response) {
        for (var i = 0; i < $scope.motherBoardList.length; i++) {
            var j = $scope.motherBoardList[i];
            if (j.id === $scope.deletedId) {
                $scope.motherBoardList.splice(i, 1);
                break;
            }
        }
        $scope.errormessage="";
    };

    $scope.errorDeleteMotherBoardCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to delete Mother Boards; check if there are any related records exist. Such records should be removed first";
    };

    $scope.deleteMotherBoard = function (id) {
        $scope.deletedId = id;
        $http.delete('/mcga/api/deleteMotherBoard/' + id).then($scope.successDeleteMotherBoardCallback, $scope.errorDeleteMotherBoardCallback);
    };

    $scope.successAddMotherBoardCallback = function (response) {
        $http.get('/mcga/api/motherBoards').then($scope.successGetMotherBoardsCallback, $scope.errorGetMotherBoardsCallback);
        $scope.errormessage="";
    };

    $scope.errorAddMotherBoardCallback = function (error) {
        console.log(error);
        $scope.errormessage="Impossible to add new Mother Boards; check if it's number is unique";
    };

    $scope.addMotherBoard = function () {
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
            url:'/mcga/api/motherBoard',
            data: JSON.stringify(JSONObject),
        }).then($scope.successAddMotherBoardCallback, $scope.errorAddMotherBoardCallback);
    };

});