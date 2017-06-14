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
			部门：
			<div id="showDept"></div>
			<br />
			员工账号：
			<input type="text" name="userNum" class="input" style="width:500px;"/>
			<br />
			员工密码：
			<input type="password" name="userPass" class="input" style="width:500px;" onclick="checkUserPass()"/>
			<span id="span2"></span>
			<br />
			员工姓名：
			<input type="text" name="username" class="input" style="width:500px;" onclick="checkUserName()"/>
			<span id="span3"></span>
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
	 				var showDept="<select name='dept' class='input' style='width:500px;'>";
	 				for(var i = 1;i<object.length;i++){
	 					var item = object[i];
				      showDept = showDept+"<option value='"+item.deptid+"'>"+item.deptname+"</option>";
			
	 				}
	 				showDept = showDept+"</select>";
	 				$("#showDept").html(showDept);
	 				});

function configR() {
	var dept = f.dept.value;
	var userNum = f.userNum.value;
	var userPass = f.userPass.value;
	var username = f.username.value;
	if(dept!="" && userNum!="" && userPass!="" && username!=""){//begin
	$(document).ready(function() {
		$.post("<%=path%>/user_doIns", {
			deptId : dept,
			userNum : userNum,
			userPass : userPass,
			userName : username
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
}else{
alert("必填信息有空");
}
}
/* 检查用户名是否为空 */
function checkUserName(){
    	var userName=f.username.value;
		if(userName==""){
			document.getElementById("span2").innerHTML="<font style='color:red'>✘</font>";
			document.getElementById("hidd1").innerHTML="value='error'";
			//f.xe_id.onfocus();
		}else{
			document.getElementById("span2").innerHTML="<font style='color:green'>✔</font>";
		}
    }
    
    /* 检查密码是否为空，是否有非法字符 */
    function checkUserPass(){
    	var userPass=f.userPass.value;
    	var reg=/^[0-9a-zA-Z]+$/;
		if(!reg.test(userPass) || userPass==""){
			document.getElementById("span3").innerHTML="<font style='color:red'>✘</font>";
			document.getElementById("hidd1").innerHTML="value='error'";
			//f.xe_id.onfocus();
		}else{
			document.getElementById("span3").innerHTML="<font style='color:green'>✔</font>";
		}
    }
    
function back(){
			opener.location.reload(); 
			//window.dialogArguments.query(0);//刷新之前页面 
			window.close();//关闭当前页面
		}
</script>
</html>