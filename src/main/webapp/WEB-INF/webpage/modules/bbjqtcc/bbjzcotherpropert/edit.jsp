<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>其他财产</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcOtherPropertForm">
    <form:form id="bbjZcOtherPropertForm" modelAttribute="data" method="post" class="form-horizontal">
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
		              <label>资产性质:</label>
		            </td>
					<td class="width-35">
						<form:select path="natureOfTheAssets" htmlEscape="false" class="form-control"  dict="zcxz"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>地址:</label>
		            </td>
					<td class="width-35">
						<form:input path="address" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>面积:</label>
		            </td>
					<td class="width-35">
						<form:input path="area" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>权属人:</label>
		            </td>
					<td class="width-35">
						<form:input path="theOwnershipOf" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>权属证号:</label>
		            </td>
					<td class="width-35">
						<form:input path="theOwnershipCardNumber" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押权人:</label>
		            </td>
					<td class="width-35">
						<form:input path="aMortgagee" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押金额:</label>
		            </td>
					<td class="width-35">
						<form:input path="theMortgageAmount" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>查封顺位:</label>
		            </td>
					<td class="width-35">
						<form:select path="seizureOfTheSequence" htmlEscape="false" class="form-control"  dict="cfsw"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>首封法院:</label>
		            </td>
					<td class="width-35">
						<form:select path="theFirstLetterCourt" htmlEscape="false" class="form-control"  dict="fy"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>权属人与债务人关系:</label>
		            </td>
					<td class="width-35">
						<form:input path="relationship" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>估值:</label>
		            </td>
					<td class="width-35">
						<form:input path="valuation" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>预计余值:</label>
		            </td>
					<td class="width-35">
						<form:input path="estimatedResidualValue" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>是否处置:</label>
		            </td>
					<td class="width-35">
						<form:select path="isDo" htmlEscape="false" class="form-control"  dict="trueAndFalse"      />
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