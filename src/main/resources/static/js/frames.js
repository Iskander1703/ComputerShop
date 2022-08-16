

var app = angular.module('frames', []);

app.controller("framesController", function ($scope, $http) {

    $scope.successGetFramesCallback = function (response) {
        $scope.frameList = response.data;
        $scope.errormessage="";
    };

    $scope.errorGetFramesCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to get list of frames";
    };

    $scope.getFrames = function () {
        $http.get('/mcga/api/frames').then($scope.successGetFramesCallback, $scope.errorGetFramesCallback);
    };

    $scope.successDeleteFrameCallback = function (response) {
        for (var i = 0; i < $scope.frameList.length; i++) {
            var j = $scope.frameList[i];
            if (j.id === $scope.deletedId) {
                $scope.frameList.splice(i, 1);
                break;
            }
        }
        $scope.errormessage="";
    };

    $scope.errorDeleteFrameCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to delete Frame; check if there are any related records exist. Such records should be removed first";
    };

    $scope.deleteFrame = function (id) {
        $scope.deletedId = id;
        $http.delete('/mcga/api/deleteFrame/' + id).then($scope.successDeleteFrameCallback, $scope.errorDeleteFrameCallback);
    };

    $scope.successAddFrameCallback = function (response) {
        $http.get('/mcga/api/frames').then($scope.successGetFramesCallback, $scope.errorGetFramesCallback);
        $scope.errormessage="";
    };

    $scope.errorAddFrameCallback = function (error) {
        console.log(error);
        $scope.errormessage="Impossible to add new frame; check if it's number is unique";
    };

    $scope.addFrame = function () {
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
            url:'/mcga/api/frames',
            data: JSON.stringify(JSONObject),
        }).then($scope.successAddFrameCallback, $scope.errorAddFrameCallback);
    };

});
