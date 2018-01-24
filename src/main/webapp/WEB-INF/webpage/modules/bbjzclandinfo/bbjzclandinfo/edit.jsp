<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>土地信息</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcLandInfoForm">
    <form:form id="bbjZcLandInfoForm" modelAttribute="data" method="post" class="form-horizontal">
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
		              <label><font color="red">*</font>地址:</label>
		            </td>
					<td class="width-35">
						<form:input path="address" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>权属人:</label>
		            </td>
					<td class="width-35">
						<form:input path="propertyOwner" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>土地性质:</label>
		            </td>
					<td class="width-35">
						<form:select path="landStatus" htmlEscape="false" class="form-control"  dict="tdxz"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>土地面积:</label>
		            </td>
					<td class="width-35">
						<form:input path="landAcreage" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>权属证号:</label>
		            </td>
					<td class="width-35">
						<form:input path="ownershipNumber" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>他项权证号:</label>
		            </td>
					<td class="width-35">
						<form:input path="mortgagesNumber" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>抵押顺位:</label>
		            </td>
					<td class="width-35">
						<form:select path="impawnOrder" htmlEscape="false" class="form-control"  dict="dysw"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>前序顺位抵押金额:</label>
		            </td>
					<td class="width-35">
						<form:input path="preorderMortgageAmount" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>查封顺位:</label>
		            </td>
					<td class="width-35">
						<form:select path="sealedOrder" htmlEscape="false" class="form-control"  dict="cfsw"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>首封法院:</label>
		            </td>
					<td class="width-35">
						<form:input path="firstSeizureCourt" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>剩余使用年限:</label>
		            </td>
					<td class="width-35">
						<form:input path="remainingServiceLife" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>容积率:</label>
		            </td>
					<td class="width-35">
						<form:input path="volumetricRate" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>获得方式:</label>
		            </td>
					<td class="width-35">
						<form:select path="getWay" htmlEscape="false" class="form-control"  dict="hdfs"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>地上有无建筑物:</label>
		            </td>
					<td class="width-35">
						<form:select path="isBuildings" htmlEscape="false" class="form-control"  dict="dsywjzw"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>出租情况:</label>
		            </td>
					<td class="width-35">
						<form:select path="rentOut" htmlEscape="false" class="form-control"  dict="czqk"      />
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