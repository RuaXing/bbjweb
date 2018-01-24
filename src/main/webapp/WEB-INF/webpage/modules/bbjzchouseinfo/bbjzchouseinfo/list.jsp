<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>房产信息列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="房产信息">
<grid:grid id="bbjZcHouseInfoGridId" url="${adminPath}/bbjzchouseinfo/bbjzchouseinfo/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="地址"  name="address" />
    <grid:column label="权属人"  name="propertyOwner"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="房产性质"  name="houseProperty"  dict="fcxz"/>
    <grid:column label="房产面积"  name="houseAcreage" />
    <grid:column label="权属证号"  name="ownershipNumber"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="他项权证号"  name="mortgagesNumber"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="抵押顺位"  name="impawnOrder"  dict="dysw"/>
    <grid:column label="前序顺位抵押金额"  name="preorderMortgageAmount" />
    <grid:column label="查封顺位"  name="sealedOrder"  dict="cfsw"/>
    <grid:column label="首封法院"  name="firstSeizureCourt" />
    <grid:column label="建筑结构"  name="buildingStructure"  dict="jzjg"/>
    <grid:column label="建成日期"  name="completionDate" />
    <grid:column label="所在层数"  name="layerNumber" />
    <grid:column label="总层数"  name="totalLayerNumber" />
    <grid:column label="出租情况"  name="rentOut"  dict="czqk"/>
    <grid:column label="是否有未成年人"  name="minors"  dict="trueAndFalse"/>
    <grid:column label="是否唯一住房"  name="onlyHousing"  dict="trueAndFalse"/>
    <grid:column label="是否需腾房"  name="leiHousing"  dict="trueAndFalse"/>
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>