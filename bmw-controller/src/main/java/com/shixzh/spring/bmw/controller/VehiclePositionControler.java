package com.shixzh.spring.bmw.controller;

import com.shixzh.spring.bmw.common.CommonResult;
import com.shixzh.spring.bmw.constants.ResultCode;
import com.shixzh.spring.bmw.dto.VehiclePositionDTO;
import com.shixzh.spring.bmw.service.VehiclePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/6 11:14
 */
@RestController
public class VehiclePositionControler {

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

    @RequestMapping("/getPositionListOfASession/{sessionId}")
    public CommonResult<Object> getPositionListOfASession(@PathVariable(value = "sessionId") String sessionId) {
        CommonResult<Object> commonResult = new CommonResult<Object>(ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getMsg());
        List<VehiclePositionDTO> results = vehiclePositionService.getPositionListOfASession(sessionId);
        commonResult.setData(results);
        return commonResult;
    }

    @RequestMapping("/getLastPositionOfAVehicle/{vehicleId}")
    public CommonResult<Object> getLastPositionOfAVehicle(@PathVariable(value = "vehicleId") String vehicleId) {
        CommonResult<Object> commonResult = new CommonResult<Object>(ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getMsg());
        VehiclePositionDTO result = vehiclePositionService.getLastPositionOfAVehicle(vehicleId);
        commonResult.setData(result);
        return commonResult;

    }

}