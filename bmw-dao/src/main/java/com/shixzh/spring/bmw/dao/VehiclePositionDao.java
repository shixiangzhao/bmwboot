package com.shixzh.spring.bmw.dao;

import com.shixzh.spring.bmw.po.VehiclePositionPO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/8 10:36
 */
@Component
public class VehiclePositionDao {

    /**
     * todo autowired
     *
     * @author: ZhaoShixiang <br>
     * @date:   2018/11/9 10:08
     */
    private final SqlSession sqlSession;

    public VehiclePositionDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<VehiclePositionPO> selectAllSessionsByVehicleId(String vehicleId) {
        return this.sqlSession.selectList("selectAllSessionsByVehicleId", vehicleId);
    }


}