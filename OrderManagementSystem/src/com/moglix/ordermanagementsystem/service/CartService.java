package com.moglix.ordermanagementsystem.service;

import com.moglix.ordermanagementsystem.dto.Cart;
import com.moglix.ordermanagementsystem.repository.CartDAO;
import com.moglix.ordermanagementsystem.repository.CartRepository;
import com.moglix.ordermanagementsystem.repository.CartRepositoryImpl;

public class CartService {
	//CartDAO cartdao= new CartDAO();
	CartRepository cartRepository=CartRepositoryImpl.getInstance();
	
	public String addCart(Cart cart) {
		return cartRepository.addCart(cart);
	}
	
	public Cart getCartById  (String id) {
		return cartRepository.getCartById(id);
	}
	public Cart[] getAllCartID() {
		return cartRepository.getAllCartID();
	}
	public String deleteCartbyId(String id) {
		return cartRepository.deleteCartById(id);
	}
	public void deleteAllCart() {
		cartRepository.deleteAllCart();
	}
	public String updateCart(String cartId, Cart cart) {
		return cartRepository.updateCart(cartId,cart);
	}
	
} 
