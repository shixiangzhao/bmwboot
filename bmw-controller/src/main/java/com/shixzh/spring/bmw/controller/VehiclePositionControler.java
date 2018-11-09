package com.shixzh.spring.bmw.controller;

import com.shixzh.spring.bmw.common.CommonResult;
import com.shixzh.spring.bmw.constants.ResultCode;
import com.shixzh.spring.bmw.dto.VehiclePositionDTO;
import com.shixzh.spring.bmw.service.VehiclePositionService;
import com.shixzh.spring.bmw.vo.VehiclePositionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/6 11:14
 */
@RestController
public class VehiclePositionControler {

    private final AtomicLong count = new AtomicLong();
    @Autowired
    private VehiclePositionService vehiclePositionService;

    @RequestMapping("/getAllSessionsOfAVehicle/{vehicleId}")
    public CommonResult<Object> getAllSessionsOfAVehicle(@PathVariable(value = "vehicleId") String vehicleId){
        CommonResult<Object> commonResult = new CommonResult<Object>(ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getMsg());
        List<VehiclePositionDTO> results = vehiclePositionService.getAllSessionsOfAVehicle(vehicleId);
        commonResult.setData(results);
        return commonResult;
    }

}