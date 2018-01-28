<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>债权表</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcObligatoryRightForm">
    <form:form id="bbjZcObligatoryRightForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>项目编号:</label>
		            </td>
					<td class="width-35">
						<form:input path="itemNo" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>项目名称:</label>
		            </td>
					<td class="width-35">
						<form:input path="itemName" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>授信类型:</label>
		            </td>
					<td class="width-35">
						<form:select path="creditType" htmlEscape="false" class="form-control"  dict="bbjsxlx"      />
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
		              <label>利息:</label>
		            </td>
					<td class="width-35">
						<form:input path="interest" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>本息合计:</label>
		            </td>
					<td class="width-35">
						<form:input path="totalInterest" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>保证人:</label>
		            </td>
					<td class="width-35">
						<form:input path="guarantor" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>抵/质押物:</label>
		            </td>
					<td class="width-35">
						<form:input path="pledge" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>诉讼阶段:</label>
		            </td>
					<td class="width-35">
						<form:select path="litigationStage" htmlEscape="false" class="form-control"  dict="bbjsujd"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵/质押物查封顺序:</label>
		            </td>
					<td class="width-35">
						<form:select path="pledgeSequence" htmlEscape="false" class="form-control"  dict="cfsw"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>查封时间预警:</label>
		            </td>
					<td class="width-35">
						<form:input path="checkTimeWarning" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>重要时间预警:</label>
		            </td>
					<td class="width-35">
						<form:input path="importantTimeWarning" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>预计回款金额:</label>
		            </td>
					<td class="width-35">
						<form:input path="expectedAmountOfPayment" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>预计回款时间:</label>
		            </td>
					<td class="width-35">
						<form:input path="expectedReturnTime" htmlEscape="false" class="form-control layer-date" placeholder="YYYY-MM-DD hh:mm:ss" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>拟处置方式:</label>
		            </td>
					<td class="width-35">
						<form:select path="quasiDisposalMode" htmlEscape="false" class="form-control"  dict="bbjczfs"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>备注:</label>
		            </td>
					<td class="width-35">
						<form:input path="remark" htmlEscape="false" class="form-control"      />
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
					<td class="width-15 active text-right"></td>
		   			<td class="width-35" ></td>
		  		</tr>
		      
		   </tbody>
		</table>   
	</form:form>
<html:js name="bootstrap-fileinput" />
<html:js name="simditor" />
</body>
</html>