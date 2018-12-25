
package com.yaser.service.regular_payment_insert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseApiWebRegularPaymentApplicationInsert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseApiWebRegularPaymentApplicationInsert">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.web.api.cca.hmn.ykb.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseApiWebRegularPaymentApplicationInsert", propOrder = {
    "errorMessage",
    "formno"
})
public class ResponseApiWebRegularPaymentApplicationInsert
    extends BaseResponse
{

    protected String errorMessage;
    protected String formno;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the formno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormno() {
        return formno;
    }

    /**
     * Sets the value of the formno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormno(String value) {
        this.formno = value;
    }

}
