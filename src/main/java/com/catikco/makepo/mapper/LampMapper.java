package com.catikco.makepo.mapper;

import com.catikco.makepo.entity.Lamp;
import com.catikco.makepo.entity.LampExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LampMapper {
    int countByExample(LampExample example);

    int deleteByExample(LampExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lamp record);

    int insertSelective(Lamp record);

    List<Lamp> selectByExampleWithBLOBs(LampExample example);

    List<Lamp> selectByExample(LampExample example);

    Lamp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lamp record, @Param("example") LampExample example);

    int updateByExampleWithBLOBs(@Param("record") Lamp record, @Param("example") LampExample example);

    int updateByExample(@Param("record") Lamp record, @Param("example") LampExample example);

    int updateByPrimaryKeySelective(Lamp record);

    int updateByPrimaryKeyWithBLOBs(Lamp record);

    int updateByPrimaryKey(Lamp record);
}