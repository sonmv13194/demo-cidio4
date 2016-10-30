<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta charset="UTF-8">
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Untitled Document</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/prettyPhoto.css" rel="stylesheet">
    <link href="resources/css/responsive.css" rel="stylesheet">
    <link href="resources/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
	<link href="resources/stylecss/css.css" rel="stylesheet">
	<script src="resources/jquerry/jquery-3.1.1.js"></script>
	<script src="resources/jquerry/jquery-3.1.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
   

    <!-- Custom styles for this template -->
    <link href="jumbotron.css" rel="stylesheet">

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
							<ul class="nav nav-pills account-cust">
								<li>
									<a href="${pageContext.request.contextPath }/login"><span class="glyphicon glyphicon-user"></span>LOGIN</a>
    
								</li>
								<li>
										<a href="${pageContext.request.contextPath }/addorder"><i class="glyphicon glyphicon-user"></i><span>SIGN UP</span></a>

								</li>
									<li>
										<a href="${pageContext.request.contextPath }/viewcart"><i class="glyphicon glyphicon-shopping-cart"></i><span>CART</span></a>

								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="header_middle">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="logo pull-left">
							<a href="${pageContext.request.contextPath }/home"></a>
						</div>
					</div>
					<div class="col-sm-6">
            <div id="custom-search-input">
            <c:url var="search" value="/search"></c:url>
			<form:form action="${search }" method="POST">
                <div class="input-group col-md-12">
                    <input type="text" class="form-control input-lg" placeholder="NHẬP SẢN PHẨM"  name="name"/>
                    <span class="input-group-btn">
                        <button  class="btn btn-info btn-lg" type="submit">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </span>
                </div>
                   </form:form>
            </div>
        </div>
     
					</div>
				</div>
        </div>
    </header>
<div class="container-fluid">
    <div class="row">
        <div class="container content">
                <div class="col-md-2 supplier">
                    <div class="menu-left">
                       	<div class="nav nav-pills nav-stacked menu-left">
					<h3>DANH MỤC</h3>
                    	  <c:forEach var="category" items="${Lcate }" varStatus="status">
								<li><a href="${pageContext.request.contextPath }/${category.idcategory}">${category.name }</a></li>
								</c:forEach>					
					</div>
                        </div>                        
					<div class="menu-left">
                    	<div class="nav nav-pills nav-stacked menu-left">
					<h3>HÃNG SẢN XUẤT</h3> 
                    	  <c:forEach var="supplier" items="${Lsup }" varStatus="status">
								<li><a href="${pageContext.request.contextPath }/supply?idsupplier=${supplier.idsupplier}">${supplier.name }</a></li>
								</c:forEach>						
					</div>
                        </div>    
				</div>
                <div class="col-sm-10">
                	<div class="detail_item">
                    	<div class="nav nav-pills nav-stacked menu-left">
					<h3>CHI TIẾT</h3>	
					</div>
                    <p><br/></p>
                <div class="nav nav-stacked">
             <div class="col-sm-6">
                       <div class="product-box">
                         <img src="<%=request.getContextPath() %>/resources/img/${pdetail.image}" style="width:300px">                 
                        </div>
                        </div>
                        <div class=col-sm-6>
                        <div class="detail-information">
                           <h2>${pdetail.name}</h2>
                         <h1>$:${pdetail.price }</h1>
                            <p><b>Lượt view:</b>${pdetail.view}</p>
                            <p><b>Khu vực:</b>${pdetail.locat.name}</p>
                              <form action="addcart" method="post">
                            <a href="${pageContext.request.contextPath}/addcart?idproduct=${pdetail.idproduct}" class="btn btn-default add">Thêm vào giỏ</a>
                           </form>
                            <h3>ĐẶC ĐIỂM CHI TIẾT</h3>
                          <i class="	glyphicon glyphicon-ok"></i>  <p>${pdetail.description }</p><br>
                          
                            </div>
                     </div>
                         </div>
                    </div>
                    <div class="nav nav-pills nav-stacked menu-left">
					<h3>THÔNG SỐ KỸ THUẬT</h3>	
						<div class="table-responsive cart-infor">
						<div>
    			<table class="table table-condensed">
    				<thead>
    					<tr class="description-detail" style="background: #ddd">
    						<td class="detail-product" >CPU</td>
    							<td class="item-detail">
    						<h4>${pdetail.detailproduct.cpu} <i class="	glyphicon glyphicon-ok"></i> </h4>
    					</td>
    						</tr>
    						<tr>
    						<td class="detail-product">CHIPSET</td>
    						<td class="item-detail">
    						<h4>${ pdetail.detailproduct.chipset} <i class="	glyphicon glyphicon-ok"></i> </h4>
    					</td>
    						</tr>
    					<tr style="background: #ddd">
    						<td class="detail-product">RAM</td><td class="item-detail">
    						<h4>${pdetail.detailproduct.ram} <i class="	glyphicon glyphicon-ok"></i> </h4>
    					</td>	</tr>
    					<tr >
    						<td class="detail-product">HDD</td><td class="item-detail">
    						<h4>${pdetail.detailproduct.hdd} <i class="	glyphicon glyphicon-ok"></i> </h4>
    					</td>	</tr>
    					<tr style="background: #ddd">
    						<td class="detail-product">GRAPHIC</td><td class="item-detail">
    						<h4>${pdetail.detailproduct.graphic} <i class="	glyphicon glyphicon-ok"></i> </h4>
    					</td>	</tr>
    					<tr >
    						<td class="detail-product">WEIGTH</td>	<td class="item-detail">
    						<h4>${pdetail.detailproduct.weight} <i class="	glyphicon glyphicon-ok"></i> </h4>
    					</td>	</tr>
    					<tr style="background: #ddd">
    						<td class="detail-product">OS</td><td class="item-detail">
    						<h4>${pdetail.detailproduct.os} <i class="	glyphicon glyphicon-ok"></i> </h4>
    					</td>	</tr>
    						
    			
    				</thead>
    				</table>
    				</div>		
    		</div>
					</div>
                    </div>
                    <p><br/></p>
        </div>
            </div>
        <div class="col-md-1"></div>
    </div>	
  <footer id="footer">
