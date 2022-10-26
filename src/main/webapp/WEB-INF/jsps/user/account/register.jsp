<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${listCat}">
						<li><a
							href='<c:url value="/trang-chu/product-cat/${item.id_category}"/>'>
								<span class="icon-circle-bl	ank"></span>${item.name}</a></li>
					</c:forEach>
					<li><a class="totalInCart" href="cart.html"><strong>Total
								Amount <span class="badge badge-warning pull-right"
								style="line-height: 18px;">${TotalPriceCart} $</span>
						</strong></a></li>
				</ul>
			</div>
			<div class="well well-small">
				<a href="#"><img src="<c:url value="/assets/user/img/paypal.jpg"/>"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
			<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
			</ul>

		</div>
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="index.html">Home</a> <span class="divider">/</span></li>
				<li class="active">Login</li>
			</ul>
			<h3>Login</h3>
			<hr class="soft" />

			<div class="row">
				<div class="span4">
					<div class="well">
						<h5>CREATE YOUR ACCOUNT</h5>
						<h3>${status}</h3>
						<h3>${message}</h3>
						<br />
						<br />
						<form:form action="register" method="post" modelAttribute="acc">
							<div class="control-group">
								<label class="control-label" for="inputUsername">Username</label>
								<div class="controls">
									<form:input type="text" class="span3" placeholder="Please input your usename" required="required" path="username"/>
								</div>
								<label class="control-label" for="inputEmail">E-mail
								</label>
								<div class="controls">
									<form:input type="email" class="span3" placeholder="Please input your email" required="required" path="email"/>
								</div>
								<label class="control-label" for="inputPassword">Password
								</label>
								<div class="controls">
									<form:input type="password" class="span3" placeholder="Please input your password" required="required" path="password"/>
								</div>
								<label class="control-label" for="inputFullname">Fullname
								</label>
								<div class="controls">
									<form:input type="text" class="span3" placeholder="Please input your fullname" required="required" path="fullname"/>
								</div>
								<label class="control-label" for="inputAddress">Address
								</label>
								<div class="controls">
									<form:input type="text" class="span3" placeholder="Please input your address" required="required" path="address"/>
								</div>
								<label class="control-label" for="inputPhone">Phone
								</label>
								<div class="controls">
									<form:input type="text" class="span3" placeholder="Please input your phone" required="required" path="phone"/>
								</div>
							</div>
							<div class="controls">
								<button type="submit" class="btn block">Create Your
									Account</button>
							</div>
						</form:form>
					</div>
				</div>
				<div class="span1">&nbsp;</div>
				<div class="span4">
					<div class="well">
						<h5>ALREADY REGISTERED ?</h5>
						<form:form action="login" method="post" modelAttribute="acc">
							<div class="control-group">
								<label class="control-label" for="inputEmail">Email</label>
								<div class="controls">
									<form:input type="email" class="span3" placeholder="Please input your email" path="email"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputPassword">Password</label>
								<div class="controls">
									<form:input type="password" class="span3" placeholder="Please input your password" path="password"/>
								</div>
							</div>
							<div class="control-group">
								<div class="controls">
									<button type="submit" class="defaultBtn">Sign in</button>
									<a href="#">Forget password?</a>
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>