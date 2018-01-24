<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>项目管理</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcProjectManagementForm">
    <form:form id="bbjZcProjectManagementForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>项目编号:</label>
		            </td>
					<td class="width-35">
						<form:input path="itemNumber" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">
						<label>经办人:</label>
					</td>
					<td class="width-35">
						<form:input path="attn" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>项目名称:</label>
		            </td>
					<td class="width-35">
						<form:input path="projectName" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>回款金额:</label>
		            </td>
					<td class="width-35">
						<form:input path="repaymentAmount" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>回款期限:</label>
		            </td>
					<td class="width-35">
						<form:input path="paybackPeriod" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>回款进度:</label>
		            </td>
					<td class="width-35">
						<form:input path="paymentProgress" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>逾期天数:</label>
		            </td>
					<td class="width-35">
						<form:input path="daysOverdue" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right"></td>
					<td class="width-35"></td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">
						<label>逾期说明:</label>
					</td>
					<td class="width-35" colspan="3">
						<form:textarea path="overdueInstructions" rows="4" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
		  		</tr>
		      	<tr>
					<td  class="width-15 active text-right">
						<label>备注信息:</label>
					</td>
					<td class="width-35" colspan="3">
						<form:textarea rows="4" path="remarks" htmlEscape="false" class="form-control"      />
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