<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<link rel="StyleSheet" href="<%=basePath%>/css/jpetstore.css"
	type="text/css" media="screen" />

<head>
<meta name="generator"
	content="HTML Tidy for Linux/x86 (vers 1st November 2002), see www.w3.org" />
<title>JPetStore 案例</title>
<meta content="text/html; charset=windows-1252"
	http-equiv="Content-Type" />
<meta http-equiv="Cache-Control" content="max-age=0" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="Expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
<meta http-equiv="Pragma" content="no-cache" />
<script src="js/jquery-3.3.1.js"></script>
</head>

<body>

	<div id="Header">

		<div id="Logo">
			<div id="LogoContent">
				<a href="<%=basePath%>catalog/main.action"> 
					<img width="227" src="<%=basePath%>/images/logo-topbar.gif" />
				</a>
			</div>
		</div>

		<div id="Menu">
			<div id="MenuContent">
				<a href="<%=basePath%>cart/cartList.action">
					<img align="middle" name="img_cart" src="<%=basePath%>/images/cart.gif" />
				</a> 
				<img align="middle" src="<%=basePath%>/images/separator.gif" />
				<c:if test="${sessionScope.login==null }">
					<a href="<%=basePath%>account/tologin.action">登录</a>
				</c:if>
				<c:if test="${sessionScope.login!=null }">
					<a href="<%=basePath%>account/logout.action">登出</a>
					<img align="middle" src="<%=basePath%>/images/separator.gif" /> 
					<a href="<%=basePath%>account/edit.action">我的账户</a>
				</c:if>
			</div>
		</div>

		<div id="Search">
			<div id="SearchContent">
				<form method="post" action="">
					<input name="keyword" size="14" />&nbsp; <input type="submit"
						name="SearchButton" value="搜索" />
				</form>
			</div>
		</div>

		<div id="QuickLinks">
			<a href="<%=basePath%>catalog/list.action?cate=FISH"> <img
				src="<%=basePath%>/images/sm_fish.gif" /></a> <img
				src="<%=basePath%>/images/separator.gif" /> <a
				href="<%=basePath%>catalog/list.action?cate=DOGS"> <img
				src="<%=basePath%>/images/sm_dogs.gif" /></a> <img
				src="<%=basePath%>/images/separator.gif" /> <a
				href="<%=basePath%>catalog/list.action?cate=REPTILES"> <img
				src="<%=basePath%>/images/sm_reptiles.gif" /></a> <img
				src="<%=basePath%>/images/separator.gif" /> <a
				href="<%=basePath%>catalog/list.action?cate=CATS"> <img
				src="<%=basePath%>/images/sm_cats.gif" /></a> <img
				src="<%=basePath%>/images/separator.gif" /> <a
				href="<%=basePath%>catalog/list.action?cate=BIRDS"> <img
				src="<%=basePath%>/images/sm_birds.gif" /></a>
		</div>

	</div>

	<div id="Content"></div>