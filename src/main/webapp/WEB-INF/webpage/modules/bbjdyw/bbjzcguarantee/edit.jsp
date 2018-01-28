<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>抵押物</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcGuaranteeForm">
    <form:form id="bbjZcGuaranteeForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>备注信息:</label>
		            </td>
					<td class="width-35">
						<form:textarea path="remarks" rows="4" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>抵押物类型:</label>
		            </td>
					<td class="width-35">
						<form:select path="type" htmlEscape="false" class="form-control"  dict="dywlx"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>序号:</label>
		            </td>
					<td class="width-35">
						<form:input path="numericalOrder" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押人:</label>
		            </td>
					<td class="width-35">
						<form:input path="mortgager" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押物名称:</label>
		            </td>
					<td class="width-35">
						<form:input path="guaranteeName" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押物地址:</label>
		            </td>
					<td class="width-35">
						<form:input path="guaranteeAddress" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押金额:</label>
		            </td>
					<td class="width-35">
						<form:input path="guaranteeMoney" htmlEscape="false" class="form-control"  datatype="n"    />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押面积:</label>
		            </td>
					<td class="width-35">
						<form:input path="guaranteeArea" htmlEscape="false" class="form-control"  datatype="n"    />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押权人:</label>
		            </td>
					<td class="width-35">
						<form:input path="pledgePepole" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>抵押登记时间:</label>
		            </td>
					<td class="width-35">
						<form:input path="registerTime" htmlEscape="false" class="form-control layer-date" placeholder="YYYY-MM-DD hh:mm:ss" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>注销时间:</label>
		            </td>
					<td class="width-35">
						<form:input path="logoutTime" htmlEscape="false" class="form-control layer-date" placeholder="YYYY-MM-DD hh:mm:ss" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>注销标记:</label>
		            </td>
					<td class="width-35">
						<form:select path="logoutType" htmlEscape="false" class="form-control"  dict="zxbj"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>备案登记号:</label>
		            </td>
					<td class="width-35">
						<form:input path="internetContentProvider" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>资料交接人:</label>
		            </td>
					<td class="width-35">
						<form:input path="dataConnectPepole" htmlEscape="false" class="form-control"      />
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