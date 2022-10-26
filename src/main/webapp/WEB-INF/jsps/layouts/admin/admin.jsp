<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Admin Page</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="<c:url value="/assets/admin/img/favicon.png"/>" rel="icon">
  <link href="<c:url value="/assets/admin/img/apple-touch-icon.png"/>" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="<c:url value="/assets/admin/vendor/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet"/>
  <link href="<c:url value="/assets/admin/vendor/bootstrap-icons/bootstrap-icons.css"/>" rel="stylesheet"/>
  <link href="<c:url value="/assets/admin/vendor/boxicons/css/boxicons.min.css"/>" rel="stylesheet"/>
  <link href="<c:url value="/assets/admin/vendor/quill/quill.snow.css"/>" rel="stylesheet"/>
  <link href="<c:url value="/assets/admin/vendor/quill/quill.bubble.css"/>" rel="stylesheet"/>
  <link href="<c:url value="/assets/admin/vendor/remixicon/remixicon.css"/>" rel="stylesheet"/>

  <!-- Template Main CSS File -->
  <link href="<c:url value="/assets/admin/css/style.css"/>" rel="stylesheet">

  <!-- =======================================================
  * Template Name: NiceAdmin - v2.4.1
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>
<body>
	<%@include file="/WEB-INF/jsps/layouts/admin/header.jsp" %>
		<!-- Body section -->

		<decorator:body />

		<!-- Footer
		-->
	<%@include file="/WEB-INF/jsps/layouts/admin/footer.jsp" %>
	

</body>
 <!-- Vendor JS Files -->
  <script src="<c:url value="/assets/admin/vendor/apexcharts/apexcharts.min.js"/>"></script>
  <script src="<c:url value="/assets/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
  <script src="<c:url value="/assets/admin/vendor/chart.js/chart.min.js"/>"></script>
  <script src="<c:url value="/assets/admin/vendor/echarts/echarts.min.js"/>"></script>
  <script src="<c:url value="/assets/admin/vendor/quill/quill.min.js"/>"></script>
  <script src="<c:url value="/assets/admin/vendor/php-email-form/validate.js"/>"></script>

  <!-- Template Main JS File -->
  <script src="<c:url value="/assets/admin/js/main.js"/>"></script>

</html>