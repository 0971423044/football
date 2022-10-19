package xuan.xhaka.services;

import java.util.List;

import org.springframework.stereotype.Service;

import xuan.xhaka.entity.Slide;

@Service
public interface SlideService {
		public List<Slide> getListSlides();
}
