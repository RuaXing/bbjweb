<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>项目管理列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="项目管理">
<grid:grid id="bbjZcProjectManagementGridId" url="${adminPath}/bbjxmgl/bbjzcprojectmanagement/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="项目编号"  name="itemNumber"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="项目名称"  name="projectName"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="回款金额"  name="repaymentAmount" />
    <grid:column label="回款期限"  name="paybackPeriod" />
    <grid:column label="回款进度"  name="paymentProgress" />
    <grid:column label="逾期天数"  name="daysOverdue" />
    <grid:column label="经办人"  name="attn"  query="true"  queryMode="input"  condition="eq" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>