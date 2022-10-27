	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<header id="header">
	<div class="row">
		<div class="span4">
			<h1>
				<a class="logo" href='<c:url value="/trang-chu/"/>'><span>Twitter Bootstrap
						ecommerce template</span> <img
					src="<c:url value="/assets/user/img/arsenal-logo-shopping-cart.png"/>"
					alt="bootstrap sexy shop"> </a>
			</h1>
		</div>
		<div class="span4">
			<div class="offerNoteWrapper">
				<h1 class="dotmark">
					<i class="icon-cut"></i> North London is Red
				</h1>
			</div>
		</div>
		<div class="span4 alignR">
			<p>
				<br> <strong> Support (24/7) : 0971423044 </strong><br>
				<br>
			</p>
			<span class="btn btn-mini"><a href="<c:url value="/trang-chu/your-cart"/>">[ ${TotalQuantityCart} ]</a><span
				class="icon-shopping-cart"></span></span> <span
				class="btn btn-warning btn-mini">$</span> <span class="btn btn-mini">&pound;</span>
			<span class="btn btn-mini">&euro;</span>
		</div>
	</div>
</header>

<!--
Navigation Bar Section 
-->
<div class="navbar">
	<div class="navbar-inner">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="nav-collapse">
				<ul class="nav">
				<!-- <c:forEach var="item" items="${listMenus}">
						<li class="active"><a href="index.html">${item.name}</a></li>
					</c:forEach>
				 -->
					<li class="active"><a href="<c:url value="/trang-chu/"/>">Home</a></li>
					<li class="active"><a href="<c:url value="/trang-chu/product"/>">Product</a></li>
					<li class="active"><a href="<c:url value="/trang-chu/"/>">Service</a></li>
					<li class="active"><a href="<c:url value="/trang-chu/"/>">Contact</a></li>
					<li class="active"><a href="<c:url value="/trang-chu/"/>">About</a></li>
					<li class="active"><a href="<c:url value="/trang-chu/your-cart"/>">Cart</a></li>
					
					
				</ul>
				<form action="#" class="navbar-search pull-left">
					<input type="text" placeholder="Search" class="search-query span2">
				</form>
				<ul class="nav pull-right">
					<c:if test="${empty accLoginInfo}">
						<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"><span class="icon-lock"></span>
						 <b class="caret"></b></a>
						<div class="dropdown-menu">
							
						</div></li>
					</c:if>
					<c:if test="${not empty accLoginInfo}">
						<li><a href="#">${accLoginInfo.username}<b class="caret"></b></a></li>
					</c:if>
					
				</ul>
			</div>
		</div>
	</div>
</div>