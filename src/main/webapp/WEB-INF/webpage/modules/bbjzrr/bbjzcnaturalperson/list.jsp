<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>自然人列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="自然人">
<grid:grid id="bbjZcNaturalPersonGridId" url="${adminPath}/bbjzrr/bbjzcnaturalperson/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="姓名"  name="name"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="证件类型"  name="certificatetype"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="证件号码"  name="certificateno"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="出生年月"  name="birthday"  query="true"  queryMode="date"  condition="eq" />
    <grid:column label="出生地"  name="birthplace" />
    <grid:column label="住址"  name="address" />
    <grid:column label="职业"  name="occupation" />
    <grid:column label="工作单位"  name="workunit" />
    <grid:column label="联系方式"  name="contactway" />
    <grid:column label="与债务人关系"  name="relationshipwith_debtor" />
    <grid:column label="曾经住所"  name="oncehome" />
    <grid:column label="对外负债"  name="foreigndebt" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>