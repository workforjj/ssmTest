define("page/desk", ["jquery","handlebars"], function($,handlebars){

    var tools = {};
    var data=[{'type':'tool-one','name':'One','color':'red'},
        {'type':'tool-one','name':'Two','color':'yellow'},
        {'type':'tool-one','name':'Three','color':'blue'},
        {'type':'tool-one','name':'Four','color':'green'},
        {'type':'tool-one','name':'Five','color':'gray'},
        {'type':'tool-one','name':'Six','color':'#FFFFFF'},
        {'type':'tool-one','name':'Seven','color':'#c2c2c2'}]
    tools.init = function() {
         var temple = handlebars.compile($(".tag-template").html());
         $(".tools-content").html(temple(data));
    }
    return tools;
});