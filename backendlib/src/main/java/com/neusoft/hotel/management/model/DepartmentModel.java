package com.neusoft.hotel.management.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.ibatis.type.Alias;
//部门Model类
@Alias("Department")
public class DepartmentModel implements Serializable {
	//序号
	private int no=0;
	//编码
	private String code=null;
	//部门名称
	private String name=null;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
