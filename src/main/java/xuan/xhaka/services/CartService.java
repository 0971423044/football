package xuan.xhaka.services;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import xuan.xhaka.entity.Cart;

@Service
public interface CartService {
	
	public HashMap<Integer,Cart> addToCart(int product_id, HashMap<Integer,Cart> cart);
	public HashMap<Integer,Cart> editToCart(int product_id, int quantity, HashMap<Integer,Cart> cart);
	public HashMap<Integer,Cart> deleteToCart(int product_id, HashMap<Integer,Cart> cart);
	public int TotalQuantity(HashMap<Integer,Cart> cart);
	public double TotalPrice(HashMap<Integer,Cart> cart);

}
