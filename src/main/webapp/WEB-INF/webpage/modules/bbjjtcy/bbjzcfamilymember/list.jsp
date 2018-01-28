<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>家庭成员列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="家庭成员">
<grid:grid id="bbjZcFamilyMemberGridId" url="${adminPath}/bbjjtcy/bbjzcfamilymember/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="姓名"  name="name"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="性别"  name="gender" />
    <grid:column label="联系电话"  name="phoneno" />
    <grid:column label="联系地址"  name="address" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>