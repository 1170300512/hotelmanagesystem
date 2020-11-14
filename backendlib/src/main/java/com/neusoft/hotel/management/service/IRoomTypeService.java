package com.neusoft.hotel.management.service;

import com.neusoft.hotel.management.model.RoomTypeModel;


import java.util.List;


public interface IRoomTypeService {
	//增加房间类型
	public int add(RoomTypeModel dm) throws Exception;
	//修改房间类型
	public void modify(RoomTypeModel dm) throws Exception;
	//删除房间类型
	public void delete(RoomTypeModel dm) throws Exception;
	//取得所有房间类型列表
	public List<RoomTypeModel> getListByAll() throws Exception;
	//取得所有房间类型列表,分页模式
	public List<RoomTypeModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得某个房间类型信息
	public RoomTypeModel getByNo(int no) throws Exception;
	//取得房间类型的个数
	public int getCountByAll() throws Exception;
	//取得房间类型的显示页数
	public int getPageCountByAll(int rows) throws Exception;

}
