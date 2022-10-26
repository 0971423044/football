package xuan.xhaka.dao;

import org.springframework.stereotype.Repository;

import xuan.xhaka.entity.Cart;
import xuan.xhaka.entity.Product;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CartMapper {
	
	ProductMapper proMapper = new ProductMapper();
	
	// add new product to cart
	public HashMap<Integer,Cart> addToCart(int product_id, HashMap<Integer,Cart> cart)
	{
		Cart itemCart = new Cart();
		
		Product product = proMapper.getProductById(product_id);
		
		if(product != null && cart.containsKey(product_id))
		{
			itemCart = cart.get(product_id);
			
			itemCart.setQuantity(itemCart.getQuantity() + 1);
			itemCart.setTotalPrice(itemCart.getQuantity()*itemCart.getProduct().getPrice());
			
		}else {
			itemCart.setProduct(product);
			itemCart.setQuantity(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		cart.put(product_id, itemCart);
		return cart;
	}
	
	// edit cart 
	public HashMap<Integer,Cart> editToCart(int product_id,int quantity, HashMap<Integer,Cart> cart)
	{
		Product product = proMapper.getProductById(product_id);
		Cart itemCart = new Cart();
		if(cart.containsKey(product_id))
		{
			itemCart = cart.get(product_id);
			itemCart.setQuantity(quantity);
			itemCart.setTotalPrice(quantity*itemCart.getProduct().getPrice());
		}
		cart.put(product_id, itemCart);
		return cart;
	}
	public HashMap<Integer,Cart> deleteToCart(int product_id, HashMap<Integer,Cart> cart)
	{
		if(cart==null)
		{
			return cart;
		}
		if(cart.containsKey(product_id))
		{
			cart.remove(product_id);
		}
		return cart;
		
	}
	public int TotalQuantity(HashMap<Integer,Cart> cart)
	{
		int totalQuantity = 0 ;
		for(Map.Entry<Integer,Cart> itemCart : cart.entrySet())
		{
			totalQuantity += itemCart.getValue().getQuantity();
		}
		return totalQuantity;
	}
	public double TotalPrice(HashMap<Integer,Cart> cart)
	{
		double totalPrice = 0;
		for(Map.Entry<Integer,Cart> itemCart : cart.entrySet())
		{
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}
}
