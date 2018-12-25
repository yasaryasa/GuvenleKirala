
package com.yaser.service.regular_payment_insert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nwbRegularPaymentInsertResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nwbRegularPaymentInsertResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://intf.service.web.api.cca.hmn.ykb.com/}responseApiWebRegularPaymentApplicationInsert" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nwbRegularPaymentInsertResponse", propOrder = {
    "_return"
})
public class NwbRegularPaymentInsertResponse {

    @XmlElement(name = "return")
    protected ResponseApiWebRegularPaymentApplicationInsert _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseApiWebRegularPaymentApplicationInsert }
     *     
     */
    public ResponseApiWebRegularPaymentApplicationInsert getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseApiWebRegularPaymentApplicationInsert }
     *     
     */
    public void setReturn(ResponseApiWebRegularPaymentApplicationInsert value) {
        this._return = value;
    }

}
