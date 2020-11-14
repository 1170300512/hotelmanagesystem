package com.neusoft.hotel.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.management.model.RoomTypeModel;
import com.neusoft.hotel.management.service.IRoomTypeService;
import com.neusoft.hotel.restresult.Result;

@RestController
@RequestMapping(value="/roomType")
@CrossOrigin(origins = {"*", "null"})
public class RoomTypeController {
	
	@Autowired
	private IRoomTypeService ds=null;
		
	@PostMapping(value="/add")
	public Result<String> add(@RequestBody RoomTypeModel dm) throws Exception{
		ds.add(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加房间类型成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(@RequestBody RoomTypeModel dm) throws Exception{
		ds.modify(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改房间类型成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody RoomTypeModel dm) throws Exception{
		ds.delete(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除房间类型成功!");
		return result;
	}
	//取得房间类型列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<RoomTypeModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{

		Result<RoomTypeModel> result=new Result<RoomTypeModel>();
		result.setCount(ds.getCountByAll());
		result.setPageCount(ds.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPage(rows, page));
		result.setStatus("OK");
		result.setMessage("取得房间类型列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<RoomTypeModel> getByNo(@RequestParam(required=true) int no) throws Exception{
		Result<RoomTypeModel> result=new Result<RoomTypeModel>();
		result.setResult(ds.getByNo(no));
		
		result.setStatus("OK");
		result.setMessage("取得指定房间类型对象成功!");
		return result;
	}
	

}
