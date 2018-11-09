package com.shixzh.spring.bmw.service;

import com.shixzh.spring.bmw.dto.VehiclePositionDTO;
import com.shixzh.spring.bmw.po.VehiclePositionPO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/8 11:13
 */
public interface VehiclePositionService {

    List<VehiclePositionDTO> getAllSessionsOfAVehicle(String vehicleId);
}