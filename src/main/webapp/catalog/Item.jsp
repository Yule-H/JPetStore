<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/IncludeTop.jsp" %>

<bean:define id="product" name="catalogBean" property="product"/>
<bean:define id="item" name="catalogBean" property="item"/>



<div id="Catalog">
<div id="BackLink">
<a href="<%=basePath %>catalog/prod.action?id=${item.product.productid}">
    返回到${item.product.name }</a>

</div>
  <table>
    <tr>
      <td>
       ${item.product.descn }
      </td>
    </tr>
    <tr>
      <td>
        <b>${item.itemid }</b>
      </td>
    </tr><tr>
    <td>
      <b><font size="4">
      ${item.attr1 }
      </font></b>
    </td></tr>
    <tr><td>
      ${item.product.name }
    </td></tr>
    <tr><td>
      ${item.unitcost }
    </td></tr>
    <tr><td>
      $ ${item.listprice }
    <tr><td>
      <a class="Button" href="<%=basePath %>cart/cartAdd.action">
       添加到购物车</a>
    </td></tr>
  </table>

</div>

<%@ include file="../common/IncludeBottom.jsp" %>



