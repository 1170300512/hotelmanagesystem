package com.neusoft.hotel.management.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.neusoft.hotel.management.model.WorkerModel;

import java.util.List;

@Component
@Mapper
public interface IWorkerMapper {
	//增加操作员
    public int insert(WorkerModel record);
    //删除操作员
    public int delete(WorkerModel Worker);    
    //修改操作员信息
    public int update(WorkerModel record);
    //查看某个操作员信息
    public WorkerModel selectByPrimaryKey(int WorkerId);
    //取得所有操作员列表
    public List<WorkerModel> selectByAll();
    //取得所有操作员列表，分页模式 参数： start：起始位置； rows:取得记录格式
    public List<WorkerModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
    //取得操作员的个数
  	public int selectCountByAll() throws Exception;
  	//由username取得某操作员信息
  	public WorkerModel getByName(String username) ;
}
