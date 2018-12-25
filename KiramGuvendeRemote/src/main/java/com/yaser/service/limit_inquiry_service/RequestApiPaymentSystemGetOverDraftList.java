
package com.yaser.service.limit_inquiry_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestApiPaymentSystemGetOverDraftList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestApiPaymentSystemGetOverDraftList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}baseRequest">
 *       &lt;sequence>
 *         &lt;element name="ccaOverdraftAccountForSchoolDTO" type="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}ccaOverdraftAccountForSchoolDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestApiPaymentSystemGetOverDraftList", propOrder = {
    "ccaOverdraftAccountForSchoolDTO"
})
public class RequestApiPaymentSystemGetOverDraftList
    extends BaseRequest
{

    protected CcaOverdraftAccountForSchoolDTO ccaOverdraftAccountForSchoolDTO;

    /**
     * Gets the value of the ccaOverdraftAccountForSchoolDTO property.
     * 
     * @return
     *     possible object is
     *     {@link CcaOverdraftAccountForSchoolDTO }
     *     
     */
    public CcaOverdraftAccountForSchoolDTO getCcaOverdraftAccountForSchoolDTO() {
        return ccaOverdraftAccountForSchoolDTO;
    }

    /**
     * Sets the value of the ccaOverdraftAccountForSchoolDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcaOverdraftAccountForSchoolDTO }
     *     
     */
    public void setCcaOverdraftAccountForSchoolDTO(CcaOverdraftAccountForSchoolDTO value) {
        this.ccaOverdraftAccountForSchoolDTO = value;
    }

}
