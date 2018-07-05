package com.catikco.makepo.mapper;

import com.catikco.makepo.entity.Filestorage;
import com.catikco.makepo.entity.FilestorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilestorageMapper {
    int countByExample(FilestorageExample example);

    int deleteByExample(FilestorageExample example);

    int insert(Filestorage record);

    int insertSelective(Filestorage record);

    List<Filestorage> selectByExample(FilestorageExample example);

    int updateByExampleSelective(@Param("record") Filestorage record, @Param("example") FilestorageExample example);

    int updateByExample(@Param("record") Filestorage record, @Param("example") FilestorageExample example);
}