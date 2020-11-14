package com.neusoft.hotel.management.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.management.mapper.IRoomTypeMapper;
import com.neusoft.hotel.management.model.RoomTypeModel;
import com.neusoft.hotel.management.service.IRoomTypeService;


@Service
@Transactional  //环绕事务Advice的切入点
public class RoomTypeServiceImpl implements IRoomTypeService {
	@Autowired
	private IRoomTypeMapper roomTypeMapper=null;
	@Override
	public int add(RoomTypeModel dm) throws Exception {
		roomTypeMapper.insert(dm);
		return dm.getTypeId();
	}

	@Override
	public void modify(RoomTypeModel dm) throws Exception {
		roomTypeMapper.update(dm);
	}

	@Override
	public void delete(RoomTypeModel dm) throws Exception {
		roomTypeMapper.delete(dm);
	}

	@Override
	public List<RoomTypeModel> getListByAll() throws Exception {
		
		return roomTypeMapper.selectByAll();
	}

	@Override
	public List<RoomTypeModel> getListByAllWithPage(int rows, int page) throws Exception {

		return roomTypeMapper.selectByAllWithPage(rows*(page-1), rows);
	}
	
	@Override
	public RoomTypeModel getByNo(int no) throws Exception {
		return roomTypeMapper.selectByPrimaryKey(no);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return roomTypeMapper.selectCountByAll();
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		
		int count=this.getCountByAll();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}


}
