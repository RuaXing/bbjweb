<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>土地信息列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="土地信息">
<grid:grid id="bbjZcLandInfoGridId" url="${adminPath}/bbjzclandinfo/bbjzclandinfo/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
    <grid:column label="地址"  name="address" />
    <grid:column label="权属人"  name="propertyOwner"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="土地性质"  name="landStatus"  dict="tdxz"/>
    <grid:column label="土地面积"  name="landAcreage" />
    <grid:column label="权属证号"  name="ownershipNumber"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="他项权证号"  name="mortgagesNumber"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="抵押顺位"  name="impawnOrder"  dict="dysw"/>
    <grid:column label="前序顺位抵押金额"  name="preorderMortgageAmount" />
    <grid:column label="查封顺位"  name="sealedOrder"  dict="cfsw"/>
    <grid:column label="首封法院"  name="firstSeizureCourt" />
    <grid:column label="剩余使用年限"  name="remainingServiceLife" />
    <grid:column label="容积率"  name="volumetricRate" />
    <grid:column label="获得方式"  name="getWay"  dict="hdfs"/>
    <grid:column label="地上有无建筑物"  name="isBuildings"  dict="dsywjzw"/>
    <grid:column label="出租情况"  name="rentOut"  dict="czqk"/>
    <grid:column label="备注信息"  name="remarks" />
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