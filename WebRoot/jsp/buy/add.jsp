<%@page contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
%>
<html>
<head>
	<script type="text/javascript" src="<%=path %>/js/jquery-1.7.2.js"></script>
    <link rel="stylesheet" href="<%=path %>/css/pintuer.css">
	<link rel="stylesheet" href="<%=path %>/css/admin.css">
	<script type="text/javascript" src="<%=path %>/js/datepicker/WdatePicker.js" type="text/javascript"></script>
</head>
	<body>
		<form action="" method="post" name="f">
			采购员：
			<div id="showUser"></div>
			<br />
			采购日期：
			<input type="text" name="buyDate" class="input" onclick="javascript:WdatePicker()"/>
			<br/>
			<input type="button" value="确认" onclick="configR()" class="button border-main icon-search">
			<input type="button" value="返回" onclick="back()" class="button border-main icon-search">
		</form>
	</body>
	<script type="text/javascript">
	
	/* 获取所有采购员 */

		$.post("<%=path%>/buy_findAllUser",{},
			function(data){//Servlet执行完之后执行方法，data表示的servlet返回数据内容
	 				var object = eval(data);//将字符串转换成json类型
	 				var showUser="<select name='username' class='input'>";
	 				for(var i = 1;i<object.length;i++){
	 					var item = object[i];
				      showUser = showUser+"<option value='"+item.userid+"'>"+item.username+"</option>";
			
	 				}
	 				showUser = showUser+"</select>";
	 				$("#showUser").html(showUser);
	 				});
	
function configR() {
	var username = f.username.value;
	var buyDate = f.buyDate.value;
	$(document).ready(function() {
		$.post("<%=path%>/buy_doIns", {
			userId : username,
			buyDate : buyDate
		}, function(data) {
			if (data.indexOf("true") != -1) {
				alert("新增成功");
				back();
			} else {
				alert("新增失败");
				back();
			}
		});

	});

}
function back(){
			opener.location.reload(); 
			//window.dialogArguments.query(0);//刷新之前页面 
			window.close();//关闭当前页面
		}
</script>
</html>