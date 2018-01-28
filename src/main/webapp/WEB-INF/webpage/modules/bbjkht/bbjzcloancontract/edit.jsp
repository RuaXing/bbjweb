<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>借款合同</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcLoanContractForm">
    <form:form id="bbjZcLoanContractForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>合同类型:</label>
		            </td>
					<td class="width-35">
						<form:select path="contractType" htmlEscape="false" class="form-control"  dict="bbjhtlx"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>借款人:</label>
		            </td>
					<td class="width-35">
						<form:input path="borrower" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>贷款行:</label>
		            </td>
					<td class="width-35">
						<form:input path="loanLender" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>借款合同编号:</label>
		            </td>
					<td class="width-35">
						<form:input path="loanContractNo" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>合同签订日:</label>
		            </td>
					<td class="width-35">
						<form:input path="contractDate" htmlEscape="false" class="form-control layer-date" placeholder="YYYY-MM-DD hh:mm:ss" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>合同本金:</label>
		            </td>
					<td class="width-35">
						<form:input path="contractPrincipal" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>合同本息:</label>
		            </td>
					<td class="width-35">
						<form:input path="contractAmount" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>本金余额:</label>
		            </td>
					<td class="width-35">
						<form:input path="principalBalance" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>本息余额:</label>
		            </td>
					<td class="width-35">
						<form:input path="amountBalance" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>计息截至日期:</label>
		            </td>
					<td class="width-35">
						<form:input path="interestRateDeadline" htmlEscape="false" class="form-control layer-date" placeholder="YYYY-MM-DD hh:mm:ss" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>借款开始时间:</label>
		            </td>
					<td class="width-35">
						<form:input path="borrowedStart" htmlEscape="false" class="form-control layer-date" placeholder="YYYY-MM-DD hh:mm:ss" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>借款结束时间:</label>
		            </td>
					<td class="width-35">
						<form:input path="borrowedEnd" htmlEscape="false" class="form-control layer-date" placeholder="YYYY-MM-DD hh:mm:ss" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>借款用途:</label>
		            </td>
					<td class="width-35">
						<form:select path="borrowingUse" htmlEscape="false" class="form-control"  dict="bbjjkyt"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>是否诉讼:</label>
		            </td>
					<td class="width-35">
						<form:select path="idLitigation" htmlEscape="false" class="form-control"  dict="sf"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>经办人:</label>
		            </td>
					<td class="width-35">
						<form:input path="agent" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>备注信息:</label>
		            </td>
					<td class="width-35">
						<form:input path="remarks" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
		      
		   </tbody>
		</table>   
	</form:form>
<html:js name="bootstrap-fileinput" />
<html:js name="simditor" />
</body>
</html>