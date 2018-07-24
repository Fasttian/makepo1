package com.catikco.makepo.mapper;

import com.catikco.makepo.entity.Power;
import com.catikco.makepo.entity.PowerExample;
import com.catikco.makepo.entity.PowerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerMapper {
    int countByExample(PowerExample example);

    int deleteByExample(PowerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PowerWithBLOBs record);

    int insertSelective(PowerWithBLOBs record);

    List<PowerWithBLOBs> selectByExampleWithBLOBs(PowerExample example);

    List<Power> selectByExample(PowerExample example);

    PowerWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PowerWithBLOBs record, @Param("example") PowerExample example);

    int updateByExampleWithBLOBs(@Param("record") PowerWithBLOBs record, @Param("example") PowerExample example);

    int updateByExample(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByPrimaryKeySelective(PowerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PowerWithBLOBs record);

    int updateByPrimaryKey(Power record);
}