package com.neusoft.hotel.management.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.management.model.WorkerModel;
import com.neusoft.hotel.management.service.IWorkerService;
import com.neusoft.hotel.restresult.Result;



//管理员控制器类
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"*", "null"})
public class WorkerLoginController {
	@Autowired
	private IWorkerService WorkerService=null;
	
	@PostMapping(value="/validate")
	public Result<WorkerModel> validate(@RequestParam(required=true) String username,@RequestParam(required=true) String password,HttpSession session) throws Exception{
		Result<WorkerModel> result=new Result<WorkerModel>();
		WorkerModel wm=WorkerService.getByName(username);
		if(wm!=null&&wm.getPassword()!=null&&wm.getPassword().equals(password)&&wm.getRole().equals("admin")) {
			result.setStringResult("Y");			
			result.setResult(WorkerService.getByName(username));
			result.setMessage("管理员验证成功");
			//保存管理员会话信息
			session.setAttribute("Worker", result.getResult());
		}
		else {
			result.setStringResult("N");
			result.setMessage("管理员验证失败");
		}
		result.setStatus("OK");
		return result;
	}
	@GetMapping(value="/get/{username}")
	public Result<WorkerModel> get(@PathVariable(value="username") String username) throws Exception{
		Result<WorkerModel> result=new Result<WorkerModel>();
		result.setStatus("OK");
		result.setResult(WorkerService.getByName(username));
		result.setMessage("取得管理员成功");
		return result;
		
	}
	@GetMapping(value="/checkUserLogin")
	public Result<String> checkUserLogined(HttpSession session) throws Exception{
		Result<String> result=new Result<String>();
		if(session!=null&&session.getAttribute("user")!=null) {
			result.setStringResult("Y");
			result.setStatus("OK");
			result.setMessage("管理员已经登录");
		}
		else {
			result.setStringResult("N");
			result.setStatus("OK");
			result.setMessage("管理员没有登录");
		}
		return result;
	}
	@GetMapping(value="/logout")
	public Result<String> logout(HttpSession session) throws Exception{
		Result<String> result=new Result<String>();
		session.invalidate(); //销毁登录信息
		result.setStatus("OK");
		result.setMessage("管理员已经登录");
		return result;
		
	}
	
	@GetMapping(value="/get/loginuser")
	public Result<WorkerModel> get(HttpSession session) throws Exception{
		Result<WorkerModel> result=new Result<WorkerModel>();
		result.setStatus("OK");
		result.setResult((WorkerModel)session.getAttribute("user"));
		result.setMessage("取得已经登录管理员成功");
		return result;
		
	}
	
	
	

}
