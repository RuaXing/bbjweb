<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>其他财产列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="其他财产">
<grid:grid id="bbjZcOtherPropertGridId" url="${adminPath}/bbjqtcc/bbjzcotherpropert/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="资产性质"  name="natureOfTheAssets"  query="true"  queryMode="select"  condition="eq"  dict="zcxz"/>
    <grid:column label="地址"  name="address" />
    <grid:column label="面积"  name="area" />
    <grid:column label="权属人"  name="theOwnershipOf"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="权属证号"  name="theOwnershipCardNumber"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="抵押权人"  name="aMortgagee"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="抵押金额"  name="theMortgageAmount" />
    <grid:column label="查封顺位"  name="seizureOfTheSequence"  dict="cfsw"/>
    <grid:column label="首封法院"  name="theFirstLetterCourt"  dict="fy"/>
    <grid:column label="权属人与债务人关系"  name="relationship" />
    <grid:column label="估值"  name="valuation" />
    <grid:column label="预计余值"  name="estimatedResidualValue" />
    <grid:column label="是否处置"  name="isDo"  dict="trueAndFalse"/>
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>