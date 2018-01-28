<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>房产信息</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="bbjZcHouseInfoForm">
    <form:form id="bbjZcHouseInfoForm" modelAttribute="data" method="post" class="form-horizontal">
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
		              <label>房产性质:</label>
		            </td>
					<td class="width-35">
						<form:select path="houseProperty" htmlEscape="false" class="form-control"  dict="fcxz"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>房产面积:</label>
		            </td>
					<td class="width-35">
						<form:input path="houseAcreage" htmlEscape="false" class="form-control"      />
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
		              <label><font color="red">*</font>抵押顺位:</label>
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
		              <label>建筑结构:</label>
		            </td>
					<td class="width-35">
						<form:select path="buildingStructure" htmlEscape="false" class="form-control"  dict="jzjg"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>建成日期:</label>
		            </td>
					<td class="width-35">
						<form:input path="completionDate" htmlEscape="false" class="form-control layer-date" placeholder="YYYY-MM-DD hh:mm:ss" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"       />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>所在层数:</label>
		            </td>
					<td class="width-35">
						<form:input path="layerNumber" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>总层数:</label>
		            </td>
					<td class="width-35">
						<form:input path="totalLayerNumber" htmlEscape="false" class="form-control"      />
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
				<tr>
					<td  class="width-15 active text-right">	
		              <label>是否有未成年人:</label>
		            </td>
					<td class="width-35">
						<form:select path="minors" htmlEscape="false" class="form-control"  dict="trueAndFalse"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>是否唯一住房:</label>
		            </td>
					<td class="width-35">
						<form:select path="onlyHousing" htmlEscape="false" class="form-control"  dict="trueAndFalse"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>是否需腾房:</label>
		            </td>
					<td class="width-35">
						<form:select path="leiHousing" htmlEscape="false" class="form-control"  dict="trueAndFalse"      />
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