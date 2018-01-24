<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>债权处置障碍</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcDebtDisposalDisorderForm">
    <form:form id="bbjZcDebtDisposalDisorderForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>诉讼原因:</label>
		            </td>
					<td class="width-35" colspan="3">
						<form:textarea path="lawsuitCause" rows="4" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>政府原因:</label>
		            </td>
					<td class="width-35" colspan="3">
						<form:textarea path="governmentCause" rows="4" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>其他:</label>
		            </td>
					<td class="width-35" colspan="3">
						<form:textarea path="other" rows="4" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>解决方法:</label>
		            </td>
					<td class="width-35" colspan="3">
						<form:textarea path="solution" rows="4" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
		  		</tr>
		   		<tr>
					<td  class="width-15 active text-right">
						<label>备注信息:</label>
					</td>
					<td class="width-35" colspan="3">
						<form:textarea path="remarks" rows="4" htmlEscape="false" class="form-control"      />
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