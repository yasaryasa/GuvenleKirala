package com.yaser.service.product_type_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for requestApiRegularPaymentProducts complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestApiRegularPaymentProducts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.regularpayment.api.cca.hmn.ykb.com/}baseRequest">
 *       &lt;sequence>
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="screenCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestApiRegularPaymentProducts", propOrder = { "channelCode", "screenCode" })
public class RequestApiRegularPaymentProducts extends BaseRequest {
    protected String channelCode;
    protected String screenCode;

    /**
     * Gets the value of the channelCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the screenCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getScreenCode() {
        return screenCode;
    }

    /**
     * Sets the value of the screenCode property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setScreenCode(String value) {
        this.screenCode = value;
    }
}
