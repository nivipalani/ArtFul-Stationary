<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>

.error{
	color:red;
}
.error2{
	color:green;
}
.form-type-one{
    padding: 80px 0px;
    background-color: #fafbf6;
    position:relative;
}
.form-type-one .form-warp{
    padding-right: 80px;
    padding-left: 80px;
}

.form-type-one .form-card{
    background-color: #fff;
	margin-left: 20%;
	margin-right: 20%;
	
    border-radius: 20px;
    padding-top: 15px;
       -webkit-box-shadow: 2px 22px 63px -17px rgba(24,139,240,0.62);
    -moz-box-shadow: 2px 22px 63px -17px rgba(24,139,240,0.62);
    box-shadow: 2px 22px 63px -17px rgba(24,139,240,0.62);
}
.form-type-one .form{
        padding-left: 15px;
        padding-right: 15px;
}
.form-type-one .form img{
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

.form-type-one .form-btn{
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
.form-type-one p{    
    margin-bottom: 20px;    
    font-family: 'Comfortaa';
    color: #476787;
    text-align: center;
}
.art-right{
    position:absolute;
    right:0px;
    bottom: 0px;
    z-index: 9;
}
.art-left{
    position:absolute;
    left:0px;
    bottom: 0px;
     z-index: 9;
}
@media screen and (max-width: 768px) {
    .form-type-one .form-warp{
    padding-right: 0px;
    padding-left: 0px;
}

}
</style>
 <section class="form-type-one">
        <div class="container ">
            <div class="row ">
                <div class="col-md-12 col-md-offset-3">
                
                <c:if test="${Sucess}">
                	<div class="alert alert-success">
                		<strong>Success</strong> Data Inserted in Database
                	</div>
                </c:if>
                 <c:if test="${Sucess}">
                	<div class="alert alert-danger">
                		<strong>Danger</strong> Incorrrect Data..Enter Correct Data
                	</div>
                </c:if>
                 <c:if test="${Sucess}">
                	<div class="alert alert-warning">
                		<strong>Warning</strong> Data already exists in Database
                	</div>
                </c:if>
                    <div class="form-warp">
                        <div class="form-card">
                            <div class="form">
                                <div class="form-content">
								
                                     <form:form action="addCategory" modelAttribute="mycategory" method="Post"> 
                                         <div class="form-group">
											<center> 
											<b><label><font size="5">CATEGORY PAGE</font> </label><b>	</center>
										</div>                                     

                                        <div class="form-group">
                                            <label for="email"> Category Name:</label>
                                            <form:input type="text" name="cat_name" class="form-control my-input" id="name" placeholder="Category Name" path="cat_Name"/>
							            </div>
                                        
										
										<div class="form-group">
										<label>Category Description</label>
										<form:textarea name="desc" class="form-control" id="iq" placeholder="Category Description" path="cat_Description"/></textarea>
										</div>
										<input type="submit"  class="form-btn" value="Save">


                                    </form:form>
                                </div>
                            </div>
                            <div class="error">  
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>