<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>法人信息列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="法人信息">
<grid:grid id="bbjZcLegalPersonInfoGridId" url="${adminPath}/bbjfrxx/bbjzclegalpersoninfo/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="法人名称"  name="legalpersonname"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="法定代表人"  name="legalperson" />
    <grid:column label="注册资本"  name="registeredassets" />
    <grid:column label="注册时间"  name="registrationdate" />
    <grid:column label="地址"  name="address" />
    <grid:column label="核准日期"  name="approvaldate" />
    <grid:column label="登记机关"  name="registrationauthority" />
    <grid:column label="经营范围"  name="managescope" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>