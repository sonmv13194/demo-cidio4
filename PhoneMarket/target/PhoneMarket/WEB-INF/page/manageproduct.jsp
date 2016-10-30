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
   
	<style>
	h4{
   font-family: -webkit-pictograph;
	}
	</style>
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
    	<div class="container content">
    		<div class="table-responsive cart-infor">
    			<table class="table table-condensed">
    				<thead>
    					<tr class="menu-cart">
    						<td class="">IMAGE</td>
    						<td class="image">NAME</td>
    						<td class="name">DESCRIPTION</td>
    						<td class="price">VIEW</td>
    						<td class="quantity">PRICE</td>
    					<!-- 	<td class="total">QUANTITY</td> -->
    						<td class="total">CATEGORY</td>
    						<td class="total">LOCATION</td>
    						<td>DELETE</td>
    						<td>UPDATE</td>
    				</tr>
    				</thead>
    				<c:forEach var="product" items="${listp }">
    				<tbody>
    				<tr>
    					<td class="cart-name">
    						<img alt="" src="${pageContext.request.contextPath }/resources/img/${product.image}" style="width:100px">
    					</td>
    					<td class="cart-price">
    						<h4>${ product.name}</h4>
    					</td>
    					<td class="cart-quantity">
    						<h4>${product.description}</h4>
    					</td>
    					<td class="cart-total">
    						<h4>${product.view}</h4>
    					</td>
    					    				<td class="cart-total">
    						<h4>${product.price}</h4>
    					</td>
<%--     					<td class="cart-total">
    						<h4>${product.listCartItem.quantity}</h4>
    					</td> --%>
    					<td class="cart-total">
    						<h4>${product.category.name}</h4>
    					</td>
    				<td class="cart-total">
    						<h4>${product.locat.name}</h4>
    					</td>
    					<td class="cart-delete">
    						<a href="${pageContext.request.contextPath }/deleteproduct?idproduct=${product.idproduct}" onclick="return confirm('Are you sure DELETE')"><i class="glyphicon glyphicon-trash"></i></a>
    					</td>	
    					<td class="cart-delete">
    						<a href="${pageContext.request.contextPath }/" onclick="return confirm('Are you sure DELETE')"><i class="glyphicon glyphicon-wrench"></i></a>
    					</td>	
    				</tr>
    				</c:forEach>
    			</tbody>		
    				</table>		
    		</div>
    	<a href="<spring:url value="/admin" />" class="btn btn-default"  style="background: #F0F0E9">BACK</a>
    		</div>
    </section>
    <p><br/></p>
    <footer id="footer">
<div class="container">
    <div class="row">
        <div class="col-sm-3">
            <div class="infor-us">
            <h2>
                <span>Jfreedom</span>-   Phone Mart
            </h2>
        </div>
     </div>
        <div class="col-sm-3">
        </div>
        <div class="col-sm-3">
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