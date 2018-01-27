<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>借款合同列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="借款合同">
<grid:grid id="bbjZcLoanContractGridId" url="${adminPath}/bbjzcloancontract/bbjzcloancontract/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="合同类型"  name="contractType"  query="true"  queryMode="select"  condition="eq"  dict="jkhthtlx"/>
    <grid:column label="借款人"  name="borrower"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="贷款行"  name="loanLender"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="借款合同编号"  name="loanContractNo" />
    <grid:column label="合同签订日"  name="contractDate" />
    <grid:column label="合同本金"  name="contractPrincipal" />
    <grid:column label="合同本息"  name="contractAmount" />
    <grid:column label="本金余额"  name="principalBalance" />
    <grid:column label="本息余额"  name="amountBalance" />
    <grid:column label="计息截至日期"  name="interestRateDeadline" />
    <grid:column label="借款开始时间"  name="borrowedStart" />
    <grid:column label="借款结束时间"  name="borrowedEnd" />
    <grid:column label="借款用途"  name="borrowingUse"  query="true"  queryMode="select"  condition="eq"  dict="jkhtjkyt"/>
    <grid:column label="是否诉讼"  name="idLitigation"  query="true"  queryMode="select"  condition="eq"  dict="jkhtsfss"/>
    <grid:column label="经办人"  name="agent" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>