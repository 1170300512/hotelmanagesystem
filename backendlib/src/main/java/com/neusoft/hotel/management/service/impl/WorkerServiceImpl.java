package com.neusoft.hotel.management.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.management.mapper.IWorkerMapper;
import com.neusoft.hotel.management.model.WorkerModel;
import com.neusoft.hotel.management.service.IWorkerService;


@Service
@Transactional  //环绕事务Advice的切入点
public class WorkerServiceImpl implements IWorkerService {
	@Autowired
	private IWorkerMapper workerMapper=null;
	@Override
	public int add(WorkerModel dm) throws Exception {
		workerMapper.insert(dm);
		return dm.getWorkerId();
	}

	@Override
	public void modify(WorkerModel dm) throws Exception {
		workerMapper.update(dm);
	}

	@Override
	public void delete(WorkerModel dm) throws Exception {
		workerMapper.delete(dm);
	}

	@Override
	public List<WorkerModel> getListByAll() throws Exception {
		
		return workerMapper.selectByAll();
	}

	@Override
	public List<WorkerModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return workerMapper.selectByAllWithPage(rows*(page-1), rows);
	}
	
	@Override
	public WorkerModel getByNo(int no) throws Exception {
		return workerMapper.selectByPrimaryKey(no);
	}
	
	@Override
	public int getCountByAll() throws Exception {
	
		return workerMapper.selectCountByAll();
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

	@Override
	public WorkerModel getByName(String username) {
		
		return workerMapper.getByName(username);
	}




}
