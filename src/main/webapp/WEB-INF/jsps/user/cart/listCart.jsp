<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Cart</title>
</head>
<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/trang-chu/"/>">Home</a> <span class="divider">/</span></li>
				<li class="active">Check Out</li>
			</ul>
			<div class="well well-small">
				<h1>
					Check Out <small class="pull-right"> ${TotalQuantityCart} Items are in your
						cart </small>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							  <th>Image</th>
			                  <th>Description</th>
			                  <th>Color</th>
			                  <th>Price</th>
			                  <th>Quantity</th>
			                  <th>Update</th>
			                  <th>Delete</th>
			                  <th>Total Price</th>
						</tr>
					</thead>
					<tbody>
							<c:forEach var="item" items="${Cart}">
								<tr>
								  <c:forEach var="color" items="${item.value.product.listColor}">
								  	
								  		<td><a href="<c:url value="/trang-chu/product-detail/${item.value.product.product_id}"/>"><img width="100" src="<c:url value="/assets/user/img/${color.img}"/>" alt=""></a></td>
								  	
								  		
								  </c:forEach>
				                  	
				                  <td>${ item.value.product.title }</td>
				                  <c:forEach var="color" items="${item.value.product.listColor}">
				                    <td><span class="shopBtn" style="background-color: ${color.code};"><span class="icon-ok"></span></span> </td>
				                  </c:forEach>
				                  
				                  <td><fmt:formatNumber type="number" groupingUsed="true" value="${TotalPriceCart}"/> $</td>
				                  <td>
									<input type="number" min="0" max="1000" class="span1" style="max-width:34px" placeholder="1" id="quantity-cart-${item.key}" size="16" type="text" value="${item.value.quantity}">
								  </td>
				                  <td>
				                  	<button data-id="${item.key}" class="btn btn-mini btn-danger edit-cart" type="button">
				                  		<span class="icon-edit"></span>
				                  	</button>
				                  </td>
				                  <td>
				                  	<a href="<c:url value="/trang-chu/deleteCart/${item.key}"/>" class="btn btn-mini btn-danger" type="button">
				                  		<span class="icon-remove"></span>
				                  	</a>
				                  </td>
				                  <td><fmt:formatNumber type="number" groupingUsed="true" value="${item.value.totalPrice}"/> $</td>
				                </tr>
							</c:forEach>
								
					</tbody>
				</table>
				<br />
				<a href="products.html" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Continue Shopping </a> <a
					href="login.html" class="shopBtn btn-large pull-right">Next <span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
<script type="text/javascript">
	$(".edit-cart").on("click", function(){
		var product_id = $(this).data("id";)
		var quantity  = $("#quantity-cart-"+product_id).val();
		alert(quantity);
		window.location = "/trang-chu/editCart/"+product_id+"/"+quantity;
	})
</script>
</body>
</html>