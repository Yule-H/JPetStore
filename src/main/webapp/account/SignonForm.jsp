<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog">
	<form action="<%=basePath%>catalog/login.action" method="POST">

		<p>请输入您的用户名和密码.</p>
		<p>
			用户名:<input type="text" name="username" value="j2ee" /> <br /> 
			密&nbsp;码:<input type="password" name="password" value="j2ee" />
		</p>
		<input type="submit" name="submit" value="登录" />

	</form>

	需要用户名和密码？ <a href="<%=basePath%>account/register.action">立即注册!</a>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>

