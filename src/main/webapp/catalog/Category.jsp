<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/IncludeTop.jsp" %>

<div id="Catalog">

<div id="BackLink">

  <a href="<%=basePath%>catalog/main.action">返回主菜单</a>

</div>
  <h2>${cate }</h2>

  <table>
   <tr><th>产品编号</th>  <th>产品名称</th></tr>
   	<s:iterator value="prodList" var="prod">
   		<tr><td><a href="<%=basePath %>catalog/prod.action?id=${prod.productid}">${prod.productid }</a></td>
   		<td>${prod.name }</td></tr>
   	</s:iterator>
   <tr><td>
        <a class="Button" href="javascript:void(0)">&lt;&lt; 上一页</a>
        <a class="Button" href="javascript:void(0)">下一页 &gt;&gt;</a>
    </td></tr>
  </table>
  

</div>

<%@ include file="../common/IncludeBottom.jsp" %>


