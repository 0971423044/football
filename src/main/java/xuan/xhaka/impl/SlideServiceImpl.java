package xuan.xhaka.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xuan.xhaka.dao.SlideMapper;
import xuan.xhaka.entity.Slide;
import xuan.xhaka.services.SlideService;

@Service
public class SlideServiceImpl implements SlideService {

	@Autowired
	SlideMapper slideMapper;
	@Override
	public List<Slide> getListSlides() {
		// TODO Auto-generated method stub
		
		List<Slide> listSlides = slideMapper.getListSlides();
		
		return listSlides;
	}

}
