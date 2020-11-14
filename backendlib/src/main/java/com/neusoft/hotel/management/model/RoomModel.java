package com.neusoft.hotel.management.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;
//房间信息,包括房间id,房间号码,房间类型ID,房间类型,房间价格,房间折扣,房间状态,备注,创建时间,更新时间
@Alias("Room")
public class RoomModel {
	//房间id
    private Integer roomId;
    //房间号码
    private String roomNumber;
    //房间类型ID
    private Integer typeId;
    //房间类型
    private String roomType;
    //房间价格
    private Double roomPrice;
    //房间折扣
    private Double roomDiscount;
    //房间状态
    private int roomStatus;
    //备注
    private String remark;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

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

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Double getRoomDiscount() {
        return roomDiscount;
    }

    public void setRoomDiscount(Double roomDiscount) {
        this.roomDiscount = roomDiscount;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public RoomModel() {
    }

    public RoomModel(String roomNumber, Integer typeId, String roomType, Double roomPrice, Double roomDiscount, Integer roomStatus, String remark) {
        this.roomNumber = roomNumber;
        this.typeId = typeId;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomDiscount = roomDiscount;
        this.roomStatus = roomStatus;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomNumber='" + roomNumber + '\'' +
                ", typeId=" + typeId +
                ", roomType='" + roomType + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomDiscount=" + roomDiscount +
                ", roomStatus=" + roomStatus +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}