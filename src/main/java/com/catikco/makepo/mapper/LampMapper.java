package com.catikco.makepo.mapper;

import com.catikco.makepo.entity.Lamp;
import com.catikco.makepo.entity.LampExample;
import com.catikco.makepo.entity.LampWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LampMapper {
    int countByExample(LampExample example);

    int deleteByExample(LampExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LampWithBLOBs record);

    int insertSelective(LampWithBLOBs record);

    List<LampWithBLOBs> selectByExampleWithBLOBs(LampExample example);

    List<Lamp> selectByExample(LampExample example);

    LampWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LampWithBLOBs record, @Param("example") LampExample example);

    int updateByExampleWithBLOBs(@Param("record") LampWithBLOBs record, @Param("example") LampExample example);

    int updateByExample(@Param("record") Lamp record, @Param("example") LampExample example);

    int updateByPrimaryKeySelective(LampWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LampWithBLOBs record);

    int updateByPrimaryKey(Lamp record);
}