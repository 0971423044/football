<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout Your Cart</title>
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
			  <div class="well well-small" ><a href="#"><img src="<c:url value="/assets/user/img/paypal.jpg"/>" alt="payment method paypal"></a></div>
			
			<a class="shopBtn btn-block" href="#">Upcoming products <br><small>Click to view</small></a>
			<br>
			<br>
			
	</div>
	<div class="span9">
    <ul class="breadcrumb">
		<li><a href="<c:url value="/trang-chu/your-cart"/>">Your Cart</a> <span class="divider">/</span></li>
		<li class="active">Checkout</li>
    </ul>
	<h3> Checkout your cart</h3>	
	<hr class="soft"/>


<div class="well">
	<form:form action="checkout" class="form-horizontal" method="post" modelAttribute="bill" >
		<h3>Your Billing Details</h3>
		<div class="control-group">
			<label class="control-label">Full name<sup>*</sup></label>
			<div class="controls">
			  <form:input type="text" placeholder=" Please input your fullname" path="fullname"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Email<sup>*</sup></label>
			<div class="controls">
			  <form:input type="text" placeholder=" Please input your email" path="email"/>
			</div>
		</div>
		 <div class="control-group">
			<label class="control-label">Phone<sup>*</sup></label>
			<div class="controls">
			  <form:input type="text" placeholder=" Please input your phone" path="phone" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Address<sup>*</sup></label>
			<div class="controls">
			  <form:textarea path="address" rows="5" cols="30"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Note<sup>*</sup></label>
			<div class="controls">
			  <form:textarea path="note" rows="5" cols="30"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Ship COD<sup>*</sup></label>
			<div class="controls">
			  <form:checkbox placeholder=" Field name" path="shipCod"/>
			</div>
		</div>
	<div class="control-group">
		<div class="controls">
		 <input type="submit" name="submitAccount" value="Yes, Checkout" class="shopBtn exclusive" />
		</div>
	</div>
	</form:form>
</div>


<div class="well">
</div>


</div>
</div>
</body>
</html>