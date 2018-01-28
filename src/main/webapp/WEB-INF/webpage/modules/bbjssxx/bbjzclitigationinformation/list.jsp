<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>诉讼信息列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="诉讼信息">
<grid:grid id="bbjZcLitigationInformationGridId" url="${adminPath}/bbjssxx/bbjzclitigationinformation/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
    <grid:column label="主债权时效最后到期日"  name="theExpiryDateOfThePrincipalCredit" />
    <grid:column label="是否超过主债权时效"  name="sfzzqTimeout"  query="true"  queryMode="select"  condition="eq"  dict="sf"/>
    <grid:column label="担保时效最后到期日"  name="adsxzhTime" />
    <grid:column label="是否超过担保时效"  name="sfabTimeout"  query="true"  queryMode="select"  condition="eq"  dict="sf"/>
    <grid:column label="立案时间"  name="laTime" />
    <grid:column label="诉讼案号"  name="caseNo"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="诉讼所处阶段"  name="caseStage"  query="true"  queryMode="select"  condition="eq"  dict="bbjsuscjd"/>
    <grid:column label="诉讼受理法院"  name="courtOPeal"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="执行案号"  name="zxajNo"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="保全财产类型"  name="propertyPreservationType"  query="true"  queryMode="select"  condition="eq"  dict="bbjbqcclx"/>
    <grid:column label="最后到期日"  name="lastDueDate" />
    <grid:column label="破产案号"  name="pcah" />
    <grid:column label="是否追索保证人"  name="sfzsbzr"  query="true"  queryMode="select"  condition="eq"  dict="sf"/>
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