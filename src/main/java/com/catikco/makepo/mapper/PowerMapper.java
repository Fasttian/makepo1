package com.catikco.makepo.mapper;

import com.catikco.makepo.entity.Power;
import com.catikco.makepo.entity.PowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerMapper {
    int countByExample(PowerExample example);

    int deleteByExample(PowerExample example);

    int insert(Power record);

    int insertSelective(Power record);

    List<Power> selectByExampleWithBLOBs(PowerExample example);

    List<Power> selectByExample(PowerExample example);

    int updateByExampleSelective(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByExampleWithBLOBs(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByExample(@Param("record") Power record, @Param("example") PowerExample example);
}