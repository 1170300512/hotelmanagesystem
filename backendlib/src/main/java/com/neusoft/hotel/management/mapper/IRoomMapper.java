package com.neusoft.hotel.management.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.neusoft.hotel.management.model.RoomModel;


import java.util.List;
@Component
@Mapper
public interface IRoomMapper {

	//增加房间
    public int insert(RoomModel record);
    //删除房间
    public int delete(RoomModel roomId);    
    //修改房间信息
    public int update(RoomModel record);
    //查看某个房间信息
    public RoomModel selectByPrimaryKey(int roomId);
    //取得所有房间列表
    public List<RoomModel> selectByAll();
    //取得所有房间列表，分页模式 参数： start：起始位置； rows:取得记录格式
    public List<RoomModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
    //取得房间的个数
  	public int selectCountByAll() throws Exception;
}
