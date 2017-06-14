<%@page contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
%>
<html>
<head>
	<script type="text/javascript" src="<%=path %>/js/jquery-1.7.2.js"></script>
	<link rel="stylesheet" href="<%=path %>/css/pintuer.css">
	<link rel="stylesheet" href="<%=path %>/css/admin.css">
</head>
<body>
	<form action="" method="post" name="f">
			<input type="hidden" name="userId" value="${pojo.userId }"/>
			部门：
			<div id="showDept"></div>
			<br />
			员工账号：
			<input type="text" name="userNum" value="${pojo.userNum }" class="input"/>
			<br />
			员工密码：
			<input type="password" name="userPass" value="${pojo.userPass }" class="input"/>
			<br />
			员工姓名：
			<input type="text" name="username" value="${pojo.userName }" class="input"/>
			<br />
			<input type="button" value="确认" onclick="configR()" class="button border-main icon-search">
			<input type="button" value="返回" onclick="back()" class="button border-main icon-search">
		</form>
</body>
<script type="text/javascript">
/* 获取所有部门*/

		$.post("<%=path%>/user_findAllDept",{},
			function(data){//Servlet执行完之后执行方法，data表示的servlet返回数据内容
	 				var object = eval(data);//将字符串转换成json类型
	 				var showDept="<select name='dept' class='input'>";
	 				for(var i = 1;i<object.length;i++){
	 					var item = object[i];
	 					if(item.deptid == '${pojo.dept.deptId}'){
	 					showDept = showDept+"<option value='"+item.deptid+"' selected='selected'>"+item.deptname+"</option>";
	 					}
	 					else{
	 					showDept = showDept+"<option value='"+item.deptid+"'>"+item.deptname+"</option>";
	 					}
	 				}
	 				showDept = showDept+"</select>";
	 				$("#showDept").html(showDept);
	 				});

function configR() {
	var userId = f.userId.value;
	var dept = f.dept.value;
	var userNum = f.userNum.value;
	var userPass = f.userPass.value;
	var username = f.username.value;
	$(document).ready(function() {
		$.post("<%=path%>/user_doUpd", {
				userId : userId,
				deptId : dept,
				userNum : userNum,
				userPass : userPass,
				userName : username
			}, function(data) {
				if (data.indexOf("true") != -1) {
					alert("修改成功");
				} else {
					alert("修改失败");
				}
			});

		});

	}
	function back() {
		window.dialogArguments.query();//刷新之前页面	
		window.close();//关闭当前页面
	}
</script>
</html>