<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="cr" value="${pageContext.request.contextPath}" />

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
	<div class="container " style="margin-left: 15%">
		<div class="row ">
			<div class="mapouter">
				<div class="gmap_canvas">
					<iframe width="150%" height="480" id="gmap_canvas"
						src="https://maps.google.com/maps?q=artful%20stationary%2C%20street%2012%20gandhi%20park%2Ccoimbatore&t=k&z=13&ie=UTF8&iwloc=&output=embed"
						frameborder="0" scrolling="no" marginheight="0" marginwidth="0"></iframe>
					<a href="https://www.embedgooglemap.net"></a>
				</div>
			</div>
			<div class="col-md-8 col-md-offset-3">
				<div class="form-warp">
					<div class="form-card">
						<div class="form">
							<div class="form-content">
								<form action="" method="Post">
									<div class="form-group"
										style="font-weight: bold; text-align: center">

										<label><font size="5">Contact Us</font> </label>
									</div>
									<div class="form-group">
										<label for="email">Name:</label> <input type="text"
											name="user_name" class="form-control my-input" id="name"
											placeholder="Name" />
									</div>
									<div class="form-group">
										<label>Email ID:</label> <input type="text" name="email"
											class="form-control" id="iq" placeholder="EmailID" />
									</div>
									<div class="form-group">
										<label>Phone Number:</label> <input type="text" name="phno"
											class="form-control" id="iq" placeholder="PhoneNumber" />

									</div>
									<div class="form-group">
										<label>Message:</label>
										<textarea name="msg" class="form-control" id="iq"
											placeholder="Message"></textarea>
									</div>
									<input type="submit" class="form-btn" value="Save">
								</form>
							</div>
						</div>
						<div class="error"></div>
					</div>

				</div>
			</div>
		</div>
	</div>
</section>
