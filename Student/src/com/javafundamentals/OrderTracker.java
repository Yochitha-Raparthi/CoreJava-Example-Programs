package com.javafundamentals;

public class OrderTracker {

	int orderId;
	String customerName;
	String productName;
	int quantity;
	double price;
	String status;
	String deliveryAddress;
	int getOrderId() {
		return orderId;
	}
	String getCustomerName() {
		return customerName;
	}
	String getProductName() {
		return productName;
	}
	int getQuantity() {
		return quantity;
	}
	double getPrice() {
		return price*quantity;
	}
	String getStatus() {
		return status;
	}
	String getDeliveryAddress() {
		return deliveryAddress;
	}
	void updateQunatity(int quantity,int orderId) {
		if(this.orderId==orderId) {
		this.quantity=quantity;
		System.out.println("Updated price is :"+price*quantity);
		}else {
			System.out.println("Give the correct order id ");
			System.out.println(" price is :"+price*this.quantity);
		}
		
	}
	void updateStatus(String status,int orderId) {
		if(this.orderId==orderId) {
			this.status=status;
			System.out.println("status of the order : "+status);
	   }else {
		   System.out.println("Give the correct order id ");
			System.out.println("status of the order :"+this.status);
	   }
		
	}
	void cancelOrder(int orderId) {
		if(this.orderId==orderId) {
			updateStatus("cancelled",orderId);
	   }else {
		   System.out.println("Give the correct order id ");
			System.out.println("status of the order :"+this.status);
	   }
		
	}
	void displayOrderSummary() {
		System.out.println("Order id is : "+getOrderId());
		System.out.println("Customer Name is : "+getCustomerName());
		System.out.println("Product Names is : "+getProductName());
		System.out.println("Quantity of the product : "+getQuantity());
		System.out.println("Price of the order : "+getPrice());
		System.out.println("Status of the order : "+getStatus());
		System.out.println("Address of the customer : "+getDeliveryAddress());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("order 1 details.....");
       OrderTracker o1=new OrderTracker();
       o1.orderId=101;
   	   o1.customerName="yochitha";
   	   o1.productName="phone case";
   	   o1.quantity=1;
   	   o1.price=200;
   	   o1.status="order placed";
   	   o1.deliveryAddress="hyderabad";
   	   o1.displayOrderSummary();
   	   System.out.println("\norder 2 details.....");
   	   OrderTracker o2=new OrderTracker();
       o2.orderId=102;
	   o2.customerName="teja";
	   o2.productName="tea cups";
	   o2.quantity=2;
	   o2.price=100;
	   o2.status="order shipped";
	   o2.deliveryAddress="srikakulam";
	   o2.displayOrderSummary();
	   
	   o1.updateQunatity(2,103);
	   o2.updateStatus("delivered", 103);
	   o2.cancelOrder(102);
	}

}
