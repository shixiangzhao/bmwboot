package com.shixzh.spring.bmw.web;

import com.shixzh.spring.bmw.dao.VehiclePositionDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/6 15:06
 */
@SpringBootApplication
//todo add "com.shixzh.spring.bmw.controller", "com.shixzh.spring.bmw.service",
@ComponentScan(basePackages = {"com.shixzh.spring.bmw.dao"})
//@MapperScan("com.shixzh.spring.bmw.dao")
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final VehiclePositionDao vehiclePositionDao;

    public Application(VehiclePositionDao vehiclePositionDao) {
        this.vehiclePositionDao = vehiclePositionDao;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.vehiclePositionDao.selectAllSessionsByVehicleId("WLQBNAL7EM14E3N"));
    }

}
