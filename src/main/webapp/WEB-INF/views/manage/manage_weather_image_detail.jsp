<%@ page import="com.graction.lumi.util.format.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.util.stream.Stream"%>
<%@ page import="com.graction.lumi.data.*"%>
<%@ page import="com.graction.lumi.data.DataStorage.*"%>
<%@ page import="com.graction.lumi.model.response.*"%>
<%@ page import="com.graction.lumi.model.vo.WeatherVO"%>
<%@ page import="com.graction.lumi.model.xml.weather.*"%>
<%
	// Map<String, Object> map = (Map<String, Object>) request.getAttribute(DataStorage.Attribute.ATTR_MAP);
	WeatherVO table = (WeatherVO) request.getAttribute(DataStorage.Attribute.ATTR_WEATHER_TABLE);
%>
<style>
td img {
	width: 45%;
	min-width: 350px;
}
</style>

<h1>Weather Information</h1>
<hr>

<div class="card mb-3">
	<div class="card-header">
		<i class="fa fa-table"></i> Weather Information
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<form id="frm" method="post" enctype="multipart/form-data">
				<table class="table table-bordered dataTable " width="100%" cellspacing="0" role="grid" aria-describedby="dataTable_info" style="width: 100%;">

				<tr>
					<td><%=DataStorage.Database.Column.COLUMN_WEATHER_CODE%></td>
					<td><%=table.getWeather_code()%></td>
				</tr>
				<tr>
					<td><%=DataStorage.Database.Column.COLUMN_WEATHER_NAME%></td>
					<td><%=table.getWeather_name()%></td>
				</tr>
				<%-- <tr>
					<td><%=DataStorage.Database.Column.COLUMN_BACKGROUND_ROOT%></td>
					<td><%=table.getBackground_root()%></td>
				</tr> --%>
				<tr>
					<td><%=DataStorage.Database.Column.COLUMN_BACKGROUND_PATH%></td>
					<td><%=table.getBackground_img_path()%></td>
				</tr>
				<tr>
					<td><%=DataStorage.Database.Column.COLUMN_BACKGROUND_NAME%></td>
					<td><%=table.getBackground_img_name()%></td>
				</tr>
				<tr>
					<td>
						<%-- <input type="file" class="btn btn-default" name="<%=DataStorage.Param.PARAM_BACKGROUND_FILE%>"/> --%>
						<input type="file" class="btn btn-default" name="<%=DataStorage.Param.PARAM_BACKGROUND%>"/>
					</td>
					<td>
						<img class="img-thumbnail" src="<%=DataStorage.Server.PATH_UPLOAD_DIR + table.getBackground_img_path() + table.getBackground_img_name()%>" />	
					</td>
				</tr>
				<%-- <tr>
					<td><%=DataStorage.Database.Column.COLUMN_CHARACTER_ROOT%></td>
					<td><%=table.getCharacter_root()%></td>
				</tr> --%>
				<tr>
					<td><%=DataStorage.Database.Column.COLUMN_CHARACTER_PATH%></td>
					<td><%=table.getCharacter_img_path()%></td>
				</tr>
				<tr>
					<td><%=DataStorage.Database.Column.COLUMN_CHARACTER_NAME%></td>
					<td><%=table.getCharacter_img_name()%></td>
				</tr>
				<tr>
					<td>
						<%-- <td><input type="file" class="btn btn-default" name="<%=DataStorage.Param.PARAM_CHARACTER_FILE%>" /> --%>
						<input type="file" class="btn btn-default" name="<%=DataStorage.Param.PARAM_CHARACTER%>">
					</td>
					<td>
						<img class="img-thumbnail" src="<%=DataStorage.Server.PATH_UPLOAD_DIR + table.getCharacter_img_path() + table.getCharacter_img_name()%>" />	
					</td>
				</tr>
				<%-- <tr>
					<td><%=DataStorage.Database.Column.COLUMN_EFFECT_ROOT%></td>
					<td><%=table.getEffect_root()%></td>
				</tr> --%>
				<tr>
					<td><%=DataStorage.Database.Column.COLUMN_EFFECT_PATH%></td>
					<td><%=table.getEffect_img_path()%></td>
				</tr>
				<tr>
					<td><%=DataStorage.Database.Column.COLUMN_EFFECT_NAME%></td>
					<td><%=table.getEffect_img_name()%></td>
				</tr>
				<tr>
					<td>
						<%-- <input type="file" class="btn btn-default" name="<%=DataStorage.Param.PARAM_EFFECT_FILE%>" /> --%>
						<input type="file" class="btn btn-default" name="<%=DataStorage.Param.PARAM_EFFECT%>" />
					</td>
					<td>
						<img class="img-thumbnail" src="<%=DataStorage.Server.PATH_UPLOAD_DIR + table.getEffect_img_path() + table.getEffect_img_name()%>" />
					</td>
				</tr>
			</table>
			</form>
		</div>
		<!-- <button type="button" class="btn btn-default" onclick="javascript:window.history.back();">Back</button>
		<button type="button" class="btn btn-success" onclick="uploadImage()">Confirm</button> -->
		<button type="button" class="btn btn-warning btn-circle btn-lg" onclick="javascript:window.history.back();"><i class="fa fa-times"></i> </button>
		<button type="button" class="btn btn-info btn-circle btn-lg" onclick="uploadImage()"><i class="fa fa-check"></i> </button>
	</div>
