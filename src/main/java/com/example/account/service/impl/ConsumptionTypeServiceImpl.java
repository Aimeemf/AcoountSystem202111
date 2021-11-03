package com.example.account.service.impl;

import com.example.account.entity.ConsumptionType;
import com.example.account.enums.ReturnCode;
import com.example.account.mapper.ConsumptionTypeMapper;
import com.example.account.param.ConsumptionTypeParam;
import com.example.account.param.UpdateConsumptionTypeParam;
import com.example.account.response.Result;
import com.example.account.service.ConsumptionTypeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:ZhangYu
 * @date:2021/02/15 14:12
 */
@Service
public class ConsumptionTypeServiceImpl implements ConsumptionTypeService {

    @Autowired
    private ConsumptionTypeMapper consumptionTypeMapper;

    @Override
    public Result queryConsumptionType() {

            List<ConsumptionType> list = consumptionTypeMapper.selectByExample(null);
            return Result.success(list);
    }


    @Override
    public Result addConsumptionType(ConsumptionTypeParam param) {

        ConsumptionType type = consumptionTypeMapper.selectByName(param.getName());
        ConsumptionType record = new ConsumptionType();

        if (null != type){
            return Result.failure(ReturnCode.ADD_CONSUMTYPE_FAIL);
        }

        record.setName(param.getName());
        record.setHouseId(param.getHouseId());
        record.setIsCustom(1);

        try {
            consumptionTypeMapper.insertSelective(record);
            return Result.success(record);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(ReturnCode.ADD_CONSUMTYPE_FAIL);
        }
    }

    @Override
    public Result updateConsumptionType(UpdateConsumptionTypeParam param) {

        if(param.getIsCustom() == 0){
            return Result.failure(ReturnCode.UPDATE_CONSUMTYPE_FAIL);
        }

        ConsumptionType record = consumptionTypeMapper.selectByName(param.getOldName());
        record.setName(param.getNewName());
        consumptionTypeMapper.updateByPrimaryKeySelective(record);

        return Result.success(record);
    }

    @Override
    public Result deleteConsumptionType(ConsumptionTypeParam param) {

        try {
            consumptionTypeMapper.deleteByPrimaryKey(param.getId());
            return Result.success();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(ReturnCode.DELETE_CONSUMTYPE_FAIL);
        }

    }
}
