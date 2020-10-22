//定义全局变量 记录用户uid 和 fuid
var uid=1;
var dfu="0";
var path="/cloud/"
$(function(){
    alert(111);
    $("#login_modal").modal("show");
    //setTableData(0);//默认打开的是根目录  根目录did=0
});
//给table中填充数据
function setTableData(did){
    $("#tab").bootstrapTable({
        toolbar:"#toolbar",//添加按钮组
        url:path+"myDirectory/open.action?did="+did+"&uid="+uid,//指定url
        method:"GET",
        cache:false,
        dataType:"json",
        responseHandler:function(responseEntity){//responseHandler由响应数据中获取table要显示的数据
            return {
                rows:responseEntity.data
            };
        },
        //定义columns属性  指定每列要显示的内容
        columns:[
            {checkbox:true},//删除的多选框
            {
                title:"文件名字",//指定列名
                //field:"dname"   //要显示data中对象的那个属性的值
                formatter: function (value, row, index) {
                    if(row.dtype==1){//是文件
                        return '<a  class="btn btn-default" href="'+path+'myFile/download/'+row.did+'.action"><span class="glyphicon glyphicon-save" '
                            +'aria-hidden="true"></span>&emsp;'+row.dname +'</a>';
