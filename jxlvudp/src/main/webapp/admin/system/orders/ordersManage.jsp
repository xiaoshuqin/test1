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
    <title>订单管理</title>
    <link href="<%=basePath%>/plugins/layui/css/layui.css" rel="stylesheet" />
    <script src="<%=basePath%>/plugins/layui/layui.js"></script>
    <script src="<%=basePath%>/script/common/kb.js"></script>
</head>
<body>
<div class="layui-table-tool" id="tb">
    <button class="layui-btn layui-btn-small" id="btnAdd" >
        <i class="layui-icon">&#xe608;</i> 添加
    </button>
    <input type="text"  style="width: 300px; height: 28px;" name="name" id="txtName" required  placeholder="请输订单编号" autocomplete="off"/>
    <div class="layui-btn-group">
        <button class="layui-btn layui-btn-small" id="btnFind">
            <i class="layui-icon">&#xe615;</i> 搜索
        </button>
        <button class="layui-btn layui-btn-small layui-btn-normal" id="btnFresh">
            <i class="layui-icon">&#x1002;</i> 刷新
        </button>
        <button class="layui-btn layui-btn-small layui-btn-warm" id="btnDeleteAll">
            <i class="layui-icon">&#xe640;</i> 批量删除
        </button>
    </div>
</div>
<table class="easyui-datagrid" title="订单管理" style="height:auto" id="dgOrders"
       data-options="rownumbers:true,pagination:true,collapsible:true,striped:true,fit:true,toolbar:'#tb'">
    <thead>
    <tr>
        <th data-options="field:'id1',checkbox:true"></th>
        <th data-options="field:'id',width:60">订单编号</th>
        <th data-options="field:'employee',width:80" hidden="hidden">负责人id</th>
        <th data-options="field:'employeeName',width:80">负责人</th>
        <th data-options="field:'date',width:100,formatter: formatDatebox">下单时间</th>
        <th data-options="field:'number',width:80">购买数量</th>
        <th data-options="field:'address',width:80">送货地址</th>
        <th data-options="field:'payment',width:80">付款方式</th>
        <th data-options="field:'money',width:80">总金额</th>
        <th data-options="field:'carUser',width:60" hidden="hidden">用户ID</th>
        <th data-options="field:'userName',width:80">用户名</th>
        <th data-options="field:'cars',width:60" hidden="hidden">汽车ID</th>
        <th data-options="field:'carsName',width:80">汽车型号</th>
        <th data-options="field:'status',width:60">状态</th>
        <th data-options="field:'ids',formatter:jxmstc.formateOperateForEasyui" width="120"
            align="center">操作</th>
    </tr>
    </thead>
</table>

<script src="<%=basePath%>/script/business/system/orders.js"></script>

</body>
</html>
