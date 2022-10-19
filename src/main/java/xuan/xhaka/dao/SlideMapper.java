package xuan.xhaka.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import xuan.xhaka.entity.Slide;
import xuan.xhaka.util.MyBatisUtilConfig;

@Repository
public class SlideMapper {
	public List<Slide> getListSlides()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		List<Slide> listSlides = session.selectList("getAllSlides");
		return listSlides;
	}
}
