<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/IncludeTop.jsp"%>

<script>
$(function(){
	$("input[name='inStock']").blur(function(){
		var num = $(this).val();
	  	var itemid = $(this).prev().val();
	  	window.location.href="cart/cartUpdate.action?num="+num+"&itemid="+itemid;
	});
});
</script>

<div id="Catalog">
	<div id="BackLink">
		<a href="<%=basePath%>catalog/main.action">返回主菜单</a>
	</div>
	<div id="Cart">
		<h2>购物车</h2>
		<form method="post" action="<%=basePath%>cart/totleMoney.action">
			<table>
				<tr>
					<th><b>商品编号</b></th>
					<th><b>产品编号</b></th>
					<th><b>产品描述</b></th>
					<th><b>有库存?</b></th>
					<th><b>产品数量</b></th>
					<th><b>定价</b></th>
					<th><b>总成本</b></th>
					<th>&nbsp;</th>
				</tr>
				<c:if test="${cartList!=null }" var="flag">
					<s:iterator value="cartList" var="cart" >
						<tr>
							<td ><a href="<%=basePath%>catalog/item.action">${cart.cartKey.item.itemid }</a></td>
							<td>${cart.cartKey.item.product.productid }</td>
							<td>${cart.cartKey.item.attr1 }${cart.cartKey.item.product.name }</td>
							<td>
								<c:if test="${cart.cartKey.item.unitcost>0 }" var="have">有</c:if>
								<c:if test="${!have }">无</c:if>
							</td>
							<td>
								<input type="hidden" value="${cart.cartKey.item.itemid }"/>
								<input type="text" name="inStock" size="5" value="${cart.amount }" /></td>
							<td>$${cart.cartKey.item.listprice }</td>
							<td>$${cart.cartKey.item.listprice*cart.amount }</td>
							<td><a Class="Button" href=""> 取消</a></td>
						</tr>
					</s:iterator>
				</c:if>
				<c:if test="${!flag }">
					<tr>
						<td colspan="8"><b>你的购物车是空的.</b></td>
					</tr>
				</c:if>
				<tr>
					<td colspan="7">总金额:$${sessionScope.tot }<input type="submit" name="update"
						value="更新购物车" class="Button"/>
					</td>
					<td>&nbsp;</td>
				</tr>
			</table>
			<a class="Button" href="javascript:void(0);">&lt;&lt; 上一页</a> <a
				class="Button" href="javascript:void(0);">下一页 &gt;&gt;</a>
		</form>
		<a class="Button" href="<%=basePath%>cart/checkout.action">付款</a>
	</div>
	<div id="MyList" style="margin-top: 10px;">
		<%@ include file="IncludeMyList.jsp"%>
	</div>
	<div id="Separator">&nbsp;</div>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>