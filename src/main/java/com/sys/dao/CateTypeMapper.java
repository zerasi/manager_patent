package com.sys.dao;

import java.util.List;

import com.sys.entity.CateType;
import com.sys.entity.CateTypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CateTypeMapper {
    int countByExample(CateTypeExample example);

    int deleteByExample(CateTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CateType record);

    int insertSelective(CateType record);

    List<CateType> selectByExample(CateTypeExample example);

    CateType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CateType record, @Param("example") CateTypeExample example);

    int updateByExample(@Param("record") CateType record, @Param("example") CateTypeExample example);

    int updateByPrimaryKeySelective(CateType record);

    int updateByPrimaryKey(CateType record);
}