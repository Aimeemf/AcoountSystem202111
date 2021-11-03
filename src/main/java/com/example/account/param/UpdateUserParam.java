package com.example.account.param;

import lombok.Data;

/**
 * @author:ZhangYu
 * @date:2021/02/14 14:50
 */
@Data
public class UpdateUserParam extends BaseUserParam{

    //旧密码
    private String oldPassword;

    //新密码
    private String newPassword;
}
