<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>抵押物列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="抵押物">
<grid:grid id="bbjZcGuaranteeGridId" url="${adminPath}/bbjdyw/bbjzcguarantee/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="抵押物类型"  name="type"  dict="dywlx"/>
    <grid:column label="序号"  name="numericalOrder" />
    <grid:column label="抵押人"  name="mortgager" />
    <grid:column label="抵押物名称"  name="guaranteeName"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="抵押物地址"  name="guaranteeAddress"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="抵押金额"  name="guaranteeMoney" />
    <grid:column label="抵押面积"  name="guaranteeArea" />
    <grid:column label="抵押权人"  name="pledgePepole" />
    <grid:column label="抵押登记时间"  name="registerTime" />
    <grid:column label="注销时间"  name="logoutTime" />
    <grid:column label="注销标记"  name="logoutType"  dict="zxbj"/>
    <grid:column label="备案登记号"  name="internetContentProvider"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="资料交接人"  name="dataConnectPepole" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>