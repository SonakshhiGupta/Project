package com.moglix.ordermanagementsystem;

import com.moglix.ordermanagementsystem.dto.Cart;
import com.moglix.ordermanagementsystem.service.CartService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cart cart=new Cart();
		cart.setCartId("12345");
		cart.setInvId("456789");
		cart.setUserId("13467");
		cart.setProductID("43975");
		cart.setProductQty("45");
		cart.setTotalPrice("43687902");
		
		CartService cartService=new CartService();
		
		String items=cartService.addCart(cart);
			System.out.println(items);
			
		Cart cart1=cartService.getCartById("12345");
			if(cart1==null) {
				System.out.println("Cart ID is not valid");
			}
			else {
				System.out.println("Cart ID is valid");
			}
		Cart[] cart2=cartService.getAllCartID();
		for (Cart cart3 : cart2) {
			if(cart3!=null) {
				System.out.println("All the Cart IDs are as follows");
			}
		}
		
	}

}
