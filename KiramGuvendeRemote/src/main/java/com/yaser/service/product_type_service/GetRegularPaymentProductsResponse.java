package com.yaser.service.product_type_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getRegularPaymentProductsResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRegularPaymentProductsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://intf.service.regularpayment.api.cca.hmn.ykb.com/}responseApiRegularPaymentProducts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRegularPaymentProductsResponse", propOrder = { "_return" })
public class GetRegularPaymentProductsResponse {
    @XmlElement(name = "return")
    protected ResponseApiRegularPaymentProducts _return;

    /**
     * Gets the value of the return property.
     * 
     * @return possible object is {@link ResponseApiRegularPaymentProducts }
     * 
     */
    public ResponseApiRegularPaymentProducts getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value allowed object is {@link ResponseApiRegularPaymentProducts }
     * 
     */
    public void setReturn(ResponseApiRegularPaymentProducts value) {
        this._return = value;
    }
}
