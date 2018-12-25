package com.yaser.dto;

import java.io.Serializable;

public class ProductTypesDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String creditClass;
    private String creditType;
    private String productKey;
    private String productName;

    public String getCreditClass() {
        return creditClass;
    }

    public void setCreditClass(String creditClass) {
        this.creditClass = creditClass;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
