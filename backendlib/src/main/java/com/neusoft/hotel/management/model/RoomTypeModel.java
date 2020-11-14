package com.neusoft.hotel.management.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;
//房间类型信息:类型ID,类型名,房型备注,预定价格,预定折扣,房间大小:m^2,床位数量,床位大小,是否有窗：0-无，1-有,创建时间,更新时间
@Alias("RoomType")
public class RoomTypeModel {
	//类型ID
    private Integer typeId;
    //类型名
    private String roomType;
    //房型备注

    private String remark;
    //预定价格
    private Double price;
    //预定折扣
    private Double discount;
    //房间大小:m^2
    private Integer area;
    //床位数量
    private Integer bedNum;
    //床位大小
    private String bedSize;
    //是否有窗
    private Integer window;
    public Integer getRest() {
		return rest;
	}

	public void setRest(Integer rest) {
		this.rest = rest;
	}

	//是否有窗
    private Integer rest;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getBedNum() {
        return bedNum;
    }

    public void setBedNum(Integer bedNum) {
        this.bedNum = bedNum;
    }

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize == null ? null : bedSize.trim();
    }

    public Integer getWindow() {
        return window;
    }

    public void setWindow(Integer window) {
        this.window = window;
    }

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


    public RoomTypeModel(String roomType, String remark, Double price, Double discount, Integer area, Integer bedNum, String bedSize, Integer window) {
        this.roomType = roomType;
        this.remark = remark;
        this.price = price;
        this.discount = discount;
        this.area = area;
        this.bedNum = bedNum;
        this.bedSize = bedSize;
        this.window = window;
    }
    public RoomTypeModel(){
        
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "typeId=" + typeId +
                ", roomType='" + roomType + '\'' +
                ", remark='" + remark + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", area=" + area +
                ", bedNum=" + bedNum +
                ", bedSize='" + bedSize + '\'' +
                ", window=" + window +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }



}
