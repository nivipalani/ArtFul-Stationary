
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
@import url(http://fonts.googleapis.com/css?family=Roboto:400);

body {
	align: center;
	background-color: #fff;
	-webkit-font-smoothing: antialiased;
	font: normal 14px Roboto, arial, sans-serif;
}

.container {
	padding: 90px; 
	position: fixed;
	margin-left:32%;
	margin-right:32%;

}

.form-login {
	
	background-color: #e51937;
	padding-top: 10px;
	padding-bottom: 20px;
	padding-left: 20px;
	padding-right: 20px;
	border-radius: 15px;
	border-color: #d2d2d2;
	border-width: 5px;
	box-shadow: 0 1px 0 #cfcfcf;
}

h4 {
	border: 0 solid #fff;
	border-bottom-width: 1px;
	padding-bottom: 10px;
	text-align: center;
	border-bottom-width: 1px;
}

.form-control {
	border-radius: 10px;
}

.wrapper {
	text-align: center;
}
</style>

		<!--Pulling Awesome Font -->
		<link
			href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
			rel="stylesheet">

		<div class="container">
			<div class="row">
				<div class="col-md-offset-5 col-md-4">
					<div class="form-login">
						<h4><font color="#ffffff">SignIn...</font></h4>
						<input type="text" id="userName"
							class="form-control input-sm chat-input" placeholder="Username" />
						</br> <input type="text" id="userPassword"
							class="form-control input-sm chat-input" placeholder="Password" />
						</br>
						<div class="wrapper">
							<span class="group-btn"> <a href="#"
								class="btn btn-primary btn-md">Login <i
									class="fa fa-sign-in"></i></a>
							</span>
						</div>
					</div>

				</div>
			</div>
		</div>
