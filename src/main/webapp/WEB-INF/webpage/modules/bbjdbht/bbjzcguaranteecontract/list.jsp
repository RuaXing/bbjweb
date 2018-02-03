<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>担保合同列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="担保合同">
<grid:grid id="bbjZcGuaranteeContractGridId" url="${adminPath}/bbjdbht/bbjzcguaranteecontract/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>

    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="合同编号"  name="contractid"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="合同类型"  name="contracttype"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="担保人"  name="guarantee"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="担保类型"  name="guaranteetype"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="合同签订日期"  name="dateofcontract"  query="true"  queryMode="date"  condition="eq" />
    <grid:column label="担保主债权开始时间"  name="dbzzqstarttime" />
    <grid:column label="担保主债权结束时间"  name="dbzzqentime" />
    <grid:column label="担保期限"  name="guaranteeperiod" />
    <grid:column label="担保金额"  name="amountguaranteed" />
    <grid:column label="担保期限主债权金额"  name="dbqxzzqmoney" />
    <grid:column label="担保方式"  name="guaranteeway" />
    <grid:column label="是否诉讼"  name="islawsuit" />
    <grid:column label="经办人"  name="agent" />
    <grid:button groupname="opt" function="delete" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>