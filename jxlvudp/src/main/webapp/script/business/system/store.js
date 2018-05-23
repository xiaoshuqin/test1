/**
 * Created by 肖淑琴 on 2018/4/25.
 */

var jxmstc=new KBOperate("store");
layui.use(['layer'],function () {
    var layer=layui.layer;
});

function getCondition() {
    var obj = new Object();
    obj.condition = $("#txtName").val();
    return obj;
}
function find() {
    jxmstc.findForEasyui("dgStore",getCondition());
}

$(function () {

    find();
    jxmstc.browserForEasyui(function (obj) {

        var toUrl=getRootPath()+"/admin/system/store/store.jsp?type=2&id="+obj.id;
        layer.open({
            title:'库存信息浏览',
            type: 2,
            area:["100%","100%"],
            content: toUrl
        });
    });

    jxmstc.editForEasyui(function (obj) {
        var toUrl=getRootPath()+"/admin/system/store/store.jsp?type=1&id="+obj.id;
        layer.open({
            title:'库存信息修改',
            type: 2,
            area:["100%","100%"],
            content: toUrl
        });
    });
    jxmstc.delForEasyui("您确定删除当前选的信息吗？",function (data) {
        if (data.code>0){
            layer.msg("删除成功！");
            jxmstc.findForEasyui("dgStore",getCondition());
        }else
        {
            layer.msg("删除失败，数据在使用中...！");
        }
    });
    // $("#btnFresh").click(function () {
    //     var obj = new Object();
    //     obj.condition = "";
    //
    //     jxmstc.findForEasyui("dgAnnouncement",obj)
    // });

    $("#btnAdd").click(function () {
        var toUrl=getRootPath()+"/admin/system/store/store.jsp?type=0";
        layer.open({
            title:'库存信息新增',
            type: 2,
            area:["100%","100%"],
            content: toUrl
        });
    });

    $("#btnDeleteAll").click(function () {
        var ids=jxmstc.getEasyuiGridSelectRowsID("dgStore");
        if (ids=="") return;
        var obj=new Object();
        obj.ids=ids;
        jxmstc.do("deleteAll",obj,function (data) {
            if (data.code>0)
            {
                layer.msg("您选中的信息已经删除！");
                find();
            }
            elsesss
            {
                layer.msg("您选中的信息删除失败，错误代码："+data.code);
            }
        });
    });
    $("#btnFind").click(function () {
        find();
    });
});

