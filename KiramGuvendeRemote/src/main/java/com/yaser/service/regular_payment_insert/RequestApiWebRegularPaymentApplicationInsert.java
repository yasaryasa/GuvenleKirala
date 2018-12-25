
package com.yaser.service.regular_payment_insert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestApiWebRegularPaymentApplicationInsert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestApiWebRegularPaymentApplicationInsert">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.web.api.cca.hmn.ykb.com/}baseRequest">
 *       &lt;sequence>
 *         &lt;element name="webRegularPaymentInsertDTO" type="{http://intf.service.web.api.cca.hmn.ykb.com/}ccaWebRegularPaymentInsertDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestApiWebRegularPaymentApplicationInsert", propOrder = {
    "webRegularPaymentInsertDTO"
})
public class RequestApiWebRegularPaymentApplicationInsert
    extends BaseRequest
{

    protected CcaWebRegularPaymentInsertDTO webRegularPaymentInsertDTO;

    /**
     * Gets the value of the webRegularPaymentInsertDTO property.
     * 
     * @return
     *     possible object is
     *     {@link CcaWebRegularPaymentInsertDTO }
     *     
     */
    public CcaWebRegularPaymentInsertDTO getWebRegularPaymentInsertDTO() {
        return webRegularPaymentInsertDTO;
    }

    /**
     * Sets the value of the webRegularPaymentInsertDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcaWebRegularPaymentInsertDTO }
     *     
     */
    public void setWebRegularPaymentInsertDTO(CcaWebRegularPaymentInsertDTO value) {
        this.webRegularPaymentInsertDTO = value;
    }

}
