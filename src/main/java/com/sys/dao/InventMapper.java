package com.sys.dao;

import java.util.List;

import com.sys.dto.InventSug;
import com.sys.entity.Invent;
import com.sys.entity.InventExample;
import org.apache.ibatis.annotations.*;

@Mapper
public interface InventMapper {
    int countByExample(InventExample example);

    int deleteByExample(InventExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Invent record);

    int insertSelective(Invent record);

    List<Invent> selectByExample(InventExample example);

    Invent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Invent record, @Param("example") InventExample example);

    int updateByExample(@Param("record") Invent record, @Param("example") InventExample example);

    int updateByPrimaryKeySelective(Invent record);

    int updateByPrimaryKey(Invent record);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT into invent_sug(invent_sug, status_cd, invent_id, create_date, user_id)"
            + "VALUES (#{invent_sug}, #{status_cd}, #{invent_id}, NOW(), #{user_id})")
    int insertInventSug(InventSug inventSug);

    @Select("select * from invent_sug where invent_id = #{invent_id}")
    List<InventSug> inventSugListByInventId(InventSug inventSug);
}