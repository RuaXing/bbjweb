<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>债务人列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="债务人">
<grid:grid id="bbjZcDebtorGridId" url="${adminPath}/bbjzcdebtor/bbjzcdebtor/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="债务人类型"  name="debtorType"  query="true"  queryMode="select"  condition="eq"  dict="zwrlx"/>
    <grid:column label="债务人名称"  name="debtorName"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="主体名称"  name="subjectName"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="主体类型"  name="subjecttype"  query="true"  queryMode="select"  condition="eq"  dict="zwrztlx"/>
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>