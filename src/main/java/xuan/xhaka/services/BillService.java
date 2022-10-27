package xuan.xhaka.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import xuan.xhaka.entity.Bill;
import xuan.xhaka.entity.BillDetail;
import xuan.xhaka.entity.Cart;

@Service
public interface BillService {
	
	public int AddBill(Bill bill);
	public void AddBillDetail(HashMap<Integer,Cart> carts);
	
	public List<Bill> getListBill();
	public List<BillDetail> getListBillDetail();

}
