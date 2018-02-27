package com.hust.microsoul.model;

import java.util.Date;

/** 
 * @Description:OrderModel.java
 * @author  huwentao 
 * @date 创建时间：2018年1月22日 下午2:13:22 
 * @version 1.0  
 */
public class OrderModel {
	
    private Integer orderId;

    private Integer state;

    private Integer logisticId;

    private Integer buyerId;

    private Integer sellerId;
   
    private Date orderTime;

    private Date payTime;

    private Date deliverTime;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getLogisticId() {
		return logisticId;
	}

	public void setLogisticId(Integer logisticId) {
		this.logisticId = logisticId;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(Date deliverTime) {
		this.deliverTime = deliverTime;
	}
}
