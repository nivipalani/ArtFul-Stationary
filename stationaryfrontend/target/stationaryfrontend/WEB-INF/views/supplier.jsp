<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
/*By DjelalEddine@gmail.com*/
#user .avatar {
	width: 60px;
}

#user .avatar>img {
	width: 50px;
	height: 50px;
	border-radius: 10%;
}
/*Card*/
#user .panel-thumb {
	margin: 5px auto;
	text-align: center;
}

#user .panel-thumb .avatar-card {
	text-align: center;
	height: 200px;
	margin: auto;
	overflow: hidden;
}

#user .panel-thumb .avatar-card>img {
	max-width: 200px;
	max-height: 200px;
}

/* table*/
#user .panel-table {
	animation-duration: 3s;
}

#user .panel-table .panel-body .table {
	margin: 0px;
}

#user .panel-table .panel-body {
	padding: 0px;
}

#user .panel-table .panel-body .table-bordered>thead>tr>th {
	text-align: center;
}

#user .panel-table .panel-footer {
	height: 60px;
	padding: 0px;
}

.error {
	color: red;
}

.error2 {
	color: green;
}

.form-type-one {
	padding: 80px 0px;
	background-color: #fafbf6;
	position: relative;
}

.form-type-one .form-warp {
	padding-right: 80px;
	padding-left: 80px;
}

.form-type-one .form-card {
	background-color: #fff;
	margin-left: 20%;
	margin-right: 20%;
	border-radius: 20px;
	padding-top: 15px;
	-webkit-box-shadow: 2px 22px 63px -17px rgba(24, 139, 240, 0.62);
	-moz-box-shadow: 2px 22px 63px -17px rgba(24, 139, 240, 0.62);
	box-shadow: 2px 22px 63px -17px rgba(24, 139, 240, 0.62);
}

.form-type-one .form {
	padding-left: 15px;
	padding-right: 15px;
}

.form-type-one .form img {
	text-align: center;
	margin-left: auto;
	display: block;
	margin-right: auto;
}

