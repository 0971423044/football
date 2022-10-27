package xuan.xhaka.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xuan.xhaka.dao.BillMapper;
import xuan.xhaka.entity.Bill;
import xuan.xhaka.entity.BillDetail;
import xuan.xhaka.entity.Cart;
import xuan.xhaka.services.BillService;

@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	BillMapper billMapper;

	@Override
	public int AddBill(Bill bill) {
		// TODO Auto-generated method stub
		
		return billMapper.AddBill(bill);
	}

	@Override
	public void AddBillDetail(HashMap<Integer, Cart> carts) {
		// TODO Auto-generated method stub
		int idMaxBill = billMapper.getIdLastBill();
		for(Map.Entry<Integer, Cart> itemCart : carts.entrySet())
		{
			BillDetail billDetail = new BillDetail();
			
			billDetail.setBill_id(idMaxBill);
			billDetail.setProduct_id(itemCart.getValue().getProduct().getProduct_id());
			billDetail.setQuantity(itemCart.getValue().getQuantity());
			billDetail.setTotal(itemCart.getValue().getTotalPrice());
			
			billMapper.AddBillDetail(billDetail);
			
		}
		
	}

}
