<%@ include file="../common/IncludeTop.jsp" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div id="Catalog">
<h2>我的订单</h2>

<table >
  <tr><th>订单编号</th>  <th>日期</th>  <th>总金额</th></tr>

    <tr>		
      <td><a href="<%=basePath %>order/view.action">1000 </a></td>
      <td>2013/02/18 10:53:01 </td>
      <td>$16.50</td>
    </tr>
  
</table>


  <a href="javascript:void(0);" class="Button">&lt;&lt; 上一页</a>

  <a href="javascript:void(0);" Class="Button">下一页 &gt;&gt;</a>

</div>
<%@ include file="../common/IncludeBottom.jsp" %>


