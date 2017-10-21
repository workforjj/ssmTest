require.config(requireConfig);
require(["jquery","page/desk","layui","laydate"], function($,desk) {
    var a = {
        elem:"#start-time",
        theme: 'grid',
        format: 'YYYY-MM-DD hh:mm:ss', //日期格式
        istime: true, //是否开启时间选择
        isclear: false//是否显示清空
    };
    // $("#start-time").on("click",function () {
    //    laydate(a);
    // });
    layui.use(['laypage','layer','carousel'], function(){
        var laypage = layui.laypage;
        var layer = layui.layer;
        var carousel = layui.carousel;
        $(".things").mouseover(function () {
            layer.tips('左边么么哒', '.things', {
                tips: [4, '#78BA32']
            });
        });
        $(".things").click(function () {
        layer.open({
            type: 2,
            area: ['700px', '450px'],
            fixed: false, //不固定
            maxmin: true,
            content: 'http://www.baidu.com'
        });
        });

        // //常规轮播
        // carousel.render({
        //     elem: '#test1'
        //     ,arrow: 'always'
        // });
        $.ajax({
           url:"getContent",
           success:function (result) {
               debugger;
               var pagenum = (result.length  +  6  - 1) / 6;
               laypage({
                   cont: 'demo20', //容器。值支持id名、原生dom对象，jquery对象。【如该容器为】：<div id="page1"></div>
                   pages: pagenum, //通过后台拿到的总页数
                   curr: 1, //初始化当前页
                   limit:6,
                   jump: function(obj){ //触发分页后的回调
                       $('.layui-form').html(function(){
                           debugger;
                           var html = " <table class='layui-table'> <colgroup> <col width='150'> <col width='150'><col width='200'> <col></colgroup>"+
                               "<thead> <tr> <th>人物</th>  <th>民族</th>  <th>出场时间</th> <th>格言</th> </tr>  </thead> <tbody>";
                           var data = result.concat().splice(obj.curr*obj.limit - obj.limit, obj.limit);
                           for(var i=0;i<data.length;i++){
                               html+=" <tr><td>"+data[i].cPerson+"</td><td>"+data[i].cMz+"</td><td>"+data[i].dShowtime+"</td><td>"+data[i].cMy+"</td></tr>";
                           }
                           html += "</tbody> </table>";
                           return html;
                       })
                   }
               });
           }

        });
    });
    $(".content").load("/ssm/html/desk.html", function() {
        desk.init();
    });
});