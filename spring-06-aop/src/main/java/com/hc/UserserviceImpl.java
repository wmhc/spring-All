package com.hc;

import com.hc.Service.UserService;

public class UserserviceImpl implements UserService {
    public void useradd() {
        System.out.println("增加一个用户");
    }

    public void userdelete() {
        System.out.println("删除一个用户");
    }

    public void userupdate() {
        System.out.println("更新一个用户");
    }

    public void userselect() {
        System.out.println("查找一个用户");
    }
}
