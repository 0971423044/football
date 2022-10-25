package xuan.xhaka.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xuan.xhaka.dao.CartMapper;
import xuan.xhaka.entity.Cart;
import xuan.xhaka.services.CartService;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartMapper cartMapper;
	@Override
	public HashMap<Integer, Cart> addToCart(int product_id, HashMap<Integer, Cart> cart) {
		// TODO Auto-generated method stub
		return cartMapper.addToCart(product_id, cart);
	}

	@Override
	public HashMap<Integer, Cart> editToCart(int product_id, int quantity, HashMap<Integer, Cart> cart) {
		// TODO Auto-generated method stub
		return cartMapper.editToCart(product_id, quantity, cart);
	}

	@Override
	public HashMap<Integer, Cart> deleteToCart(int product_id, HashMap<Integer, Cart> cart) {
		// TODO Auto-generated method stub
		return cartMapper.deleteToCart(product_id, cart);
	}

	@Override
	public int TotalQuantity(HashMap<Integer, Cart> cart) {
		// TODO Auto-generated method stub
		return cartMapper.TotalQuantity(cart);
	}

	@Override
	public double TotalPrice(HashMap<Integer, Cart> cart) {
		// TODO Auto-generated method stub
		return cartMapper.TotalPrice(cart);
	}

}
