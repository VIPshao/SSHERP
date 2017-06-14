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
			<input type="hidden" name="buyId" value="${pojo.buyId }"/>
			采购员：
			<div id="showUser"></div>
			<br>
			修改日期：
			<input type="text" name="buyDate" value="${pojo.buyDate }" class="input" onclick="javascript:WdatePicker()"/>
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
	 					if(item.userid == '${pojo.userinfo.userId}'){
	 					showUser = showUser+"<option value='"+item.userid+"' selected='selected'>"+item.username+"</option>";
	 					}else{
				      showUser = showUser+"<option value='"+item.userid+"'>"+item.username+"</option>";
			    }
	 				}
	 				showUser = showUser+"</select>";
	 				$("#showUser").html(showUser);
	 				});
	 				
function configR() {
	var username = f.username.value;
	var buyDate = f.buyDate.value;
	var buyId = f.buyId.value;
	$(document).ready(function() {
		$.post("<%=path%>/buy_doUpd", {
				uidname : username,
				buyDate : buyDate,
				buyId : buyId
			}, function(data) {
				if (data.indexOf("true") != -1) {
					alert("修改成功");
					back();
				} else {
					alert("修改失败");
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