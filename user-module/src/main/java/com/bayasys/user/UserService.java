
package com.bayasys.user;

import com.bayasys.common.SharedUtil;

public class UserService {

    public String getUserMessage() {
        return "User module is working. Application: "
                + SharedUtil.getApplicationName();
    }
}

