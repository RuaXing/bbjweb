<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>自然人_家庭成员列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="自然人_家庭成员">
<grid:grid id="bbjGlZrrJtcyGridId" url="${adminPath}/bbjglzrrjtcy/bbjglzrrjtcy/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="自然人编号"  name="zrrId"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="成员编号"  name="cyId"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="关系"  name="ratetion"  query="true"  queryMode="input"  condition="eq" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>