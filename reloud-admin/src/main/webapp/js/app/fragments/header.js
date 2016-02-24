(function(){
    var header = angular.module("header",[]);

    header.directive("headerTpl",function(){
        return {
            restrict:"E",
            templateUrl:"templates/fragments/header.html",
            controller:function($scope){

            }
        };
    });
})(window);