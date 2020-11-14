package com.neusoft.hotel.management.service;

import com.neusoft.hotel.management.model.RoomModel;


import java.util.List;


public interface IRoomService {
	//增加房间
	public int add(RoomModel dm) throws Exception;
	//修改房间
	public void modify(RoomModel dm) throws Exception;
	//删除房间
	public void delete(RoomModel dm) throws Exception;
	//取得所有房间列表
	public List<RoomModel> getListByAll() throws Exception;
	//取得所有房间列表,分页模式
	public List<RoomModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得某个房间信息
	public RoomModel getByNo(int no) throws Exception;
	//取得房间的个数
	public int getCountByAll() throws Exception;
	//取得房间的显示页数
	public int getPageCountByAll(int rows) throws Exception;

}
