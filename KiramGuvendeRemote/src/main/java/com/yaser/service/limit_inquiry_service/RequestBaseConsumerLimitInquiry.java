
package com.yaser.service.limit_inquiry_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestBaseConsumerLimitInquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestBaseConsumerLimitInquiry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}baseRequest">
 *       &lt;sequence>
 *         &lt;element name="inquiryChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestBaseConsumerLimitInquiry", propOrder = {
    "inquiryChannel",
    "productType",
    "tcid",
    "userId"
})
@XmlSeeAlso({
    RequestApiPaymentSystemConsumerLimitInquiry.class
})
public class RequestBaseConsumerLimitInquiry
    extends BaseRequest
{

    protected String inquiryChannel;
    protected String productType;
    protected Long tcid;
    protected String userId;

    /**
     * Gets the value of the inquiryChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryChannel() {
        return inquiryChannel;
    }

    /**
     * Sets the value of the inquiryChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryChannel(String value) {
        this.inquiryChannel = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the tcid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTcid() {
        return tcid;
    }

    /**
     * Sets the value of the tcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTcid(Long value) {
        this.tcid = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
