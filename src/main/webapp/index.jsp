<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:url value="/stat0001" var="moduleURI" />

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="bower_components/bootstrap-css-only/css/bootstrap.min.css" />
    <link rel="stylesheet" href="app/css/style.css" />
    <title>AngularJS D3 Demo</title>
</head>
<body ng-app="d3App">
<div class="container" ng-controller="HomeCtrl">
    <div bar-chart="set.y" x="set.x" class="content"></div>
    <form role="form" ng-submit="randomize()" ng-init="randomize()">
        <div class="form-group">
            <label>Number of bars:</label>
            <input type="number" class="form-control" ng-model="n" />
        </div>
        <div class="form-group">
            <label>Minimum value of bar:</label>
            <input type="number" class="form-control" ng-model="min" />
        </div>
        <div class="form-group">
            <label>Maximum value of bar:</label>
            <input type="number" class="form-control" ng-model="max" />
        </div>
        <button type="submit" class="btn btn-default">Generate chart</button>
    </form>
</div>

<script type="text/javascript" src="bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="bower_components/d3/d3.min.js"></script>
<script type="text/javascript" src="bower_components/lodash/dist/lodash.min.js"></script>

<script type="text/javascript" src="app/js/app.js"></script>
<script type="text/javascript" src="app/js/controllers.js"></script>
<script type="text/javascript" src="app/js/directives.js"></script>
</body>
</html>
