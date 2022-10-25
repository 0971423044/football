<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<title>Product Detail</title>
<body>
	<!-- 
Body Section 
-->
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Home</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Product</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Service</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Contact</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>About</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Cart</a></li>
	
					<li><a class="totalInCart" href="cart.html"><strong>Total
								Amount <span class="badge badge-warning pull-right"
								style="line-height: 18px;">$448.42</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br>
					<br>
					<a class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img src="assets/img/paypal.jpg"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
			<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-ecommerce-templates.png"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/shopping-cart-template.png"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-template.png"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/trang-chu/"/>">Home</a> <span class="divider">/</span></li>
				<li><a href="#">Product</a> <span class="divider">/</span></li>
				<li class="active">Detail</li>
			</ul>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<c:forEach var="color" items="${product.listColor}">
										<a href="#"> <img src="<c:url value="/assets/user/img/${color.img}"/>" alt=""
										style="width: 100%"></a>
									</c:forEach>
									
								</div>
							</div>
							<a class="left carousel-control" href="#myCarousel"
								data-slide="prev">‹</a> <a class="right carousel-control"
								href="#myCarousel" data-slide="next">›</a>
						</div>
					</div>
					<div class="span7">
						<h3>${product.productname}</h3>
						<hr class="soft" />

						<form class="form-horizontal qtyFrm" method="get" action="<c:url value="addCart/${product.product_id}"/>">
							<div class="control-group">
								<label class="control-label"><span><fmt:formatNumber type="number" groupingUsed="true" value="${product.price}"></fmt:formatNumber>$</span></label>
								<div class="controls">
									<input type="number" class="span6" placeholder="Qty.">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label"><span>Color</span></label>
								<div class="controls">
									<select class="span11">
										<option>Red</option>
										<option>Purple</option>
										<option>Pink</option>
										<option>Red</option>
									</select>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label"><span>Materials</span></label>
								<div class="controls">
									<select class="span11">
										<option>Material 1</option>
										<option>Material 2</option>
										<option>Material 3</option>
										<option>Material 4</option>
									</select>
								</div>
							</div>
							<h4>${product.title}</h4>
							<p>Nowadays the lingerie industry is one of the most
								successful business spheres. Nowadays the lingerie industry is
								one of ...
							<p>
								<button type="submit" class="shopBtn">
									<span class=" icon-shopping-cart"></span> Add to cart
								</button>
						</form>
					</div>
				</div>
				<hr class="softn clr" />


				<ul id="productDetail" class="nav nav-tabs">
					<li class="active"><a href="#home" data-toggle="tab">Product
							Details</a></li>
					<li class=""><a href="#profile" data-toggle="tab">Related
							Products </a></li>
					
				</ul>
				<div id="myTabContent" class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">
						
						${product.detail}
					</div>
					<div class="tab-pane fade" id="profile">
					<c:set var="countList" value="${listProByCat.size()}"/>
						<c:if test="${listProByCat.size()>3}">
							<c:set var="countList" value="3"/>
						</c:if>
						<c:forEach var="item" items="${listProByCat}" begin="1" end="${countList}" varStatus="loop">
							<div class="row-fluid">
								<div class="span2">
									<c:forEach var="color" items="${item.listColor}">
										<img src="<c:url value="/assets/user/img/${color.img}"/>" alt="">
									</c:forEach>
									
								</div>
								<div class="span6">
									<h5>${item.productname}</h5>
									<p>Nowadays the lingerie industry is one of the most
										successful business spheres. We always stay in touch with the
										latest fashion tendencies - that is why our goods are so
										popular..</p>
								</div>
								<div class="span4 alignR">
									<form class="form-horizontal qtyFrm">
										<h3>${item.price}$</h3>
										<label class="checkbox"> <input type="checkbox">
											Adds product to compair
										</label><br>
										<div class="btn-group">
											<a href="product_details.html" class="defaultBtn"><span
												class=" icon-shopping-cart"></span> Add to cart</a> <a
												href="product_details.html" class="shopBtn">VIEW</a>
										</div>
									</form>
								</div>
							</div>
							<hr class="soft">
						</c:forEach>
							
					</div>
					
				</div>

			</div>
		</div>
	</div>
	<!-- Body wrapper -->
</body>