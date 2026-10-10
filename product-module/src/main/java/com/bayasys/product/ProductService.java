
package com.bayasys.product;

import com.bayasys.common.SharedUtil;

public class ProductService {

    public String getProductMessage() {
        return "Product module is working. Application: "
                + SharedUtil.getApplicationName();
    }
}

