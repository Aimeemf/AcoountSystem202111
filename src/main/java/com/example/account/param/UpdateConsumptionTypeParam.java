package com.example.account.param;

import lombok.Data;

/**
 * @author:ZhangYu
 * @date:2021/02/15 21:44
 */
@Data
public class UpdateConsumptionTypeParam extends ConsumptionTypeParam{

    //旧名字
    private String oldName;

    //新名字
    private String newName;

}
