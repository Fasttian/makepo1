package com.catikco.makepo.mapper;

import com.catikco.makepo.entity.News;
import com.catikco.makepo.entity.NewsExample;
import com.catikco.makepo.entity.NewsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int insert(NewsWithBLOBs record);

    int insertSelective(NewsWithBLOBs record);

    List<NewsWithBLOBs> selectByExampleWithBLOBs(NewsExample example);

    List<News> selectByExample(NewsExample example);

    int updateByExampleSelective(@Param("record") NewsWithBLOBs record, @Param("example") NewsExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsWithBLOBs record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);
}