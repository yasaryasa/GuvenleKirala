
package com.yaser.service.limit_inquiry_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consumerLimitInquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consumerLimitInquiry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}requestApiPaymentSystemConsumerLimitInquiry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consumerLimitInquiry", propOrder = {
    "arg0"
})
public class ConsumerLimitInquiry {

    protected RequestApiPaymentSystemConsumerLimitInquiry arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link RequestApiPaymentSystemConsumerLimitInquiry }
     *     
     */
    public RequestApiPaymentSystemConsumerLimitInquiry getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestApiPaymentSystemConsumerLimitInquiry }
     *     
     */
    public void setArg0(RequestApiPaymentSystemConsumerLimitInquiry value) {
        this.arg0 = value;
    }

}
