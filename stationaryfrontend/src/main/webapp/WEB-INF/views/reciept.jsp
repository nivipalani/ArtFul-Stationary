<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="cr" value="${pageContext.request.contextPath}" />
<style>
h1 {
	margin-left: 35%;
	width: 100%;
}

h2 {
	margin-left: 35%;
	width: 100%;
}
</style>
<div class="container">
	<h1>Payment Receipt</h1>
	<div class="row">
		<div class="col-lg-12">
			<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6">
					<address>
						<strong>Supplier Information</strong><br>Name
						:${order.product.supplier.supplier_Name} <br>Email ID
						:${order.product.supplier.supplier_emailid} <br> Location
						:${order.product.supplier.location}<br>
					</address>
				</div>
				<div class="col-xs-6 col-sm-6 col-md-6 text-right">
					<p>
						<em>Date:${order.orderDate}</em>
					</p>
					<p>
						<em>Receipt #: ${order.order_Id}</em>
					</p>
				</div>
			</div>
			<div class="row">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Product</th>
							<th>Qty</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="col-md-10"><em></em>
								<div>
									<img src="${cr}/resources/pimage/${order.product.prod_id}.jpg"
										alt="allytees-500-trans.png" width="50" height="50"> <span>${order.product.prod_name}</span>
								</div></td>
							<td class="col-md-1" style="text-align: center">${order.quantity}</td>
							<td class="col-md-1" style="text-align: center">${order.grandTotal}</td>
						</tr>

						<tr>
							<td></td>
							<td class="col-md-1">Shipping :</td>
							<td class="col-md-1" style="text-align: center">Rs. 50</td>
						</tr>
						<tr>
							<td></td>
							<td class="text-right"><h4>
									<strong>Total: </strong>
								</h4></td>
							<td class="text-center text-danger"><h4>
									<strong>Rs. ${order.grandTotal+50}</strong>
								</h4></td>
						</tr>
					</tbody>
				</table>
				<h2>Thank you for your order...</h2>
			</div>
		</div>
	</div>
</div>