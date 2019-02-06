<style>
/*============ Rotate Bar style ============*/
.p0{
    padding: 0 !important;
}
ul, ol, li{
    margin: 0;
    padding: 0;
    list-style: none;
}
a, a:hover,a:focus{
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
    font-size: 30px;
	font-family: Monotype Corsiva;	
	font-style: oblique;
    font-weight: bolder;
    line-height: 60px;
    padding-right: 35px;
    position: relative;
    text-align: right;
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
    width: 50px;
    transform: skew(-30deg);
}
.tab-menu{
    position: relative;
}
.tab-menu ul li{
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
    padding: 0 35px;
    text-transform: uppercase;
    -webkit-transition: all 700ms ease;
    -moz-transition: all 700ms ease;
    -ms-transition: all 700ms ease;
    -o-transition: all 700ms ease;
    transition: all 700ms ease;
}
.tab-menu ul li a:hover,
.tab-menu ul li.active a{
    background: #e51937; 
}
.tab-menu ul li a span{
    transform: skew(30deg);
	font-family: Monotype Corsiva;
	font-size: 15px;
	font-style: oblique;
    display: block;
}
</style>
 <!--================= Rotate Bar ==================-->
        <div class="rotate-bar">
            <div class="container-fluid p0">
                <div class="row">
				
                    <div class="col-md-4">
                        <div class="title">Artful Stationary</div>
                    </div>
                    <div class="col-md-8">
                        <div class="tab-menu">
                            <ul>  
                                <li><a href=""><span>Home</span></a></li>                               
                                <li><a href="signup"><span>SignUp</span></a></li> <!--<li class="active">-->
                                <li><a href="signin"><span>SignIn</span></a></li>
								<li><a href="aboutus"><span>About us</span></a></li>
                                <li><a href="contactus"><span>Contact Us</span></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
