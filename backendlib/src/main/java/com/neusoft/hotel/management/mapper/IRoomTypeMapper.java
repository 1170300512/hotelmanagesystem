package com.neusoft.hotel.management.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.neusoft.hotel.management.model.RoomTypeModel;


import java.util.List;
//对房间类型的增删改查,取列表,分页
@Component
@Mapper
public interface IRoomTypeMapper {
	//增加房间类型
    public int insert(RoomTypeModel record);
    //删除房间
    public int delete(RoomTypeModel typeId);    
    //修改房间类型信息
    public int update(RoomTypeModel record);
    //查看某个房间类型信息
    public RoomTypeModel selectByPrimaryKey(int typeId);
    //取得所有房间类型列表
    public List<RoomTypeModel> selectByAll();
    //取得所有房间类型列表，分页模式 参数： start：起始位置； rows:取得记录格式
    public List<RoomTypeModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
    //取得房间类型的个数
  	public int selectCountByAll() throws Exception;
    
}
