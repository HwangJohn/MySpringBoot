'use strict';


function Stat0001Controller($scope, $window, stat0001Service, usSpinnerService, $log) {

    $scope.doSearch = function (isLoadChart) {

        $scope.searchStatistics(fromDate, toDate);

    };

    $scope.searchStatistics = function () {

        $scope.isChartSpin = true;

        var promise;

        promise = stat0001Service.srchChartData();

        $scope.isChartSpin = false;

        promise.then(function (payload) {
            $scope.isChartSpin = false;

            if (payload.data.total == 0 || payload.data == undefined) {
                $window.alert("검색된 결과가 없습니다");
                return;
            }

            $scope.stat0001Data = chartData();

            function chartData() {
                var data = [];

                //angular.forEach(payload.data[0].values, function (values, idx) {
                //
                //    data.push({x: values.regDate, y: values.loginSearchApp});
                //
                //});

                for (var i = 1; i > 30; i++) {
                    data.push({x: "201603" + new Date().getDate() - i, y: i});
                }

                return [
                    {
                        key: '데이터',
                        values: data,
                        color: "#98abc5"
                    }
                ];
            }
        });
    }


    $scope.stat0001Option = {
        chart: {
            type: 'multiBarChart',
            height: 400,
            margin: {
                top: 20,
                right: 70,
                bottom: 45,
                left: 70
            },
            clipEdge: true,
            stacked: false,
            x: function (d) {
                return moment(d.x);
            },
            y: function (d) {
                return Number(d.y);
            },
            useInteractiveGuideline: true,
            xAxis: {
                axisLabel: 'Date',
                tickFormat: function (d) {
                    return d3.time.format('%Y%m%d')(new Date(d));
                }
            },
            yAxis: {
                axisLabel: 'Count',
                tickFormat: function (d) {
                    return d3.format("0,000")(d);
                }
            }
            //, xScale: d3.time.scale()
        }
    };

}
