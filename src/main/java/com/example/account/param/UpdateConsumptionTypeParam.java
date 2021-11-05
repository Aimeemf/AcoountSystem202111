package com.example.account.param;

import lombok.Data;

/**
 * @author:ZhangYu
 * @date:2021/02/15 21:44
 */
@Data
public class UpdateConsumptionTypeParam extends ConsumptionTypeParam{

    //标签id
    private Integer id;

    //新名字
    private String newName;

}
