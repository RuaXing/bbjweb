<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>诉讼信息</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcLitigationInformationForm">
    <form:form id="bbjZcLitigationInformationForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>备注信息:</label>
		            </td>
					<td class="width-35">
						<form:input path="remarks" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>主债权时效最后到期日:</label>
		            </td>
					<td class="width-35">
						<form:input path="theExpiryDateOfThePrincipalCredit" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>是否超过主债权时效:</label>
		            </td>
					<td class="width-35">
						<form:select path="sfzzqTimeout" htmlEscape="false" class="form-control"  dict="sf"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>担保时效最后到期日:</label>
		            </td>
					<td class="width-35">
						<form:input path="adsxzhTime" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>是否超过担保时效:</label>
		            </td>
					<td class="width-35">
						<form:select path="sfabTimeout" htmlEscape="false" class="form-control"  dict="sf"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>立案时间:</label>
		            </td>
					<td class="width-35">
						<form:input path="laTime" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>诉讼案号:</label>
		            </td>
					<td class="width-35">
						<form:input path="caseNo" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>诉讼所处阶段:</label>
		            </td>
					<td class="width-35">
						<form:select path="caseStage" htmlEscape="false" class="form-control"  dict="bbjsuscjd"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>判决\仲裁\调解书生效日期:</label>
		            </td>
					<td class="width-35">
						<form:input path="pjzctjEffectiveDate" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>诉讼受理法院:</label>
		            </td>
					<td class="width-35">
						<form:input path="courtOPeal" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>诉讼承办法官:</label>
		            </td>
					<td class="width-35">
						<form:input path="litigant" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>申请执行最后到期日:</label>
		            </td>
					<td class="width-35">
						<form:input path="sqzxLsttime" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>执行案号:</label>
		            </td>
					<td class="width-35">
						<form:input path="zxajNo" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>终止执行日期:</label>
		            </td>
					<td class="width-35">
						<form:input path="zxEdtime" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>终结本次执行日期:</label>
		            </td>
					<td class="width-35">
						<form:input path="endTheEutionDate" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>终结执行日期:</label>
		            </td>
					<td class="width-35">
						<form:input path="endOfecutionDate" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>执行受理法院:</label>
		            </td>
					<td class="width-35">
						<form:input path="enforcementOfCourt" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>执行承办法官:</label>
		            </td>
					<td class="width-35">
						<form:input path="executiveContractor" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>保全财产类型:</label>
		            </td>
					<td class="width-35">
						<form:select path="propertyPreservationType" htmlEscape="false" class="form-control"  dict="bbjbqcclx"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>查封\扣押\冻结裁定案号:</label>
		            </td>
					<td class="width-35">
						<form:input path="sdfDecisionNumber" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>查封\扣押\冻结裁定日:</label>
		            </td>
					<td class="width-35">
						<form:input path="szfVerdictDay" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>最后到期日:</label>
		            </td>
					<td class="width-35">
						<form:input path="lastDueDate" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>破产债权最后申报日:</label>
		            </td>
					<td class="width-35">
						<form:input path="pczqzhsbr" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>破产案号:</label>
		            </td>
					<td class="width-35">
						<form:input path="pcah" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>破产终结日期:</label>
		            </td>
					<td class="width-35">
						<form:input path="pczjTime" htmlEscape="false" class="form-control layer-date" placeholder="选择时间" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>是否追索保证人:</label>
		            </td>
					<td class="width-35">
						<form:select path="sfzsbzr" htmlEscape="false" class="form-control"  dict="sf"      />
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