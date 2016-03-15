'use strict';

// Declare app level module which depends on views, and components
angular.module('stat0001Module', [
        'bsTable','ui.bootstrap','smart-table','angularSpinner', 'nvd3'
    ])
    .service('stat0001Service',Stat0001Service)
    .controller('stat0001Controller', Stat0001Controller);
