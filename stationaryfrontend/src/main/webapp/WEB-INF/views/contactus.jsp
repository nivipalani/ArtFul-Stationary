<html>
<head>
<style>
/*Font-awesome integration*/
@import
	url("https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css")
	;
/*Google font integration*/
@import url('https://fonts.googleapis.com/css?family=Roboto');

#contact {
	background-color: #f1f1f1;
	font-family: 'Roboto', sans-serif;
}

#contact .well {
	margin-top: 30px;
	border-radius: 0;
}

#contact .form-control {
	border-radius: 0;
	border: 2px solid #1e1e1e;
}

#contact button {
	border-radius: 0;
	border: 2px solid #1e1e1e;
}

#contact .row {
	margin-bottom: 30px;
}

@media ( max-width : 768px) {
	#contact iframe {
		margin-bottom: 15px;
	}
}
</style>
</head>
<body>
	<section id="contact">
		<div class="container">
			<div class="well well-sm">
				<h3>
					<strong>Contact Us</strong>
				</h3>
			</div>

			<div class="row">
<!-- 				<div style="width: 720px"> -->
<!-- 					<iframe width="720" height="315" -->
<!-- 						src="https://maps.google.com/maps?width=720&amp;height=315&amp;hl=en&amp;coord=11.0054693,77.0489932&amp;q=7%2C%20Street%20%2312%2C%20Gandhi%20Park%2C%20Laxmi%20Nagar%2C%20Coimbatore%20-%20641016+(Artful%20Stationary)&amp;ie=UTF8&amp;t=&amp;z=13&amp;iwloc=A&amp;output=embed" -->
<!-- 						frameborder="0" scrolling="no" marginheight="0" marginwidth="0"> -->
<!-- 						<a href="https://www.maps.ie/map-my-route/">Draw map route</a> -->
<!-- 					</iframe> -->
<!-- 				</div> -->
				<br />
					  <div class="col-md-7">
				        <iframe src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d3736489.7218514383!2d90.21589792292741!3d23.857125486636733!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sbd!4v1506502314230" width="100%" height="315" frameborder="0" style="border:0" allowfullscreen></iframe>
				      </div>

				<div class="col-md-5">
					<h4>
						<strong>Get in Touch</strong>
					</h4>
					<form>
						<div class="form-group">
							<input type="text" class="form-control" name="" value=""
								placeholder="Name">
						</div>
						<div class="form-group">
							<input type="email" class="form-control" name="" value=""
								placeholder="E-mail">
						</div>
						<div class="form-group">
							<input type="tel" class="form-control" name="" value=""
								placeholder="Phone">
						</div>
						<div class="form-group">
							<textarea class="form-control" name="" rows="3"
								placeholder="Message"></textarea>
						</div>
						<button class="btn btn-default" type="submit" name="button">
							<i class="fa fa-paper-plane-o" aria-hidden="true"></i> Submit
						</button>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>