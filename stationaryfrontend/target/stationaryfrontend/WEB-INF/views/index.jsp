
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Artful Stationary</title>

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>

	<jsp:include page="navbar.jsp" />
	<div style="min-height: 400px">
		<c:if test="${carousel}">
			<jsp:include page="carousel.jsp" />
		</c:if>
		<c:if test="${signin}">
			<jsp:include page="signin.jsp" />
		</c:if>
		<c:if test="${signup}">
			<jsp:include page="signup.jsp" />
		</c:if>
		<c:if test="${contactus}">
			<jsp:include page="contactus.jsp" />
		</c:if>
		<c:if test="${aboutus}">
			<jsp:include page="aboutus.jsp" />
		</c:if>
		<c:if test="${catpage}">
			<jsp:include page="category.jsp" />
		</c:if>
		<c:if test="${cartpage}">
			<jsp:include page="cart.jsp" />
		</c:if>
		<c:if test="${supplierpage}">
			<jsp:include page="supplier.jsp" />
		</c:if>
		<c:if test="${prodpage}">
		<jsp:include page="product.jsp" />
		</c:if>
		<c:if test="${allproductpage}">
		<jsp:include page="viewallproduct.jsp" />
		</c:if>
		<c:if test="${oneproductpage}">
		<jsp:include page="viewoneproduct.jsp" />
		</c:if>
		<c:if test="${addresspage}">
		<jsp:include page="address.jsp"/>
		</c:if>

	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
