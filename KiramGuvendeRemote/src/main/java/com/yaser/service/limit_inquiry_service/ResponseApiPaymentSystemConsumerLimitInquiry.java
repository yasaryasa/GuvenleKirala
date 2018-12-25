
package com.yaser.service.limit_inquiry_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseApiPaymentSystemConsumerLimitInquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseApiPaymentSystemConsumerLimitInquiry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="ccaPaymentSystemProductLimitDTOs" type="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}ccaPaymentSystemProductLimitDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseApiPaymentSystemConsumerLimitInquiry", propOrder = {
    "ccaPaymentSystemProductLimitDTOs"
})
public class ResponseApiPaymentSystemConsumerLimitInquiry
    extends BaseResponse
{

    @XmlElement(nillable = true)
    protected List<CcaPaymentSystemProductLimitDTO> ccaPaymentSystemProductLimitDTOs;

    /**
     * Gets the value of the ccaPaymentSystemProductLimitDTOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccaPaymentSystemProductLimitDTOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcaPaymentSystemProductLimitDTOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CcaPaymentSystemProductLimitDTO }
     * 
     * 
     */
    public List<CcaPaymentSystemProductLimitDTO> getCcaPaymentSystemProductLimitDTOs() {
        if (ccaPaymentSystemProductLimitDTOs == null) {
            ccaPaymentSystemProductLimitDTOs = new ArrayList<CcaPaymentSystemProductLimitDTO>();
        }
        return this.ccaPaymentSystemProductLimitDTOs;
    }

}
