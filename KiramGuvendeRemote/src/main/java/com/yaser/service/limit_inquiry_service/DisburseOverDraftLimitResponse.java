
package com.yaser.service.limit_inquiry_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disburseOverDraftLimitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disburseOverDraftLimitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}responseApiPaymentSystemDisburseOverDraftLimit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disburseOverDraftLimitResponse", propOrder = {
    "_return"
})
public class DisburseOverDraftLimitResponse {

    @XmlElement(name = "return")
    protected ResponseApiPaymentSystemDisburseOverDraftLimit _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseApiPaymentSystemDisburseOverDraftLimit }
     *     
     */
    public ResponseApiPaymentSystemDisburseOverDraftLimit getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseApiPaymentSystemDisburseOverDraftLimit }
     *     
     */
    public void setReturn(ResponseApiPaymentSystemDisburseOverDraftLimit value) {
        this._return = value;
    }

}
