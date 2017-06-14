<%@page contentType="text/html; charset=utf-8" %>
<%
	String path = request.getContextPath();
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<script type="text/javascript" src="<%=path %>/js/jquery-1.7.2.js"></script>
	<link type="text/css" href="<%=path %>/css/css.css" rel="stylesheet"/>
    <link rel="stylesheet" href="<%=path %>/css/pintuer.css">
	<link rel="stylesheet" href="<%=path %>/css/admin.css">
</head>
<body>
	<center>
		<form action="" method="post" name="form1">
			员工姓名：<input type="text" name="username" id="username" class="input" style="width:250px; line-height:17px;display:inline-block" placeholder="请输入搜索关键字">
			<input type="button" value="查询" onclick="query(1)" class="button border-main icon-search">
			<a class="button border-main icon-plus-square-o" onclick="goIns()">新增</a>
		</form>
	
	<hr/>
	<div id="showTable"></div>
	<hr/>
	<span id="page_message"></span>
	<input class='button border-main' type="button" value="首页" id="first" onclick="query(5)">
	<input class='button border-main' type="button" value="上一页" id="up"  onclick="query(2)">
	<input class='button border-main' type="button" value="下一页" id="end"  onclick="query(3)">
	<input class='button border-main' type="button" value="尾页" id="down"  onclick="query(4)">
	</center>
</body>
<script type="text/javascript">
var username = "";//查询条件
var count = 0;//总共有多少笔数据
var page_count = 0;//总共多少页
var pagesize = 5;//一页显示多少比
var pagecur = 1;//当前第几页
query(1);


/*
	查询
*/
function query(a) {
	username = form1.username.value;
	if(a==1){
		pagecur = 1;
	}else if(a==2){//查询上一页
		pagecur = pagecur-1;
	}else if(a==3){//查询下一页
		pagecur = pagecur+1;
	}else if(a==4){//最后一页
		pagecur = page_count;
	}else if(a==5){//首页
		pagecur = 1;
	}
	$(document).ready(function (){
		$.post("<%=path%>/user_findAll",{userN:username,currentPage:pagecur,pageSize:pagesize},
		
		function(data){//Servlet执行完之后执行方法，data表示的servlet返回数据内容
	 				var object = eval(data);//将字符串转换成json类型
	 				var showT = "<table class='table table-hover text-center'>  <tr> <th>部门</th> <th>员工账号</th> <th>密码</th> <th>员工姓名</th>  <th>操作</th> </tr>";
	 				for(var i = 1;i<object.length;i++){
	 					var item = object[i];
	 					showT = showT+"<tr><td>"+item.d+"</td><td >"+item.usernum+"</td><td>"+item.userpass+"</td><td>"+item.username+"</td><td><a class='button border-main' href='#' onclick='goUpd(" + item.userId + ")'>更新</a><a class='button border-red'  href='#' onclick='goDel("
					+ item.userId + ")'>删除</a></td></tr>";
	 				}
	 				showT = showT + "</table>";
	 				$("#showTable").html(showT);
	 				count=object[0].count;
	 				calc();//计算总页数，控制按钮是否可用
	 			});
		
	});
}
/*
	按钮控制
*/
function calc(){
	if(count%pagesize==0){
		page_count = count/pagesize;
	}else{
		var v = count%pagesize;
		page_count = (count-v)/pagesize + 1;
		
		
	}
	if(pagecur == 1&&page_count!=1){
		document.getElementById("first").disabled = true;//按钮不可用
		document.getElementById("up").disabled = true;
		document.getElementById("end").disabled = false;
		document.getElementById("down").disabled = false;
	}else if(pagecur == page_count&&page_count!=1){
		document.getElementById("first").disabled = false;
		document.getElementById("up").disabled = false;
		document.getElementById("end").disabled = true;
		document.getElementById("down").disabled = true;
	}else if(page_count==1){
		document.getElementById("first").disabled = true;
		document.getElementById("up").disabled = true;
		document.getElementById("end").disabled = true;
		document.getElementById("down").disabled = true;
	}else if(pagecur<page_count&&pagecur>1){
		document.getElementById("first").disabled = false;
		document.getElementById("up").disabled = false;
		document.getElementById("end").disabled = false;
		document.getElementById("down").disabled = false;
	}
	document.getElementById("page_message").innerHTML="<font color='blue'>当前第"+pagecur+"页&nbsp;&nbsp;总共"+count+"笔，共"+page_count+"页</font>";
}
/*
	新增
*/
function goIns(){
	var width = window.screen.width ;
	var height = window.screen.height ;
	window.open("add.jsp","新增采购员",'height=400,width=600,top='+(height-450)/2+',left='+(width-300)/2+',toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
}
/*
	修改
*/
function goUpd(id_key){
	var width = window.screen.width ;
	var height = window.screen.height ;
	window.open("<%=path%>/user_findById?uid="+id_key,"修改采购员",'height=400,width=600,top='+(height-450)/2+',left='+(width-300)/2+',toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
}
/*
	删除
*/
function goDel(id_key){
	if(confirm("确认删除？")){
		$(document).ready(function (){
		$.post("<%=path%>/user_doDel",{uid:id_key},function(data){
			if(data.indexOf("true")!=-1){
				alert("删除成功");
				query(0);
			}else{
				alert("删除失败");
			}
		});
		
	});
	}
	
}	
</script>
</html>