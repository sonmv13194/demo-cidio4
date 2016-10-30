<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
          <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Phone Market</title>
 <%--    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/prettyPhoto.css" rel="stylesheet">
    <link href="resources/css/responsive.css" rel="stylesheet">
    <link href="resources/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
 <!--    <link href="resources/stylecss/main.css" rel="stylesheet"> -->
	<link href="resources/stylecss/css.css" rel="stylesheet">
	<script src="resources/jquerry/jquery-3.1.1.js"></script>
	<script src="resources/jquerry/jquery-3.1.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
   

    <!-- Custom styles for this template -->
  <!--   <link href="jumbotron.css" rel="stylesheet"> -->

    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	<header id="header">
		<div id="header_top">
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contact-account">
							<ul class="nav nav-pills">
							<li class="email">
								<a href="aloneguy13194@gmail.com"><i class="glyphicon glyphicon-envelope"></i><span>Aloneguy13194@gmail.com</span></a>
							</li>
							<li class="phone">
								<a href="01665102292"><i class="glyphicon glyphicon-earphone"></i><span>01665102292</span></a>
							</li>
							<li class="Address">
								<a href="Jfreedom"><i class="glyphicon glyphicon-home"><span>JfreedomCompany</span></i></a>
							</li>
							</ul>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="menu-acount pull-right">
							<ul class="nav nav-pills">
								<li>
									<a href="/login" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span>LOGIN</a>
                      
								</li>
								<li>
										<a href="/signup" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i><span>SIGN UP</span></a>
                              
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
    </header>
    <p><br/></p>
    <section id="cart_items">
    	<div class="container">
    		<div class="table-responsive cart-infor content">
    			<table class="table table-condensed">
    				<thead>
    					<tr class="menu-cart">
    						<td class="image" style="padding-left:30px">IMAGE</td>
    						<td class="name">NAME PRODUCT</td>
    						<td class="price">PRICE</td>
    						<td class="quantity">QUANTITY</td>
    						<td class="total">TOTAL</td>
    						<td>DELETE</td>
    				</tr>
    				</thead>
    				
    			<tbody>
    				<tr>
    				<c:forEach var="cart" items="${listcart.product }">
    					<td class="cart-image">
    						<img src="<%=request.getContextPath()%>/resources/img/${cart.image}" style="width:100px; heigth:100px">
    					</td>
    					<td class="cart-name">
    						<h4>${cart.name }</h4>
    					</td>
    					<td class="cart-price">
    						<h4>${cart.price }</h4>
    					</td>
    					<td class="cart-quantity">
    						<h4>${cart.quantity }</h4>
    					</td>
    					<td class="cart-quantity">
    						<h4>${cart.totalprice }</h4>
    					</td>
    					<td class="cart-delete">
    						<a href="#"><i class="fa fa-times"></i></a>
    					</td>
    						</c:forEach>	
    				</tr>
    			</tbody>	
    			
    			<%-- <a href="<spring:url value="/home" />" class="btn btn-default">Continue Shopping</a> --%>
    			</table>
    		</div>
    		</div>
    </section>
    <p><br/></p>
    <footer id="footer">
<div class="container">
    <div class="row">
        <div class="col-sm-3">
            <div class="infor-us">
            <h2>
               <!--  <span>Jfreedom</span> -->
            </h2>
     <!--        <img src="resources/img/12809732_240534996295136_3756555531503538654_n.png" style="width:100px"> -->
        </div>
     </div>
        <div class="col-sm-3">
            
            <div class="contact">
							<!--  <h2>Contac with us</h2> -->
						<!-- 	<ul class="email">
								<a href="aloneguy13194@gmail.com"><i class="glyphicon glyphicon-envelope"></i><span>Aloneguy13194@gmail.com</span></a>
							</ul>
							<ul class="phone">
								<a href="01665102292"><i class="glyphicon glyphicon-earphone"></i><span>01665102292</span></a>
							</ul>
							<ul class="Address">
								<a href="Jfreedom"><i class="glyphicon glyphicon-home"><span>JfreedomCompany</span></i></a>
							</ul> -->
						
						</div>
        </div>
        <div class="col-sm-3">
            <div class="address">
               <!--  <h2>Địa chỉ-Map</h2> -->
               <!--  <img src="resources/img/data=RfCSdfNZ0LFPrHSm0ublXdzhdrDFhtmHhN1u-gM,vKnL_OA8GUOglta9wQ-rGzsABW8VQLvD4Se4DtTtyy68u0nBspxceFqPPBNxltgzkYumkunLu5rNlyqcBPlemVX0sBCSUy-t8xCWQEQQto27WPBhp6F76ue62Vm0mXcriREloppMzWHrMXDW5.png"style="width:250px"> -->
            </div>
        </div>
        <div class="col-sm-3">
            
                	<div class="col-lg-1 col-md-1 col-sm-2 col-xs-3 text-center">
				<div class="icon-circle">
					<a href="#" class="ifacebook" title="Facebook"><i class="fa fa-facebook"></i></a>
				</div>
			</div>
					<div class="col-lg-1 col-md-1 col-sm-2 col-xs-3 text-center">
				<div class="icon-circle">
					<a href="#" class="itwittter" title="Twitter"><i class="fa fa-twitter"></i></a>
				</div>
			</div>
                 	<div class="col-lg-1 col-md-1 col-sm-2 col-xs-3 text-center">
				<div class="icon-circle">
					<a href="#" class="igoogle" title="Google+"><i class="fa fa-google-plus"></i></a>
				</div>
			</div>
                 	<div class="col-lg-1 col-md-1 col-sm-2 col-xs-3 text-center">
				<div class="icon-circle">
					<a href="#" class="iLinkedin" title="Linkedin"><i class="fa fa-linkedin"></i></a>
				</div>
			</div>
                
       
        </div>
    </div>
    </div>
    </footer>
</body>
</html>