<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<title>Home page</title>
<body>

	<!-- --------Body section -->
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

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"> <img
					src='<c:url value="/assets/user/img/paypal.jpg"/>'
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
				<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value="/assets/user/img/cap-1.jpg"/>"
							alt="Shirt pink">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">100$</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value="/assets/user/img/cap-2.jpg"/>"
							alt="Shirt red">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">120$</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value="/assets/user/img/cap-3.jpg"/>"
							alt="Shirt black">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">150$</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">
					<div class="carousel-inner">
						<c:forEach var="item" items="${listSlides}" varStatus="index">
							<c:if test="${index.first}">
								<div class="item active">
							</c:if>
							<c:if test="${not index.first}">
								<div class="item">
							</c:if>

							<img style="width: 100%"
								src="<c:url value="/assets/user/img/${item.img}"/>"
								alt="product 1">
							<div class="carousel-caption">
								<h4 style="font-size: 14px">${item.caption}</h4>
								<br/>
								<p style="font-size: 14px">
									<span>${item.content}</span>
								</p>
							</div>
					</div>
					</c:forEach>
				</div>
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
					href="#myCarousel" data-slide="next">&rsaquo;</a>
			</div>
 		</div>
		<!--
New Products
-->
		<div class="well well-small">
			<h3>New Products</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<div id="newProductCar" class="carousel slide">
					<div class="carousel-inner">
					<c:if test="${listProNew.size()>0}">
							<div class="item active">
								<ul class="thumbnails">
								<c:forEach  var="item" items="${listProNew}" varStatus="loop" >
									<li class="span4">
												<div class="thumbnail">
													<a class="zoomTool" href="product_details.html"
														title="add to cart"><span class="icon-search"></span>
														QUICK VIEW</a> <a href='<c:url value="/trang-chu/product-detail/${item.product_id}"/>'>
														<c:forEach var="color" items="${item.listColor}">
															<img src="<c:url value="/assets/user/img/${color.img}"/>"
																alt="">
														</c:forEach>
													</a>
												</div>
									</li>
									<c:if test="${(loop.index + 1) % 3==0 || (loop.index + 1)==listProNew.size()}">
											</ul>
										</div>
										<c:if test="${(loop.index+1)<listProNew.size()}">
											<div class="item">
												<ul class="thumbnails">
										</c:if>
									</c:if>
								</c:forEach>
							</div>
								
					</c:if>
					
					<a class="left carousel-control" href="#newProductCar"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#newProductCar" data-slide="next">&rsaquo;</a>
				</div>
			</div>

		</div>
		<!--
	Featured Products
	-->
		<div class="well well-small">
			<h3>
				<a class="btn btn-mini pull-right" href="products.html"
					title="View more">VIew More<span class="icon-plus"></span></a>
				Featured Products
			</h3>
			<hr class="soften" />
			<div class="row-fluid">
			
				<c:if test="${listProHighlight.size()>0}">
					<ul class="thumbnails">
						<c:forEach var="item" items="${listProHighlight}" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href='<c:url value="/trang-chu/product-detail/${item.product_id}"/>'> 
										<c:forEach
											var="color" items="${item.listColor}">
											<img src="<c:url value="/assets/user/img/${color.img}"/>"
												alt="">
										</c:forEach>
									</a>
									<div class="caption">
										<h5>${item.productname}</h5>
										<h4>
											<a class="defaultBtn" href="product_details.html"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="<c:url value="/trang-chu/addCart/${item.product_id}"/>" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price}"/>$</span>
										</h4>
									</div>
								</div>
							</li>
							<c:if test="${(loop.index+1)%3 == 0 || (loop.index+1) == listProHighlight.size() }">
					</ul>
								<c:if test="${(loop.index+1) < listProHighlight.size()}">
									<ul class="thumbnails">
								</c:if>	
							</c:if>
						</c:forEach>
				</c:if>
			</div>
		</div>

		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="#">View more <span
				class="icon-plus"></span></a> Popular Products
		</div>
		<hr>
		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="#">View more <span
				class="icon-plus"></span></a> Best selling Products
		</div>
	</div>
	</div>
	<!-- 
Clients 
-->
	<section class="our_client">
		<hr class="soften" />
		<h4 class="title cntr">
			<span class="text">Arsenal FC</span>
		</h4>
		<hr class="soften" />
		<div class="row">
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="/assets/user/img/1.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="/assets/user/img/2.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="/assets/user/img/3.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="/assets/user/img/4.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="/assets/user/img/5.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="/assets/user/img/6.png"/>"></a>
			</div>
		</div>
	</section>
</body>