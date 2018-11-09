package com.shixzh.spring.bmw.service.impl;

import com.shixzh.spring.bmw.dao.VehiclePositionDao;
import com.shixzh.spring.bmw.dto.VehiclePositionDTO;
import com.shixzh.spring.bmw.po.VehiclePositionPO;
import com.shixzh.spring.bmw.service.VehiclePositionService;
import com.shixzh.spring.bmw.utils.BmwBeanUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/8 11:13
 */
@Service("vehiclePositionService")
public class VehiclePositionServiceImpl implements VehiclePositionService {

    @Autowired
    private VehiclePositionDao vehiclePositionDao;

    @Override
    public List<VehiclePositionDTO> getAllSessionsOfAVehicle(String vehicleId){
        List<VehiclePositionPO> lists = null;
        //todo lists = vehiclePositionDao.selectAllSessionsByVehicleId(vehicleId);
        return BmwBeanUtiles.generatorList(lists, VehiclePositionDTO.class);
    }

}