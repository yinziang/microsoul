# microsoul
灵微网
卖家商品模块：

	查看商品：http://localhost:8080/microsoul/goods/showGoodsList.do

	删除商品：http://localhost:8080/microsoul/goods/deleteGoodsModel.do
			必须参数：goodsId

	修改商品：http://localhost:8080/microsoul/goods/updateGoodsModel.do
			必须参数：goodsId

	添加商品：http://localhost:8080/microsoul/goods/insertGoodsModel.do
			必须参数：goodsName ; unitPrice  ; category  ; store   ; status  ; sellerId
			
卖家模块：

	登录：http://localhost:8080/microsoul/seller/login.do
		必须参数：accountName  	;	password
	退出：http://localhost:8080/microsoul/seller/exit.do
	
	注册：http://localhost:8080/microsoul/seller/register.do
			必须参数：accountName	；password
	更新卖家信息：http://localhost:8080/microsoul/seller/sellerInfo.do
			必须参数：idSeller
			
	修改旧密码：http://localhost:8080/microsoul/seller/sellerChangePassword.do
			必须参数：idSeller  ； password ；newPassword
