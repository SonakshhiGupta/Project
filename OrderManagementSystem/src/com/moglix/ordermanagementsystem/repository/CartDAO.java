package com.moglix.ordermanagementsystem.repository;


import com.moglix.ordermanagementsystem.dto.Cart;

public class CartDAO {
	private static int count=0;
	Cart c[]=new Cart[10];
	public String addCart(Cart cart) {
		if(count<c.length) {
			c[count++]=cart;
			return "order added successfully";
		}
		else {
			return "No space to add order";
		}
	}
	
	public Cart getCartById  (String id) {
		for (Cart cart : c) {
			if(cart!=null && id.equals(cart.getCartId())) {
				return cart;
				}	
			}
				return null;	
		}
	public Cart[] getAllCartID() {
		return c;
	}
	private int getIndex(String cid) {
		for(int i=0;i<c.length;i++) {
			if(c[i]!=null && c[i].getCartId().equals(cid)) {
				return i;
			}
		}
		return -1;
	}
	public String deleteCartbyId(String cid) {
		
		int index=this.getIndex(cid);
		c[index]=null;
		if(index!= -1) {
			return "success";
		}
		else {
			return "not found";
		}
		}
	public void deleteAllCart() {
		c=null;
	}

	public String updateCart(String cartId, Cart cart) {
		int index=this.getIndex(cartId);
		
		if(index!= -1) {
			c[index]=cart;
			return "success";
	}
		else {
					return "Data not updated";
		}
	}

}
