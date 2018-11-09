package com.shixzh.spring.bmw.dao;

import com.shixzh.spring.bmw.po.VehiclePositionPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/8 10:36
 */
@Mapper
public interface VehiclePositionMapperDao {

    List<VehiclePositionPO> selectAllSessionsByVehicleId(String vehicleId);

    List<VehiclePositionPO> selectPositionListOfASession(String sessionId);

    VehiclePositionPO selectLastPositionOfAVehicle(String vehicleId);
}