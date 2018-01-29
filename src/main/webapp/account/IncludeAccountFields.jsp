

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<h3>客户基本信息</h3>

<table>
  <tr>
    <td>姓名:</td><td><input type=text name="firstname" value="张三"/></td>
  </tr><tr>
  <td>邮箱:</td><td><input type=text name="email" size="40" value="yourname@yooho.com"></td>
</tr><tr>
  <td>联系电话:</td><td><input type=text name="phone" size="40" value="13775357882"/></td>
</tr><tr>
  <td>地址1:</td><td><input type=text name="addr1" size="40" value="南通市崇川区青年东路11号"/></td>
</tr><tr>
  <td>地址2:</td><td><input type=text name="addr2" size="40" value="南通市崇川区中南世纪花城"></td>
</tr><tr>
  <td>城市:</td><td><input type=text name="city" value="南通市"/></td>
</tr><tr>
  <td>区、县</td><td><input type=text name="state" size="4" value="崇川区"/></td>
</tr><tr>
  <td>邮政编码:</td><td><input type=text name="zip" size="10" value="212000"/></td>
</tr><tr>
  <td>国籍:</td><td><input type=text name="country" size="15" value="中国"/></td>
</tr>
</table>

<h3>个人喜好</h3>

<table>
  <tr>
    <td>喜爱的语言:</td><td>
          <select name="langpref">
       <option>ENGLISH</option>
        <option>CHINESE</option>
 
      </select></td>
  </tr><tr>
  <td>喜欢的动物类别:</td><td>
     <select name="favcategory">
         <option >CATS</option>
         <option>DOGS</option>
         <option>FISH</option>
         <option>REPTILES</option>
           <option>BIRD</option>
     </select></td>
</tr><tr>
  <td>根据喜爱动物类别为您推荐</td><td><input type="checkbox" name="mylistopt" selected/></td>
</tr><tr>
  <td>是否植入广告</td><td><input type="checkbox" name="banneropt" selected/></td>
</tr>

</table>
