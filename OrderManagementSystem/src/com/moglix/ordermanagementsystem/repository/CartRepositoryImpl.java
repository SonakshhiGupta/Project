package com.moglix.ordermanagementsystem.repository;

import com.moglix.ordermanagementsystem.dto.Cart;

public  class CartRepositoryImpl implements CartRepository {

	
	private static CartRepository cartRepository;
	
	public CartRepositoryImpl() {
		
	}
	public static CartRepository getInstance() {
		if(cartRepository==null) {
			cartRepository=new CartRepositoryImpl();
			return cartRepository;
				
	}
		else {
			return cartRepository;
		}
	}

	private static int count=0;
	Cart c[]=new Cart[10];
	

	@Override
	public Cart getCartById(String id) {
		
		for (Cart cart : c) {
			if(cart!=null && id.equals(cart.getCartId())) {
				return cart;
				}	
			}
				return null;
	}

	@Override
	public Cart[] getAllCartID() {
		
		return c;
	}
	@Override
	public String addCart(Cart cart) {
		if(count<c.length) {
			c[count++]=cart;
			return "order added successfully";
		}
		else {
			return "No space to add order";
		}
	}
	
	private int getIndex(String cid) {
		for(int i=0;i<c.length;i++) {
			if(c[i]!=null && c[i].getCartId().equals(cid)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public String deleteCartById(String id) {
		int index=this.getIndex(id);
		c[index]=null;
		if(index!= -1) {
			return "success";
		}
		else {
			return "not found";
		}
	}
	@Override
	public void deleteAllCart() {
		c=null;
	}
	@Override
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


