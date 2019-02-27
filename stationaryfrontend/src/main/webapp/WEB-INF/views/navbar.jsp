<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbAE+QkPxCAFlNEevoEH3Sl0sibBcOQVnN"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="cr" value="${pageContext.request.contextPath}" />
<style>
/*============ Rotate Bar style ============*/
.p0 {
	padding: 0 !important;
}

ul, ol, li {
	margin: 0;
	padding: 0;
	list-style: none;
}

a, a:hover, a:focus {
	display: inline-block;
	outline: none;
	text-decoration: none;
}

.rotate-bar {
	background: #404041;
	height: 60px;
	overflow-x: hidden;
}

.title {
	background: #e51937 none repeat scroll 0 0;
	color: #ffffff;
	font-size: 20px;
	font-family: Monotype Corsiva;
	font-style: oblique;
	font-weight: bolder;
	line-height: 60px;
	position: relative;
	text-align: center;
	text-transform: uppercase;
}

.title::after {
	background: #e51937;
	bottom: 0;
	content: "";
	display: block;
	height: 60px;
	position: absolute;
	right: -29px;
	top: 0;
	width: 60px;
	transform: skew(-30deg);
}

.tab-menu {
	position: relative;
}

.tab-menu ul li {
	float: left;
	border-right: 1px solid #e51937;
	transform: skew(-30deg);
}

.tab-menu ul li a {
	color: #ffffff;
	display: block;
	font-size: 18px;
	font-weight: normal;
	line-height: 60px;
	padding: 0 15px;
	text-transform: uppercase;
	-webkit-transition: all 700ms ease;
	-moz-transition: all 700ms ease;
	-ms-transition: all 700ms ease;
	-o-transition: all 700ms ease;
	transition: all 700ms ease;
}

.tab-menu ul li a:hover, .tab-menu ul li.active a {
	background: #e51937;
}

.tab-menu ul li a span {
	transform: skew(30deg);
	font-family: Monotype Corsiva;
	font-size: 15px;
	font-style: oblique;
	display: block;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

.navbar {
	overflow: hidden;
	background-color: #333;
}

.navbar a {
	float: left;
	font-size: 16px;
	color: white;
	text-align: center;
	padding: 14px 14px;
	text-decoration: none;
}

#cart {
	color: #ffffff;
	font-family: Monotype Corsiva;
	font-size: 15px;
	font-style: oblique;
}
</style>


<!--================= Rotate Bar ==================-->
<div class="rotate-bar">
	<div class="container-fluid p0">
		<div class="row">

			<div class="col-md-3">
				<div class="title">Artful Stationary</div>
			</div>

			<div class="col-md-9">
				<div class="tab-menu">
					<c:choose>
						<c:when test="${sessionScope.UserloggedIn}">
							<ul class="pull-right">
								<li><a href="${cr}/home"><span>Home</span></a></li>
								<!--<li class="active">-->
								<li><a href="${cr}/aboutus"><span>About us</span></a></li>
								<li><a href="${cr}/contactus"><span>Contact Us</span></a></li>
								<li><a href="${cr}/viewallproduct"><span>View
											All Products</span></a></li>

								<li><a href="${cr}/user/viewcart" id="cart"><i
										class="fa-fa-shopping-cart"></i>Cart ${sessionScope.itemcount}<span class="badge">
											</span></a></li>


								<li><a href=""><span>Welcome!&nbsp; ${loginName}</span></a></li>
								<li><a href="${cr}/logout"><span>Logout</span></a></li>
							</ul>

						</c:when>
						<c:when test="${sessionScope.SupplierLoggedIn}">
							<ul class="pull-right">
								<li><a href="${cr}/home"><span>Home</span></a></li>
								<li><a href="${cr}/aboutus"><span>About us</span></a></li>
								<li><a href="${cr}/contactus"><span>Contact Us</span></a></li>
								<li><a href="${cr}/supplier/product"><span>Product</span></a></li>
								<li><a href=""><span>Welcome!&nbsp; ${loginName}</span></a></li>
								<li><a href="${cr}/logout"><span>Logout</span></a></li>
							</ul>

						</c:when>
						<c:when test="${sessionScope.AdminLoggedIn}">
							<ul class="pull-right">
								<li><a href="${cr}/home"><span>Home</span></a></li>
								<li><a href="${cr}/aboutus"><span>About us</span></a></li>
								<li><a href="${cr}/contactus"><span>Contact Us</span></a></li>
								<li><a href="${cr}/admin/category"><span>Category</span></a></li>
								<li><a href=""><span>Welcome!&nbsp; ${loginName}</span></a></li>
								<li><a href="${cr}/logout"><span>Logout</span></a></li>
							</ul>

						</c:when>
						<c:otherwise>
							<ul class="pull-right">
								<li><a href="${cr}/home"><span>Home</span></a></li>
								<li><a href="${cr}/signup"><span>SignUp</span></a></li>
								<!--<li class="active">-->
								<li><a href="${cr}/login"><span>SignIn</span></a></li>
								<li><a href="${cr}/rsupplier"><span>Supplier
											Register</span></a></li>
								<li><a href="${cr}/aboutus"><span>About us</span></a></li>
								<li><a href="${cr}/contactus"><span>Contact Us</span></a></li>
								<li><a href="${cr}/viewallproduct"><span>View
											All Products</span></a></li>
							</ul>
						</c:otherwise>
					</c:choose>

				</div>

			</div>
		</div>
	</div>
</div>
