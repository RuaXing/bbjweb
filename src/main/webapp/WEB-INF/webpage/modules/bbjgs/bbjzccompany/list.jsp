<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>公司列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="公司">
<grid:grid id="bbjZcCompanyGridId" url="${adminPath}/bbjgs/bbjzccompany/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="统一社会信用代码"  name="creditcode" />
    <grid:column label="企业名称"  name="enterprisename"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="企业类型"  name="enterprisetype" />
    <grid:column label="法定代表人"  name="legalrepresentative" />
    <grid:column label="注册资本"  name="registeredcapital" />
    <grid:column label="成立日期"  name="establishment_date" />
    <grid:column label="营业期限自"  name="businessstart" />
    <grid:column label="营业期限至"  name="businessend" />
    <grid:column label="登记机关"  name="registrationauthority" />
    <grid:column label="核准日期"  name="approvaldate" />
    <grid:column label="登记状态"  name="registrationstatus" />
    <grid:column label="住所"  name="domicile" />
    <grid:column label="经营范围"  name="managescope" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>