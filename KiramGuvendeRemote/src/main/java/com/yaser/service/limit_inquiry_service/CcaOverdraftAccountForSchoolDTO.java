
package com.yaser.service.limit_inquiry_service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccaOverdraftAccountForSchoolDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccaOverdraftAccountForSchoolDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}coreDTO">
 *       &lt;sequence>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="castmBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="castmCType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="castmClientNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="castmOverdraft" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="limitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tlProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccaOverdraftAccountForSchoolDTO", propOrder = {
    "accountName",
    "accountNo",
    "castmBranch",
    "castmCType",
    "castmClientNo",
    "castmOverdraft",
    "currencyCode",
    "customerNumber",
    "limitType",
    "smsCode",
    "tlProcess"
})
public class CcaOverdraftAccountForSchoolDTO
    extends CoreDTO
{

    protected String accountName;
    protected String accountNo;
    protected String castmBranch;
    protected String castmCType;
    protected Integer castmClientNo;
    protected BigDecimal castmOverdraft;
    protected String currencyCode;
    protected Integer customerNumber;
    protected String limitType;
    protected String smsCode;
    protected String tlProcess;

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
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
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
     * Gets the value of the tlProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlProcess() {
        return tlProcess;
    }

    /**
     * Sets the value of the tlProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlProcess(String value) {
        this.tlProcess = value;
    }

}
