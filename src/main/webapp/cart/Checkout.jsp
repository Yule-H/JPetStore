<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/IncludeTop.jsp" %>



<div id="Catalog">
<div id="BackLink">
<a href="<%=basePath %>cart/cartList.action">返回到购物车</a>
</div>

  <table>
    <tr>
      <td>
        <h2>核对信息</h2>

        <table>

          <tr>
            <td><b>商品编号</b></td>  <td><b>产品编号</b></td>  <td><b>产品描述</b></td> <td><b>In Stock?</b></td>
            <td><b>产品数量</b></td>  <td><b>定价</b></td> <td><b>总成本</b></td>
          </tr>

         
            <tr>
              <td><a href="<%=basePath %>catalog/prod.action">EST-6</a></td>
              <td>F9-BD-01</td>
              <td>成年雄性斗牛犬</td>
              <td>有</td>
              <td>
                1
              </td>
              <td>$18.50</td>
              <td>$37.00</td>
            </tr>
        
          <tr>
            <td colspan="7">
              总金额:$37.00
            </td>
          </tr>
        </table>
        
          <a href="javascript:void(0);" class="Button">&lt;&lt; 上一页</a>
       
          <a href="javascript:void(0)" class="Button">下一页&gt;&gt;</a>
        
        <a class="Button" href="<%=basePath %>order/newOrder.action">继续</a>
      </td>
  

    </tr>
  </table>

</div>

<%@ include file="../common/IncludeBottom.jsp" %>





