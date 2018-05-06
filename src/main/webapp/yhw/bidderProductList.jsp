<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>产品信息列表</title>

    <link href="/css/mybidder/product/reset.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="/css/mybidder/product/product.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="/common/layui/css/layui.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="/css/mybidder/product/content1.css" media="screen" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="conWrap">
	 <div class="titWrap">
        <div class="titW">
          <div class="shu"></div>
          <div class="titWord">产品列表</div>
        </div>
        <div class="tips">
          <div class="tipList">
          	<div class="imgW"><img src="${ctxStatic}/frontindex/mybidder/registration/importtzhi.png"></div>
          	<div class="tipWord">温馨提示:投标报名需要上传产品信息，您可以在此页面提前添加产品，方便以后的报名。<span>
          		${tipWord}
          	</span></div>
          </div>
        </div>
      </div>
 <div class="search">
      <form action="${ctx}/exBidRegister/bidderProductList"   method="post"  >
       
        <div class="searchWrap">
          <div class="searchTit">产品名称：</div>
          <input class="searchText" type="text"  name="name"  value="${name }">
          <div class="clear"></div>
        </div>
        
        <input type="submit" class="searchBtn" value="查询">
      </form>
       <input type="button"  class="addProductButt"  onclick="addProduct('');" value="添加产品">
 </div>
</div>

  <div class="contentWrap">
      <div class="productWrap">
        <div class="proTit">
          <div class="proPic">产品图片</div>
          <div class="proName">产品名称</div>
          <div class="proBrand">品牌</div>
          <div class="proModel">产品类别</div>
          <div class="proPrice">价格(人民币 元)</div>
          <div class="cz">操作</div>
        </div>
        <ul class="proList" id="productLists">
        	<c:forEach items="${productPage.list}" var="bidProductInfo"  varStatus="status">
	          <li class="clear" id="li_${ bidProductInfo.id}">
	            <div class="proPic propicImp" >
	            	<a href="${ctx}/exBidRegister/bidderProductView?id=${bidProductInfo.id}" style="color:#039;">
	              		<img src="${bidProductInfo.picture}" >
	              	</a>
	            </div>
	            <div class="proName"  >
		            <a href="${ctx}/exBidRegister/bidderProductView?id=${bidProductInfo.id}" style="color:#039;">

		            </a>
	            </div>
	            <div class="proBrand"></div>
	            <div class="proModel">	</div>
	            <div class="proPrice">￥${bidProductInfo.proposedPriceRmb} - ￥${bidProductInfo.proposedPriceHeight}</div>
	            
	             <div class="cz"  style="text-align: center;">
	              <a href="${ctx}/exBidRegister/bidderProductView?id=${bidProductInfo.id}"   >
	               		<img src="${ctxStatic}/frontindex/mybidder/product/list/seeicon16.png"  />
	               </a>
	               <a href="javascript:"  onclick="addProduct('${bidProductInfo.id}')" >
	               		<img src="${ctxStatic}/frontindex/mybidder/product/list/updateicon.png"  />
	               </a>
	               <a href="javascript:"   onclick="deleteProduct('${bidProductInfo.id}')">
	               		<img src="${ctxStatic}/frontindex/mybidder/product/list/deleteicon.png"  /> 
	               </a>
				</div>
	          </li>
          </c:forEach>
        </ul>
      </div>
      <div class="pages">
      <div>
      </div>
      	 ${page}
      </div>
    </div>
    <input id="saveProFlag"   type="hidden"  value=""  />
<script src="/js/mybidder/jquery-1.9.1.min.js" type="text/javascript" ></script>
<script src="/common/layui/layui.js" type="text/javascript" ></script>
<script src="/common/layui/lay/modules/layer/layer.js"></script>
    <script type="text/javascript">
    //分页
    function Page(n){
    	window.location.href="${ctx}/exBidRegister/bidderProductList?name=${name}&pageNo="+n;
    }
    //添加产品
    
    function addProduct(id){
    	var ids = '';
    	if(id == '' || id == null){
    		ids = '添加产品';
    	}else{
    		ids = '修改产品';
    	}
    	var index=  layer.open({
 			title:ids
 			,shadeClose: true
 			,type: 2
 			, maxmin: false
 			,area: ['850px','600px']
 			,content:['${ctx}/exBidRegister/bidderProductForm?id='+id,'yes']
    		,end: function () {
    			if($("#saveProFlag").val() == '1'){
            	 	layer.msg('保存产品成功', {time: 3000,icon: 1});
            	 	setTimeout("window.location.reload()",3000);
    			}else  if($("#saveProFlag").val() == '2'){
    				layer.msg('取消操作', {time: 3000,icon: 2});
    			}
    			
    			
    		}
 		}); 
    }
    
    //删除产品
    
   
    function deleteProduct(id){
    	
    	layer.confirm('您确定删除本产品？', {
    		  btn: ['确定','取消'] //按钮
    		}, function(){
    			$.ajax({
    	    		type : "POST",
    	    		async : false,
    	    		dataType : "JSON",
    	    		cache : false,
    	    		traditional: true, 
    	    		url :"${ctx}/a/product/bidderProduct/bidderdelPro",
    	    		data : {		
    	    			id:id,
    	    		},
    	    		success : function(data) {
    	    			var liId = "li_"+id;
    	    			$("#"+liId).hide();
    	    			  layer.msg('删除产品成功', {icon: 1});
    	    		},
    	            error: function(XMLHttpRequest, textStatus, errorThrown) {
    	            	 layer.msg('删除产品失败', {icon: 1});
    	            }//end-callback
    	    	});//end-ajax
    	    	
    		
    		}, function(){
    			 layer.msg('操作取消', {icon: 1});
    		});
    	
    	
    	
    	
    }
    
    var minBHeight = $(window).height();
    $("body").css('min-height',"700px")
    $(window).resize(function () {
      $(document.body).css('min-height',"700px")
    })
    </script>
    
</body>
</html>