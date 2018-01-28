<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>资产包列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="资产包">
<grid:grid id="bbjZcPropertyPkgGridId" url="${adminPath}/bbjzcb/bbjzcpropertypkg/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
    <grid:column label="贷款发放行"  name="loanOrigination"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="转让方"  name="transferor"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="持有方"  name="holder"  query="true"  queryMode="input"  condition="like" />
    <grid:column label="本金余额"  name="principalBalance" />
    <grid:column label="利息"  name="interest" />
    <grid:column label="本息合计"  name="sotoppi" />
    <grid:column label="计息截止日期"  name="interestAccrualEndtime" />
    <grid:column label="贷款方转出时间"  name="csOuttime" />
    <grid:column label="贷款方公告时间"  name="csCtime" />
    <grid:column label="转让方转出时间"  name="transferorOutime" />
    <grid:column label="上年度回现金额"  name="aocrLy" />
    <grid:column label="本年度回现金额"  name="aocrTy" />
    <grid:column label="年度回现目标"  name="annualReturnTarget" />
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