package com.example.account.mapper;

import com.example.account.entity.ConsumptionType;
import com.example.account.entity.ConsumptionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumptionTypeMapper {
    int countByExample(ConsumptionTypeExample example);

    int deleteByExample(ConsumptionTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConsumptionType record);

    int insertSelective(ConsumptionType record);

    //按名字查
    ConsumptionType selectByName(String name);
    List<ConsumptionType> selectByExample(ConsumptionTypeExample example);

    ConsumptionType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConsumptionType record, @Param("example") ConsumptionTypeExample example);

    int updateByExample(@Param("record") ConsumptionType record, @Param("example") ConsumptionTypeExample example);

    int updateByPrimaryKeySelective(ConsumptionType record);

    int updateByPrimaryKey(ConsumptionType record);
}