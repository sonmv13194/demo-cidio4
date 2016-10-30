     <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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