<div class="container-fluid footer_top">
    <div class="container">
        <div class="col-sm-3 top-left-first">
     </div>
        <div class="col-sm-3 top-left">
        </div>
        <div class="col-sm-3 top-center">
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
    <div class="container-fluid footer_middle">
    	<div class="container">
    		<div class="col-sm-4 footer_middle_item">
    			<div class="footer-item-tittle">
    				<a class="" href="">
    					<div class="footer-item-tittle-name">Group TPM3</div>
    					<div class="footer-item-tittle-icon"></div>
    				</a>
    				<a href="https://www.facebook.com/shuichiakai.cool" class="fa fa-facebook"></a>
    			<span>SĐT:01665102292</span><br>
    			<span>Address: 181-Phan Thanh-Đà Nẵng</span><br>
    			<span>Sinh viên: KHOA CNTT</span><br>
    			<span>Email:<a href="mailto:aloneguy13194@gmail.com">alone13194@gmail.com</a></span><br>
    			</div>
    		</div>
    		<div class="col-sm-4 footer_middle_item">
    		<div class="footer-item-tittle">
    			<a class="" href="">
    					<div class="footer-item-tittle-name">PHẠM AN BÌNH</div>
    					<div class="footer-item-tittle-icon"></div>
    				</a>
    				<a href="https://www.facebook.com/phamanbinhDTU?fref=ts" class="fa fa-facebook"></a>
    			<span>SĐT:XXXXXXXXX</span><br>
    			<span>Address: XXXXXXXXX</span><br>
    			<span>GIẢNG VIÊN: KHOA CNTT</span><br>
    				<span>Email:<a href="mailto:phamanbinh@gmail.com">phamanbinh@gmail.com</a></span><br>
    			</div>
    			</div>
    			<div class="col-sm-4 footer_middle_item">
    		<div class="footer-item-tittle">
    			<a class="" href="">
    					<div class="footer-item-tittle-name">BAN QUẢN TRỊ WEB</div>
    					<div class="footer-item-tittle-icon"></div>
    				</a>
    				<a href="https://www.facebook.com/phamanbinhDTU?fref=ts" class="fa fa-facebook"></a>
    					<span>Admin:<a href="mailto:levanvien@gmail.com">levanvien@gmail.com</a></span><br>
    					<span>Sale:<a href="mailto:dovuquan@gmail.com">dovuquan@gmail.com</a></span><br>
    					<span>Support:<a href="mailto:nguyenquocduy@gmail.com">guyenquocduy@gmail.com</a></span><br>
    					<span>Employee:<a href="mailto:duongvanthieu@gmail.com">duongvanthieu@gmail.com</a></span><br>
    			</div>
    			</div>
    		</div>
    	</div>
    <div class="container-fluid footer_bottom">
    	<div class="container">
    		<div class="col-sm-6 footer_bottom_item">
    			<div class="footer_bottom_link">
    				<a href="${pageContext.request.contextPath }/home">Trang chủ</a>
    				<a href="${pageContext.request.contextPath }/viewcart">Giỏ hàng</a>
    			</div>
    		</div>
    		<div class="col-sm-6 footer_bottom_item">
    			<div class="footer_bottom_link pull-right">
    				<h2>Design By MS</h2>
    			</div>
    		</div>
    	</div>
    </div>
    </footer>
</body>
</html>