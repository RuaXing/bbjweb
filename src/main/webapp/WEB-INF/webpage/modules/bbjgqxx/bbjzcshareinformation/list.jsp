<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>股权信息列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="股权信息">
<grid:grid id="bbjZcShareInformationGridId" url="${adminPath}/bbjgqxx/bbjzcshareinformation/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
    <grid:column label="质押物(股权)"  name="pledgeEquity" />
    <grid:column label="质押人"  name="pledgor"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="注册资金"  name="theRegisteredCapital"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="占股比例"  name="thePercentageShares" />
    <grid:column label="经营范围"  name="businessScope"  query="true"  queryMode="select"  condition="eq"  dict="bbjjyfw"/>
    <grid:column label="查封顺序"  name="attachmentOrder"  query="true"  queryMode="select"  condition="eq"  dict="cfsw"/>
    <grid:column label="首封法院"  name="theFirstLetterCourt" />
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