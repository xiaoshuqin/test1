<%--
  Created by IntelliJ IDEA.
  User: wph-pc
  Date: 2017/10/9
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header/init.jsp"%>
<html>
<head>
    <title>库存管理</title>
    <link href="<%=basePath%>/plugins/layui/css/layui.css" rel="stylesheet" />
    <script src="<%=basePath%>/plugins/layui/layui.js"></script>
    <script src="<%=basePath%>/script/common/kb.js"></script>
</head>
<body>
<div class="layui-table-tool" id="tb">
    <button class="layui-btn layui-btn-small" id="btnAdd" >
        <i class="layui-icon">&#xe608;</i> 添加
    </button>
    <input type="text"  style="width: 300px; height: 28px;" name="name" id="txtName" required  placeholder="请输站点名称" autocomplete="off"/>
    <div class="layui-btn-group">
        <button class="layui-btn layui-btn-small" id="btnFind">
            <i class="layui-icon">&#xe615;</i> 搜索
        </button>
        <%--<button class="layui-btn layui-btn-small layui-btn-normal" id="btnFresh">
            <i class="layui-icon">&#x1002;</i> 刷新
        </button>
        <button class="layui-btn layui-btn-small layui-btn-warm" id="btnDeleteAll">
            <i class="layui-icon">&#xe640;</i> 批量删除
        </button>--%>
    </div>
</div>
<table class="easyui-datagrid" title="库存管理" style="height:auto" id="dgStore"
       data-options="rownumbers:true,pagination:true,collapsible:true,striped:true,fit:true,toolbar:'#tb'">
    <thead>
    <tr>
        <th data-options="field:'id1',checkbox:true"></th>
        <th data-options="field:'id',width:100">仓库号</th>
        <th data-options="field:'cars',width:180" hidden="hidden">汽车编号</th>
        <th data-options="field:'name',width:100">汽车型号</th>
        <th data-options="field:'counts',width:100">库存量</th>
        <th data-options="field:'entry_time',width:150,formatter: formatDatebox">入库时间</th>
        <th data-options="field:'out_time',width:150,formatter: formatDatebox">出库时间</th>
        <th data-options="field:'employee',width:100" hidden="hidden">员工号</th>
        <th data-options="field:'employee_name',width:100">员工名</th>
        <th data-options="field:'ids',formatter:jxmstc.formateOperateForEasyui" width="120"
            align="center">操作</th>
    </tr>
    </thead>
</table>

<script src="<%=basePath%>/script/business/system/store.js"></script>

</body>
</html>
