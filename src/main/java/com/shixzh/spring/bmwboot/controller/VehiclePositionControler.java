package com.shixzh.spring.bmwboot.controller;

import com.shixzh.spring.bmwboot.model.VehiclePositionModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/6 11:14
 */
@RestController
public class VehiclePositionControler {

    private final AtomicLong count = new AtomicLong();
    @RequestMapping("/getAllSessionsOfAVehicle")
    public VehiclePositionModel getAllSessionsOfAVehicle(@RequestParam(value = "name", defaultValue = "world") String name){
        return new VehiclePositionModel(count.incrementAndGet(), name);
    }

}