package com.catikco.makepo.mapper;

import com.catikco.makepo.entity.Cyclopedia;
import com.catikco.makepo.entity.CyclopediaExample;
import com.catikco.makepo.entity.CyclopediaWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CyclopediaMapper {
    int countByExample(CyclopediaExample example);

    int deleteByExample(CyclopediaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CyclopediaWithBLOBs record);

    int insertSelective(CyclopediaWithBLOBs record);

    List<CyclopediaWithBLOBs> selectByExampleWithBLOBs(CyclopediaExample example);

    List<Cyclopedia> selectByExample(CyclopediaExample example);

    CyclopediaWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CyclopediaWithBLOBs record, @Param("example") CyclopediaExample example);

    int updateByExampleWithBLOBs(@Param("record") CyclopediaWithBLOBs record, @Param("example") CyclopediaExample example);

    int updateByExample(@Param("record") Cyclopedia record, @Param("example") CyclopediaExample example);

    int updateByPrimaryKeySelective(CyclopediaWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CyclopediaWithBLOBs record);

    int updateByPrimaryKey(Cyclopedia record);
}