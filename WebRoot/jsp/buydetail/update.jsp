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
			<input type="hidden" name="buyId" value="${pojo.buyDetailId }"/>
			采购单编号：
			<div id="showBuy"></div>
			<br />
			商品名：
			<div id="showPro"></div>
			<br />
			采购数量：
			<input type="number" name="buyNum" value="${pojo.buyNum}" class="input"/>
			<br/>
			商品价格：
			<input type="text" name="buyPrice" value="${pojo.buyPrice}" class="input"/>
			<br/>
			<input type="button" value="确认" onclick="configR()" class="button border-main icon-search">
			<input type="button" value="返回" onclick="back()" class="button border-main icon-search">
		</form>
</body>
<script type="text/javascript">
/* 获取所有采购单编号*/

		$.post("<%=path%>/bd_findByBuyid",{},
			function(data){//Servlet执行完之后执行方法，data表示的servlet返回数据内容
	 				var object = eval(data);//将字符串转换成json类型
	 				var showBuy="<select name='buyid' class='input'>";
	 				for(var i = 1;i<object.length;i++){
	 					var item = object[i];
	 					if(item.buyid=='${pojo.buy.buyId}'){
	 					showBuy = showBuy+"<option value='"+item.buyid+"' selected='selected'>"+item.buyid+"</option>";
	 					}else{
				      showBuy = showBuy+"<option value='"+item.buyid+"'>"+item.buyid+"</option>";
						}
	 				}
	 				showBuy = showBuy+"</select>";
	 				$("#showBuy").html(showBuy);
	 				});
	/* 获取所有商品名*/

		$.post("<%=path%>/bd_findByProid",{},
			function(data){//Servlet执行完之后执行方法，data表示的servlet返回数据内容
	 				var object = eval(data);//将字符串转换成json类型
	 				var showPro="<select name='proid' class='input'>";
	 				for(var i = 1;i<object.length;i++){
	 					var item = object[i];
	 					if(item.proid=='${pojo.pro.proId}'){
	 					showPro = showPro+"<option value='"+item.proid+"' selected='selected'>"+item.proname+"</option>";
	 					}else{
	 					showPro = showPro+"<option value='"+item.proid+"'>"+item.proname+"</option>";
	 					}
				      
			
	 				}
	 				showPro = showPro+"</select>";
	 				$("#showPro").html(showPro);
	 				});
	 				
function configR() {
	var buyDetailId = f.buyId.value;
	var buyid = f.buyid.value;
	var proid = f.proid.value;
	var buyNum = f.buyNum.value;
	var buyPrice = f.buyPrice.value;
	$(document).ready(function() {
		$.post("<%=path%>/bd_doUpd", {
			bdid : buyDetailId,
			buyId : buyid,
			proId : proid,
			buyNum : buyNum,
			buyPrice : buyPrice
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