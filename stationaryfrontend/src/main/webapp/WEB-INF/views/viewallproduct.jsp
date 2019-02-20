<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
	$(document).ready(function() {
		$('#list').click(function(event) {
			event.preventDefault();
			$('#products .item').addClass('list-group-item');
		});
		$('#grid').click(function(event) {
			event.preventDefault();
			$('#products .item').removeClass('list-group-item');
			$('#products .item').addClass('grid-group-item');
		});
	});
</script>
<style>
.view-group {
	display: -ms-flexbox;
	display: flex;
	-ms-flex-direction: row;
	flex-direction: row;
	padding-left: 0;
	margin-bottom: 0;
}

.thumbnail {
	margin-bottom: 30px;
	padding: 0px;
	-webkit-border-radius: 0px;
	-moz-border-radius: 0px;
	border-radius: 0px;
	width: 100%;
}

.item.list-group-item {
	float: none;
	width: 100%;
	background-color: #fff;
	margin-bottom: 30px;
	-ms-flex: 0 0 100%;
	flex: 0 0 100%;
	max-width: 100%;
	padding: 0 1rem;
	border: 0;
}

.item.list-group-item .img-event {
	float: left;
	width: 30%;
}

.item.list-group-item .list-group-image {
	margin-right: 10px;
}

.item.list-group-item .thumbnail {
	margin-bottom: 0px;
	display: inline-block;
}

.item.list-group-item .caption {
	float: left;
	width: 70%;
}

.item.list-group-item:before, .item.list-group-item:after {
	display: table;
	content: " ";
}

.item.list-group-item:after {
	clear: both;
}
</style>
<div class="container-fluid">
	<div class="row">

		<div class="col-lg-12 my-3">
			<div class="pull-right">
				<div class="btn-group">
					<button class="btn btn-info" id="list">List View</button>
					<button class="btn btn-danger" id="grid">Grid View</button>
				</div>
			</div>
		</div>
	</div>

	<div id="products" class="row view-group">
		<div class="col-10" style="margin-left:5%">
			<div class="row">
				<c:forEach items="${product_list}" var="v">
					<div class="item col-lg-3">

						<div class="thumbnail card">
							<div class="img-event">
								<img class="group list-group-image img-fluid"
									src="resources/pimage/${v.prod_id}.jpg"
									alt="Unsupported browser"
									style="max-height: 200px; width: 100%" />
							</div>
							<div class="caption card-body">
								<h5 class="group card-title inner list-group-item-heading">
									${v.prod_name}</h5>
								<p class="group inner list-group-item-text"></p>
								<div class="row">
									<div class="col-xs-12 col-md-6">
										<p class="lead">Rs.${v.prod_price}</p>
									</div>
									<div class="col-xs-12 col-md-6">
										<a class="btn btn-success" href="viewoneproduct?pid=${v.prod_id}">View</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>

</div>
