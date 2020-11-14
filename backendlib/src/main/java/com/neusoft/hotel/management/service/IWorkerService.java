package com.neusoft.hotel.management.service;

import com.neusoft.hotel.management.model.WorkerModel;


import java.util.List;


public interface IWorkerService {
	//增加操作员
	public int add(WorkerModel dm) throws Exception;
	//修改操作员
	public void modify(WorkerModel dm) throws Exception;
	//删除操作员
	public void delete(WorkerModel dm) throws Exception;
	//取得所有操作员列表
	public List<WorkerModel> getListByAll() throws Exception;
	//取得所有操作员列表,分页模式
	public List<WorkerModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得某个操作员信息
	public WorkerModel getByNo(int no) throws Exception;
	//取得操作员的个数
	public int getCountByAll() throws Exception;
	//取得操作员的显示页数
	public int getPageCountByAll(int rows) throws Exception;
	//取得操作员信息,由username
	public WorkerModel getByName(String username);

}
