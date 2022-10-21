package xuan.xhaka.services;

import org.springframework.stereotype.Service;

import xuan.xhaka.dto.PaginatesDto;

@Service
public interface PaginateService {
	
	public PaginatesDto getInfoPaginate(int totalData, int limit, int currentPage);

}
