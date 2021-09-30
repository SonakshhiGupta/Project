package com.moglix.ordermanagementsystem.repository;

import com.moglix.ordermanagementsystem.dto.Cart;

public interface CartRepository {
	public String addCart(Cart cart);
	public Cart getCartById(String id);
	public Cart[] getAllCartID();
	public String deleteCartById(String id);
	public void deleteAllCart();
	public String updateCart(String cartId, Cart cart);
	
}
