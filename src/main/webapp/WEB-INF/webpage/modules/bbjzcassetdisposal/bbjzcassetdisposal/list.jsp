<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>资产处置障碍列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="资产处置障碍">
<grid:grid id="bbjZcAssetDisposalGridId" url="${adminPath}/bbjzcassetdisposal/bbjzcassetdisposal/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
    <grid:column label="资产"  name="assets" />
    <grid:column label="类型"  name="type"  query="true"  queryMode="select"  condition="eq"  dict="sex"/>
    <grid:column label="产权人"  name="propertyOwner"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="存在问题"  name="problem" />
    <grid:column label="解决办法"  name="solution" />
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>