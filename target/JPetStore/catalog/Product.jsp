<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/IncludeTop.jsp" %>





<div id="Catalog">
<div id="BackLink">

  <a href="<%=basePath %>/catalog/list.action?cate=${itemList[0].product.category}">
  返回 ${cate }</a>

</div>
  <h2></h2>

  <table>
    <tr><th>商品编号</th>  <th>产品编号</th>  <th>产品描述</th>  <th>定价</th>  <th>&nbsp;</th></tr>
   
       <s:iterator value="itemList" var="item">
      	<tr>
        	<td><a href="<%=basePath %>catalog/item.action?itemid=${item.itemid }">${item.itemid }</a></td>
       	 	<td>${item.productid }</td>
        	<td>${item.attr1 }</td>
        	<td>$ ${item.listprice }</td>
        	<td><a href="<%=basePath %>cart/cartAdd.action?itemid=${item.itemid }" class="Button"> 添加到购物车</a></td>
      	</tr>
       </s:iterator>
   
    <tr><td>
      
        <a class="Button" href="javascript:void(0)">&lt;&lt; 上一页</a>
     
        <a class="Button" href="javascript:void(0)">下一页 &gt;&gt;</a>
   
    </td></tr>
  </table>

</div>

<%@ include file="../common/IncludeBottom.jsp" %>





