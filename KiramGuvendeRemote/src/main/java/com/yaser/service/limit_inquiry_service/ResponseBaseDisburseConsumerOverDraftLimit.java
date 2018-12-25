
package com.yaser.service.limit_inquiry_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseBaseDisburseConsumerOverDraftLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseBaseDisburseConsumerOverDraftLimit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseBaseDisburseConsumerOverDraftLimit", propOrder = {
    "accountNumber"
})
@XmlSeeAlso({
    ResponseApiPaymentSystemDisburseOverDraftLimit.class
})
public class ResponseBaseDisburseConsumerOverDraftLimit
    extends BaseResponse
{

    protected String accountNumber;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

}
