<%--
  Created by IntelliJ IDEA.
  User: wph-pc
  Date: 2017/10/12
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header/init_layui.jsp"%>
<html>
<head>
    <title>库存信息</title>
</head>
<body style="padding-top: 10px;">
<form class="layui-form" id="ff">
    <input type="hidden" name="oldId" value=""/>
    <<%--input type="hidden" name="parent.id" id="txtParentID"  value=""/>
    <div class="layui-form-item">
        <label class="layui-form-label">上级分类： </label>
        <div class="layui-input-block">
            <input type="checkbox" title="是否启用" id="ckUse">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">上级分类： </label>
        <div class="layui-input-block">
            <input type="text" disabled="disabled" id="txtParent" name="parent.name" value="暂无上级分类名称" class="layui-input">
        </div>
    </div>--%>
    <div class="layui-form-item">
        <label class="layui-form-label">仓库号：</label>
        <div class="layui-input-block">
            <input name="id" required  lay-verify="required|number" autocomplete="off" placeholder="请输入仓库的编号，要求5位以内的数字" class="layui-input" type="text" maxlength="5">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">汽车名：</label>
        <div class="layui-input-block">
            <select name="cars.id" id="cars"></select>

        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">库存量：</label>
        <div class="layui-input-block">
            <input name="counts"  autocomplete="off" placeholder="请输入库存量" class="layui-input" type="text">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">入库时间：</label>
        <div class="layui-input-block">
            <input name="entry_time"  autocomplete="off" placeholder="请输入汽车入库时间" class="layui-input" type="text">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">出库时间：</label>
        <div class="layui-input-block">
            <input name="out_time"  autocomplete="off" placeholder="请输入汽车的出库时间" class="layui-input" type="text">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">员工名：</label>
        <div class="layui-input-block">
            <select name="employee.id" id="sltWeb"></select>
        </div>
    </div>



    <div class="layui-form-item">
        <label class="layui-form-label">状态:</label>
        <div class="layui-input-block">
            <input name="status" value="正常" title="正常" checked="checked" type="radio">
            <input name="status" value="关闭" title="关闭" type="radio">
        </div>
    </div>
    <div class="layui-form-item" id="dButton">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script>
function closeParent() {
    var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
    parent.layer.close(index);
    parent.find(null);
}
    var kb=new KBLayUI("store");
    var parentId=getURLParamValue("parentId");
    var type=getURLParamValue("type");//获取操作类型，0表示新增，其他表示修改
    if (parentId!=undefined)
    {
       $("#txtParentID").val(parentId);
       $("#txtParent").val(unescape(getURLParamValue("name")));
    }
    if (type==2)//表示浏览
    {
        $("#dButton").hide();
    }

    kb.doFormLayui("formDemo",function () {
        var obj=serializeArrayToObject("ff");

        if (type==0)
            kb.add(obj,function (returnBack) {
                if (returnBack.code>0)
                {
                    closeParent();
                }
            });
        else
            kb.edit(obj,function (returnBack) {
                if (returnBack.code>0)
                    closeParent();
            });
    });
    $(function () {
        /*完成站点加载，如果是不是新增，要实现数据选中*/
        doData("employee/find",null,function (data) {
            if (data!=null && data.obj!=undefined && data.obj!=null)
                for(var i=0;i<data.obj.length;i++)
                {
                    $("#sltWeb").append("<option value='"+data.obj[i].id+"'>"+data.obj[i].name+"</option>");
                }
            if(type!=0)
                kb.getMe(getURLParamValue("id"),function (data) {
                    $('#ff').form('load', data);//导入修改的数据，并绑定在界面上
                    if (data.parent!=null)
                    {
                        $("#ckUse").attr("checked", true);
                        $("#txtParentID").val(data.parent.id);
                        $("#txtParent").val(data.parent.name);
                    }
                    else
                    {
                        $("#ckUse").attr("checked",false);
                        $("#txtParentID").val("");
                        $("#txtParent").val("");
                    }
                    $("#sltWeb").find("option[value='"+data.employee.id+"']").attr("selected","selected");

                    layui.use(['form'],function () {
                        var form=layui.form;
                        form.render('select'); //刷新select选择框渲染
                    });
                });
            layui.use(['form'],function () {
                var form=layui.form;
                form.render('select'); //刷新select选择框渲染
            });
        });
    });
$(function () {
    /*完成站点加载，如果是不是新增，要实现数据选中*/
    doData("cars/find",null,function (data) {
        if (data!=null && data.obj!=undefined && data.obj!=null)
            for(var i=0;i<data.obj.length;i++)
            {
                $("#cars").append("<option value='"+data.obj[i].id+"'>"+data.obj[i].name+"</option>");
            }
        if(type!=0)
            kb.getMe(getURLParamValue("id"),function (data) {
                $('#ff').form('load', data);//导入修改的数据，并绑定在界面上
                if (data.parent!=null)
                {
                    $("#ckUse").attr("checked", true);
                    $("#txtParentID").val(data.parent.id);
                    $("#txtParent").val(data.parent.name);
                }
                else
                {
                    $("#ckUse").attr("checked",false);
                    $("#txtParentID").val("");
                    $("#txtParent").val("");
                }
                $("#sltWeb").find("option[value='"+data.cars.id+"']").attr("selected","selected");

                layui.use(['form'],function () {
                    var form=layui.form;
                    form.render('select'); //刷新select选择框渲染
                });
            });
        layui.use(['form'],function () {
            var form=layui.form;
            form.render('select'); //刷新select选择框渲染
        });
    });
});


</script>
</body>
</html>
