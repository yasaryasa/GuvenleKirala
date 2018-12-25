
package com.yaser.service.limit_inquiry_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseApiPaymentSystemGetOverDraftList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseApiPaymentSystemGetOverDraftList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="ccaSchoolAccountDTOs" type="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}ccaSchoolAccountDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseApiPaymentSystemGetOverDraftList", propOrder = {
    "ccaSchoolAccountDTOs"
})
public class ResponseApiPaymentSystemGetOverDraftList
    extends BaseResponse
{

    @XmlElement(nillable = true)
    protected List<CcaSchoolAccountDTO> ccaSchoolAccountDTOs;

    /**
     * Gets the value of the ccaSchoolAccountDTOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccaSchoolAccountDTOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcaSchoolAccountDTOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CcaSchoolAccountDTO }
     * 
     * 
     */
    public List<CcaSchoolAccountDTO> getCcaSchoolAccountDTOs() {
        if (ccaSchoolAccountDTOs == null) {
            ccaSchoolAccountDTOs = new ArrayList<CcaSchoolAccountDTO>();
        }
        return this.ccaSchoolAccountDTOs;
    }

}
