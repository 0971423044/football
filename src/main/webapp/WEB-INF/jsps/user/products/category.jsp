<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<head>
<meta charset="ISO-8859-1">
<title>Product Category</title>
<style type="text/css">	
	.pagination {
	  display: flex;
	  justify-content:center;
	}
	
	.pagination a {
	  color: black;
	  float: left;
	  padding: 8px 16px;
	  text-decoration: none;
	}
	
	.pagination a.active {
	  background-color: #4CAF50;
	  color: white;
	}
	
	.pagination a:hover:not(.active) {background-color: #ddd;}
</style>
</head>
<body>
 <div class="well well-small">
		<h3>Products</h3>
		<h3>Category id: ${idcat}</h3>
		<h3>Total product by cat: ${listProByCat.size()}</h3>
		
		<c:if test="${listProByCat.size()>0}">
					<div class="row-fluid">
					<ul class="thumbnails">
						<c:forEach var="item" items="${listProByCat}" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="<c:url value="/trang-chu/product-detail/${item.product_id}"/>"> 
										<c:forEach
											var="color" items="${item.listColor}">
											<img src="<c:url value="/assets/user/img/${color.img}"/>"
												alt="">
										</c:forEach>
									</a>
									<div class="caption">
										<h5>${item.productname}</h5>
										<h4>
											<a class="defaultBtn" href="<c:url value="/trang-chu/product-detail/${item.product_id}"/>"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="#" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price}"/>$</span>
										</h4>
									</div>
								</div>
							</li>
							<c:if test="${(loop.index+1)%3 == 0 || (loop.index+1) == listProHighlight.size() }">
					</ul>
					</div>
								<c:if test="${(loop.index+1) < listProByCat.size()}">
									<ul class="thumbnails">
								</c:if>	
							</c:if>
						</c:forEach>
		</c:if>
		
  </div>
  <div class="pagination">
  	<c:forEach var="item" begin="1" end="${paginateInfo.totalPage}" varStatus="loop">
  		<c:if test="${(loop.index)==paginateInfo.currentPage}">
  			<a href="<c:url value="product-detail/${idcat}/${loop.index}"/>" class="active">${loop.index}</a>
  		</c:if>
  		<c:if test="${(loop.index)!= paginateInfo.currentPage}">
  			<a href="<c:url value="product-detail/${idcat}/${loop.index}"/>">${loop.index}</a>
  		</c:if>
  	</c:forEach>
	 
	</div>
</body>
</html>