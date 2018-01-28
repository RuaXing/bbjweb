<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>债务人_自然人列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="债务人_自然人">
<grid:grid id="bbjGlZwrZrrGridId" url="${adminPath}/bbjglzwrzrr/bbjglzwrzrr/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="债务人编号"  name="zwrId"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="自然人编号"  name="zrrId"  query="true"  queryMode="input"  condition="eq" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>