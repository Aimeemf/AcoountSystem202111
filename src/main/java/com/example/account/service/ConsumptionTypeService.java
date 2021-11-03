package com.example.account.service;

import com.example.account.param.ConsumptionTypeParam;
import com.example.account.param.UpdateConsumptionTypeParam;
import com.example.account.response.Result;



/**
 * @author:ZhangYu
 * @date:2021/02/15 13:25
 */
public interface ConsumptionTypeService {

    //查询所有消费类型
    Result queryConsumptionType();

    //增加消费类型
    Result addConsumptionType(ConsumptionTypeParam param);

    //修改消费类型
    Result updateConsumptionType(UpdateConsumptionTypeParam param);

    //删除消费类型
    Result deleteConsumptionType(ConsumptionTypeParam param);

}
