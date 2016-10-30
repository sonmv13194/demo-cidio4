<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<div id="header_top">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
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
					<div class="col-md-6">
						<div class="menu-acount pull-right">
							<ul class="nav nav-pills account-cust">
								<li>
									<a href="${pageContext.request.contextPath }/login"><span class="glyphicon glyphicon-user">
									
									</span>LOGIN</a>
    
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
					<div class="col-sm-3">
						<div class="logo pull-left">
							<a href="${pageContext.request.contextPath }/home"></a>
						</div>
					</div>
					<div class="col-sm-6">
            <div id="custom-search-input">
			<form action="search" method="POST">
                <div class="input-group col-md-12">
                    <input type="text" class="form-control input-lg" name="name" style="    font-family: -webkit-pictograph;"/>
                    <span class="input-group-btn  search-button">
                        <button  class="btn btn-info search-button btn-lg" type="submit">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </span>
                </div>
                </form>

            </div>
        </div>
     
					</div>
				</div>
        </div>
      <section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
				<c:forEach var="event" items="${event }">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>PHONE</span>-MARKET</h1>
									<h2>${event.name }</h2>
									<p>${event.description }</p>
									<button type="button" class="btn btn-default get">Chi tiết</button>
								</div>
								<div class="col-sm-6">
									<img src="resources/img/${event.image }" class="girl img-responsive" alt="" />
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
							<h1><span>PHONE</span>-MARKET</h1>
									<h2>${event.name }</h2>
									<p>${event.description }</p>
									<button type="button" class="btn btn-default get">Chi tiết</button>
								</div>
								<div class="col-sm-6">
									<img src="resources/img/${event.image1 }" class="girl img-responsive" alt="" />
									
								</div>
							</div>
							
							<div class="item">
								<div class="col-sm-6">
									<h1><span>PHONE</span>-MARKET</h1>
									<h2>${event.name }</h2>
									<p>${event.description }</p>
									<button type="button" class="btn btn-default get">Chi tiết</button>
								</div>
								<div class="col-sm-6">
									<img src="resources/img/${event.image2 }" class="girl img-responsive" alt="" />
					
								</div>
							</div>
							
						</div>
						
						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="glyphicon glyphicon-chevron-left s-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="glyphicon glyphicon-chevron-right s-right"></i>
						</a>
					</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</section>