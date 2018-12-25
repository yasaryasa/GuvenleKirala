package com.yaser.service.product_type_service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for responseApiRegularPaymentProducts complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseApiRegularPaymentProducts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.regularpayment.api.cca.hmn.ykb.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="ccaRegularPaymenProductstDTO" type="{http://intf.service.regularpayment.api.cca.hmn.ykb.com/}ccaRegularPaymentProductsDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseApiRegularPaymentProducts", propOrder = { "ccaRegularPaymenProductstDTO" })
public class ResponseApiRegularPaymentProducts extends BaseResponse {
    @XmlElement(nillable = true)
    protected List<CcaRegularPaymentProductsDTO> ccaRegularPaymenProductstDTO;

    /**
     * Gets the value of the ccaRegularPaymenProductstDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the ccaRegularPaymenProductstDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCcaRegularPaymenProductstDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CcaRegularPaymentProductsDTO }
     * 
     * 
     */
    public List<CcaRegularPaymentProductsDTO> getCcaRegularPaymenProductstDTO() {
        if (ccaRegularPaymenProductstDTO == null) {
            ccaRegularPaymenProductstDTO = new ArrayList<CcaRegularPaymentProductsDTO>();
        }
        return this.ccaRegularPaymenProductstDTO;
    }
}
