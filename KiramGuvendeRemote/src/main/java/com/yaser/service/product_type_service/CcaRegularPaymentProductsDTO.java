package com.yaser.service.product_type_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ccaRegularPaymentProductsDTO complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccaRegularPaymentProductsDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.regularpayment.api.cca.hmn.ykb.com/}coreDTO">
 *       &lt;sequence>
 *         &lt;element name="creditClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="luc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccaRegularPaymentProductsDTO", propOrder = { "creditClass", "creditType", "luc", "oid", "productKey", "productName" })
public class CcaRegularPaymentProductsDTO extends CoreDTO {
    protected String creditClass;
    protected String creditType;
    protected Long luc;
    protected Long oid;
    protected String productKey;
    protected String productName;

    /**
     * Gets the value of the creditClass property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreditClass() {
        return creditClass;
    }

    /**
     * Sets the value of the creditClass property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCreditClass(String value) {
        this.creditClass = value;
    }

    /**
     * Gets the value of the creditType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreditType() {
        return creditType;
    }

    /**
     * Sets the value of the creditType property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCreditType(String value) {
        this.creditType = value;
    }

    /**
     * Gets the value of the luc property.
     * 
     * @return possible object is {@link Long }
     * 
     */
    public Long getLuc() {
        return luc;
    }

    /**
     * Sets the value of the luc property.
     * 
     * @param value allowed object is {@link Long }
     * 
     */
    public void setLuc(Long value) {
        this.luc = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return possible object is {@link Long }
     * 
     */
    public Long getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value allowed object is {@link Long }
     * 
     */
    public void setOid(Long value) {
        this.oid = value;
    }

    /**
     * Gets the value of the productKey property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * Sets the value of the productKey property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setProductKey(String value) {
        this.productKey = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setProductName(String value) {
        this.productName = value;
    }
}
