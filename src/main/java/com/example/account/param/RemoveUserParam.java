package com.example.account.param;

import lombok.Data;

/**
 * @author:ZhangYu
 * @date:2021/02/11 17:53
 */
@Data
public class RemoveUserParam {
    //删除人id
    private Integer adminUserId;

    //被删除人的id
    private Integer removeUserId;
}