.form-type-one .form-control {
	height: 36px;
	padding: 6px 6px;
	font-size: 13px;
	line-height: 1.428571;
	color: #476787;
	background-color: #fff;
	background-image: none;
	border-image-source: linear-gradient(#3c9ef9, #71edf9);
	border-width: 1pt;
	border-image-slice: 1;
}

.form-type-one label {
	font-weight: bold;
	font-size: 13px;
	font-family: 'Comfortaa';
	color: #476787;
}

.form-type-one .form-btn {
	margin-top: 50px;
	width: 100%;
	display: block;
	font-family: 'Comfortaa';
	font-weight: bold;
	font-size: 14px;
	text-align: center;
	border-radius: 0px 0px 20px 20px;
	color: #fff;
	text-decoration: none;
	border-bottom-color: #e51937;
	border: solid 0px;
	padding: 15px 25px;
	letter-spacing: 2px;
	background-color: #e51937;
}

.form-type-one h3 {
	/*    font-weight: bold;*/
	margin-bottom: 20px;
	margin-top: 20px;
	font-family: 'Comfortaa';
	color: #476787;
	text-align: center;
}

.form-type-one p {
	margin-bottom: 20px;
	font-family: 'Comfortaa';
	color: #476787;
	text-align: center;
}

.art-right {
	position: absolute;
	right: 0px;
	bottom: 0px;
	z-index: 9;
}

.art-left {
	position: absolute;
	left: 0px;
	bottom: 0px;
	z-index: 9;
}

@media screen and (max-width: 768px) {
	.form-type-one .form-warp {
		padding-right: 0px;
		padding-left: 0px;
	}
}
</style>
<
<script type="text/javascript">
	function filter($state) {
		var x = document.getElementsByClassName($state);
		var btn = document.getElementById($state);

		if (btn.className == "btn") {
			btn.className = btn.dataset.class;
			for (i = 0; i < x.length; i++) {
				x[i].className = " animated fadeInLeft " + $state;
			}
		} else {
			for (i = 0; i < x.length; i++) {
				x[i].className = " animated fadeOutRight " + $state;
			}
			btn.className = "btn";
		}

	}
</script>
<section class="form-type-one">
	<div class="container ">
		<div class="row ">
			<div class="col-md-12 col-md-offset-3">
				<div class="form-warp">
					<div class="form-card">
						<div class="form">
							<div class="form-content">
								<c:if test="${Success}">
									<div class="alert alert-success">
										<strong>Success</strong> Data Inserted in Database
									</div>
								</c:if>
								<c:if test="${Error1}">
									<div class="alert alert-danger">
										<strong>Danger</strong> Incorrrect Data..Enter Correct Data
									</div>
								</c:if>
								<c:if test="${Error2}">
									<div class="alert alert-warning">
										<strong>Warning</strong> Data already exists in Database
									</div>
								</c:if>
								<c:if test="${Error3}">
									<div class="alert alert-warning">
										<strong>Warning</strong>Please contact the Administrater
									</div>
								</c:if>

								<c:if test="${edit}">
									<c:set var="url" value="updateSupplier"></c:set>
								</c:if>

								<c:if test="${!edit}">
									<c:set var="url" value="addSupplier"></c:set>
								</c:if>

								<form:form action="${url}" modelAttribute="mysupplier"
									method="Post">
									<div class="form-group">
											<label><font size="5">Supplier</font> </label>
									</div>

									<c:if test="${edit}">
										<div class="form-group">
											<label for="email"> Supplier ID:</label>
											<form:input type="text" name="sup_id"
 												class="form-control my-input" id="id" 
												placeholder="Supplier ID" path="supplier_Id" readonly="true" /> 
										</div>
									</c:if>

									<div class="form-group">
										<label for="email"> Supplier Name:</label>
										<form:input type="text" name="sup_name"
											class="form-control my-input" id="name"
											placeholder="Supplier Name" path="supplier_Name" />
										<form:errors path="supplier_Name" cssStyle="color:Red"></form:errors>
									</div>
<!-- 									<div class="form-group"> -->
<!-- 										<label for="email"> Product:</label> -->
<%-- 										<form:select path="category.cat_Id" class="form-control"> --%>
<%-- 											<form:option value="0">Select Product</form:option> --%>
<%-- 											<c:forEach items="${supplier_list}" var="s"> --%>
<%-- 												<form:option value="${s.prod_id}">${s.prod_name}</form:option> --%>
<%-- 											</c:forEach> --%>
<%-- 										</form:select> --%>
<!-- 									</div> -->

									<div class="form-group">
										<label>Location:</label>
										<form:input name="location" class="form-control my-input" id="iq"
											placeholder="Location" path="location" />
										<form:errors path="location" cssStyle="color:Red"></form:errors>
									</div>
									

									<div class="form-group">
										<label for="email"> Phone Number:</label>
										<form:input type="text" name="Phone_Number"
											class="form-control my-input" id="name"
											placeholder="Phone Number" path="supplier_phonenumber" />
										<form:errors path="supplier_phonenumber" cssStyle="color:Red"></form:errors>
									</div>
									
									<div class="form-group">
										<label for="email"> Email ID:</label>
										<form:input type="text" name="emailid"
											class="form-control my-input" id="name"
											placeholder="EmailID" path="supplier_emailid" />
										<form:errors path="supplier_emailid" cssStyle="color:Red"></form:errors>
									</div>

								

									<input type="submit" class="form-btn" value="Save" />
								</form:form>

							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>

<!-- 	<link rel="stylesheet" -->
<!-- 		href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.1/css/font-awesome.min.css"> -->
<!-- 	<link rel="stylesheet" -->
<!-- 		href="https://maxcdn.bootstrapcdn.com/bootswatch/4.1.1/lumen/bootstrap.min.css"> -->
<!-- 	<link rel="stylesheet" -->
<!-- 		href="https://daneden.github.io/animate.css/animate.min.css"> -->
	<div class="container" style="margin-top: 20px;">
		<div class="row">
			<div id="user" class="col-md-12">
				<div class="panel panel-primary panel-table animated slideInDown">
					<div class="panel-heading " style="padding: 5px;">
						<div class="row">

							<div class="col col-xs-5 text-center">
								<h1 class="panel-title">Supplier List</h1>
							</div>

						</div>
					</div>
					<div class="panel-body">
						<div class="tab-content" style="margin-bottom: 10px">
							<div role="tabpanel" class="tab-pane active" id="list">
								<table class="table table-striped table-bordered table-list">
									<thead style="background-color: #e51937">
										<tr>
											<th>Supplier ID</th>
											<th>Supplier Name</th>
 											<th>Location</th>
											<th>Phone Number</th>
											<th>Email ID</th>

											<th><em class="fa fa-cog"></em></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${supplier_list}" var="s">
											<tr class="ok">
												<td>${s.supplier_Id}</td>
												<td>${s.supplier_Name}</td>
 												<td>${s.location}</td> 
												<td>${s.supplier_phonenumber}</td>
												<td>${s.supplier_emailid}</td>
												<td align="center"><a
													href="editSupplier?supid=${s.supplier_Id}"
													class="btn btn-primary" title="Edit"><i
														class="fa fa-pencil"></i></a> <a
													href="deleteSupplier?supid=${s.supplier_Id}"
													class="btn btn-danger" title="delete"><i
														class="fa fa-trash"></i></a></td>
											</tr>
										</c:forEach>

									</tbody>
								</table>
							</div>


						</div>

					</div>
				</div>


			</div>
		</div>
	</div>
</section>