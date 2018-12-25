
package com.yaser.service.limit_inquiry_service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccaDisbursedOverdraftOzolLimitDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccaDisbursedOverdraftOzolLimitDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}coreDTO">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ozol" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ozolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usedOzol" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ykbData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccaDisbursedOverdraftOzolLimitDTO", propOrder = {
    "accountId",
    "accountNumber",
    "currency",
    "customerNumber",
    "ozol",
    "ozolType",
    "smsCode",
    "tcId",
    "usedOzol",
    "ykbData"
})
public class CcaDisbursedOverdraftOzolLimitDTO
    extends CoreDTO
{

    protected Long accountId;
    protected String accountNumber;
    protected String currency;
    protected Integer customerNumber;
    protected BigDecimal ozol;
    protected String ozolType;
    protected String smsCode;
    protected Long tcId;
    protected BigDecimal usedOzol;
    protected String ykbData;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerNumber(Integer value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the ozol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOzol() {
        return ozol;
    }

    /**
     * Sets the value of the ozol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOzol(BigDecimal value) {
        this.ozol = value;
    }

    /**
     * Gets the value of the ozolType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOzolType() {
        return ozolType;
    }

    /**
     * Sets the value of the ozolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOzolType(String value) {
        this.ozolType = value;
    }

    /**
     * Gets the value of the smsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsCode() {
        return smsCode;
    }

    /**
     * Sets the value of the smsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsCode(String value) {
        this.smsCode = value;
    }

    /**
     * Gets the value of the tcId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTcId() {
        return tcId;
    }

    /**
     * Sets the value of the tcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTcId(Long value) {
        this.tcId = value;
    }

    /**
     * Gets the value of the usedOzol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedOzol() {
        return usedOzol;
    }

    /**
     * Sets the value of the usedOzol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedOzol(BigDecimal value) {
        this.usedOzol = value;
    }

    /**
     * Gets the value of the ykbData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYkbData() {
        return ykbData;
    }

    /**
     * Sets the value of the ykbData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYkbData(String value) {
        this.ykbData = value;
    }

}
