
package com.yaser.service.limit_inquiry_service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccaSchoolAccountDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccaSchoolAccountDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}coreDTO">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="castmBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="castmCType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="castmClientNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="castmOverdraft" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="castmOzolLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccaSchoolAccountDTO", propOrder = {
    "accountId",
    "accountName",
    "accountNo",
    "castmBranch",
    "castmCType",
    "castmClientNo",
    "castmOverdraft",
    "castmOzolLimit",
    "currencyCode",
    "currencyDisplay",
    "smsCode"
})
public class CcaSchoolAccountDTO
    extends CoreDTO
{

    protected Long accountId;
    protected String accountName;
    protected String accountNo;
    protected String castmBranch;
    protected String castmCType;
    protected Integer castmClientNo;
    protected BigDecimal castmOverdraft;
    protected BigDecimal castmOzolLimit;
    protected String currencyCode;
    protected String currencyDisplay;
    protected String smsCode;

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
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the castmBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCastmBranch() {
        return castmBranch;
    }

    /**
     * Sets the value of the castmBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCastmBranch(String value) {
        this.castmBranch = value;
    }

    /**
     * Gets the value of the castmCType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCastmCType() {
        return castmCType;
    }

    /**
     * Sets the value of the castmCType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCastmCType(String value) {
        this.castmCType = value;
    }

    /**
     * Gets the value of the castmClientNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCastmClientNo() {
        return castmClientNo;
    }

    /**
     * Sets the value of the castmClientNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCastmClientNo(Integer value) {
        this.castmClientNo = value;
    }

    /**
     * Gets the value of the castmOverdraft property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCastmOverdraft() {
        return castmOverdraft;
    }

    /**
     * Sets the value of the castmOverdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCastmOverdraft(BigDecimal value) {
        this.castmOverdraft = value;
    }

    /**
     * Gets the value of the castmOzolLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCastmOzolLimit() {
        return castmOzolLimit;
    }

    /**
     * Sets the value of the castmOzolLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCastmOzolLimit(BigDecimal value) {
        this.castmOzolLimit = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencyDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyDisplay() {
        return currencyDisplay;
    }

    /**
     * Sets the value of the currencyDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyDisplay(String value) {
        this.currencyDisplay = value;
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

}
