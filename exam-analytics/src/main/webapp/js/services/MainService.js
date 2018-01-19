(function () {
    'use strict';

    angular.module('mainApp')
        .factory('MainService', MainService);

    MainService.$inject = ['$http'];
    function MainService($http) {

        return {
            // get all exams
            get: function () {
                console.log('getting exams');
                return $http.get('/api/exams');
            }
        }
    }
})();