</div>
<script src="<%=DataStorage.Path.PATH_DIR_JS%>jquery-3.2.1.min.js"></script>
<script>
	function uploadImage(){
		loadingActivation();
		var frmFile = new FormData(document.getElementById('frm'));
		<%-- frmFile.append("<%=DataStorage.Param.PARAM_background_img_path%>", "<%=table.getBackground_img_path()%>");
		frmFile.append("<%=DataStorage.Param.PARAM_CHARACTER_PATH%>", "<%=table.getCharacter_img_path()%>");
		frmFile.append("<%=DataStorage.Param.PARAM_EFFECT_PATH%>", "<%=table.getEffect_img_path()%>"); --%>
		frmFile.append("<%=Param.PARAM_background_img_path%>", "<%=Path.PATH_DIR_IMAGES_BACKGROUND%>");
		frmFile.append("<%=Param.PARAM_CHARACTER_PATH%>", "<%=Path.PATH_DIR_IMAGES_CHARACTER%>");
		frmFile.append("<%=Param.PARAM_EFFECT_PATH%>", "<%=Path.PATH_DIR_IMAGES_EFFECT%>");
		frmFile.append("<%=Param.PARAM_BACKGROUND_INDEX%>", "<%=table.getBackground_index()%>");
		frmFile.append("<%=Param.PARAM_CHARACTER_INDEX%>", "<%=table.getCharacter_index()%>");
		frmFile.append("<%=Param.PARAM_EFFECT_INDEX%>", "<%=table.getEffect_index()%>");
		frmFile.append("<%=Param.PARAM_CODE%>", "<%=request.getParameter(Param.PARAM_CODE)%>");
		/* var frmPath = $("#frm_path").serialize(); */
		/* var queryString = $("form[name=frm]").serialize(); */
		log(frmFile);
		$.ajax({
			url : "<%=request.getContextPath()+Mapping.MAPPING_WEATHER_DETAIL_UPLOAD%>",
			type : "POST",
			processData: false,
            contentType: false,
			data : frmFile,
		 	success : function(result){
				showAlert(result);    			
           	},
           	error : function(error){
           		showAlert("<%=Code.CODE_FAIL%>");
           	}
		});
	}
	
	 function showAlert(result){
	    	loadingTermination();
	    	switch(result){
			case "<%=Code.CODE_SUCCESS%>" :
				alert("<%=Message.WEATHER_DETAIL_SUCCESS_MESSAGE%>");
				location.reload();
				break;
			case "<%=Code.CODE_FAIL%>" :
				alert("<%=Message.WEATHER_DETAIL_FAIL_MESSAGE%>");
				break;
			}
	    }
</script>