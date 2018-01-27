<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>债权表列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="债权表">
<grid:grid id="bbjZcObligatoryRightGridId" url="${adminPath}/bbjzcobligatoryright/bbjzcobligatoryright/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="项目编号"  name="itemNo"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="项目名称"  name="itemName"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="授信类型"  name="creditType"  query="true"  queryMode="select"  condition="eq"  dict="zqbsxlx"/>
    <grid:column label="本金余额"  name="principalBalance" />
    <grid:column label="利息"  name="interest" />
    <grid:column label="本息合计"  name="totalInterest" />
    <grid:column label="保证人"  name="guarantor" />
    <grid:column label="抵/质押物"  name="pledge" />
    <grid:column label="诉讼阶段"  name="litigationStage"  query="true"  queryMode="select"  condition="eq"  dict="zqbssjd"/>
    <grid:column label="抵/质押物查封顺序"  name="pledgeSequence"  query="true"  queryMode="select"  condition="eq"  dict="zqbdzywcfsx"/>
    <grid:column label="查封时间预警"  name="checkTimeWarning" />
    <grid:column label="重要时间预警"  name="importantTimeWarning" />
    <grid:column label="预计回款金额"  name="expectedAmountOfPayment" />
    <grid:column label="预计回款时间"  name="expectedReturnTime" />
    <grid:column label="拟处置方式"  name="quasiDisposalMode"  query="true"  queryMode="select"  condition="eq"  dict="zqbnczfs"/>
    <grid:column label="备注"  name="remark" />
    <grid:column label="经办人"  name="agent" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>