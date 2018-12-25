
package com.yaser.service.limit_inquiry_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestApiPaymentSystemDisburseOverDraftLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestApiPaymentSystemDisburseOverDraftLimit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}requestBaseDisburseOverDraftConsumerLimit">
 *       &lt;sequence>
 *         &lt;element name="ccaDisbursedOverdraftOzolLimitDTO" type="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}ccaDisbursedOverdraftOzolLimitDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestApiPaymentSystemDisburseOverDraftLimit", propOrder = {
    "ccaDisbursedOverdraftOzolLimitDTO"
})
public class RequestApiPaymentSystemDisburseOverDraftLimit
    extends RequestBaseDisburseOverDraftConsumerLimit
{

    protected CcaDisbursedOverdraftOzolLimitDTO ccaDisbursedOverdraftOzolLimitDTO;

    /**
     * Gets the value of the ccaDisbursedOverdraftOzolLimitDTO property.
     * 
     * @return
     *     possible object is
     *     {@link CcaDisbursedOverdraftOzolLimitDTO }
     *     
     */
    public CcaDisbursedOverdraftOzolLimitDTO getCcaDisbursedOverdraftOzolLimitDTO() {
        return ccaDisbursedOverdraftOzolLimitDTO;
    }

    /**
     * Sets the value of the ccaDisbursedOverdraftOzolLimitDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcaDisbursedOverdraftOzolLimitDTO }
     *     
     */
    public void setCcaDisbursedOverdraftOzolLimitDTO(CcaDisbursedOverdraftOzolLimitDTO value) {
        this.ccaDisbursedOverdraftOzolLimitDTO = value;
    }

}
