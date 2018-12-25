package com.yaser.service.product_type_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getRegularPaymentProducts complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRegularPaymentProducts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://intf.service.regularpayment.api.cca.hmn.ykb.com/}requestApiRegularPaymentProducts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRegularPaymentProducts", propOrder = { "arg0" })
public class GetRegularPaymentProducts {
    protected RequestApiRegularPaymentProducts arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return possible object is {@link RequestApiRegularPaymentProducts }
     * 
     */
    public RequestApiRegularPaymentProducts getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value allowed object is {@link RequestApiRegularPaymentProducts }
     * 
     */
    public void setArg0(RequestApiRegularPaymentProducts value) {
        this.arg0 = value;
    }
}
