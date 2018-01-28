<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>债权处置障碍列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="债权处置障碍">
<grid:grid id="bbjZcDebtDisposalDisorderGridId" url="${adminPath}/bbjzqczza/bbjzcdebtdisposaldisorder/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
    <grid:column label="诉讼原因"  name="lawsuitCause" />
    <grid:column label="政府原因"  name="governmentCause" />
    <grid:column label="其他"  name="other" />
    <grid:column label="解决方法"  name="solution" />
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