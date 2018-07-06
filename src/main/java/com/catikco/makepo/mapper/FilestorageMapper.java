package com.catikco.makepo.mapper;

import com.catikco.makepo.entity.FileStorage;
import com.catikco.makepo.entity.FileStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FileStorageMapper {
    int countByExample(FileStorageExample example);

    int deleteByExample(FileStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileStorage record);

    int insertSelective(FileStorage record);

    List<FileStorage> selectByExample(FileStorageExample example);

    FileStorage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileStorage record, @Param("example") FileStorageExample example);

    int updateByExample(@Param("record") FileStorage record, @Param("example") FileStorageExample example);

    int updateByPrimaryKeySelective(FileStorage record);

    int updateByPrimaryKey(FileStorage record);
}