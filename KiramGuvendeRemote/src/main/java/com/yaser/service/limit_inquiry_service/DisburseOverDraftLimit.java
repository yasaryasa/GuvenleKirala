
package com.yaser.service.limit_inquiry_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disburseOverDraftLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disburseOverDraftLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}requestApiPaymentSystemDisburseOverDraftLimit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disburseOverDraftLimit", propOrder = {
    "arg0"
})
public class DisburseOverDraftLimit {

    protected RequestApiPaymentSystemDisburseOverDraftLimit arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link RequestApiPaymentSystemDisburseOverDraftLimit }
     *     
     */
    public RequestApiPaymentSystemDisburseOverDraftLimit getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestApiPaymentSystemDisburseOverDraftLimit }
     *     
     */
    public void setArg0(RequestApiPaymentSystemDisburseOverDraftLimit value) {
        this.arg0 = value;
    }

}
