package xuan.xhaka.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import xuan.xhaka.entity.Bill;
import xuan.xhaka.entity.BillDetail;
import xuan.xhaka.util.MyBatisUtilConfig;

@Repository
public class BillMapper {
	
	public int AddBill(Bill bill)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		int count = session.insert("insertBill", bill);
		
		session.commit();
		session.close();
		
		return count;
	}
	public int getIdLastBill()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		int maxIdBill = Integer.parseInt(session.selectOne("getMaxId").toString()); 
		
		return maxIdBill;
	}
	public int AddBillDetail(BillDetail billDetail)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		int countBillDetail = session.insert("insertBillDetail", billDetail);
		
		return countBillDetail;
	}
	public List<Bill> getListBills()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		List<Bill> listBill = session.selectList("getAllBills");
		session.commit();
		session.close();
		
		return listBill;
	}
	public List<BillDetail> getListBillDetail()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		List<BillDetail> listBillDetail = session.selectList("getAllBillDetail");
		session.commit();
		session.close();
		
		return listBillDetail;
	}
}
