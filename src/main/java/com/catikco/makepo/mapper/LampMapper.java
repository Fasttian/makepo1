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

    int insert(Lamp record);

    int insertSelective(Lamp record);

    List<Lamp> selectByExampleWithBLOBs(LampExample example);

    List<Lamp> selectByExample(LampExample example);

    int updateByExampleSelective(@Param("record") Lamp record, @Param("example") LampExample example);

    int updateByExampleWithBLOBs(@Param("record") Lamp record, @Param("example") LampExample example);

    int updateByExample(@Param("record") Lamp record, @Param("example") LampExample example);
}