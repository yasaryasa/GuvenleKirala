
package com.yaser.service.limit_inquiry_service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ccaPaymentSystemProductLimitDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccaPaymentSystemProductLimitDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.paymentsystem.api.cca.hmn.ykb.com/}coreDTO">
 *       &lt;sequence>
 *         &lt;element name="applicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCertainlyRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maturity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="schoolCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studenTcId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccaPaymentSystemProductLimitDTO", propOrder = {
    "applicationStatus",
    "approveDate",
    "custName",
    "custSurname",
    "isCertainlyRejected",
    "maturity",
    "productId",
    "productLimit",
    "productType",
    "requestedLimit",
    "schoolCode",
    "studenTcId"
})
public class CcaPaymentSystemProductLimitDTO
    extends CoreDTO
{

    protected String applicationStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approveDate;
    protected String custName;
    protected String custSurname;
    protected Boolean isCertainlyRejected;
    protected BigDecimal maturity;
    protected Long productId;
    protected BigDecimal productLimit;
    protected String productType;
    protected BigDecimal requestedLimit;
    protected String schoolCode;
    protected Long studenTcId;

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationStatus(String value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the approveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveDate() {
        return approveDate;
    }

    /**
     * Sets the value of the approveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveDate(XMLGregorianCalendar value) {
        this.approveDate = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the custSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSurname() {
        return custSurname;
    }

    /**
     * Sets the value of the custSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSurname(String value) {
        this.custSurname = value;
    }

    /**
     * Gets the value of the isCertainlyRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCertainlyRejected() {
        return isCertainlyRejected;
    }

    /**
     * Sets the value of the isCertainlyRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCertainlyRejected(Boolean value) {
        this.isCertainlyRejected = value;
    }

    /**
     * Gets the value of the maturity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaturity() {
        return maturity;
    }

    /**
     * Sets the value of the maturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaturity(BigDecimal value) {
        this.maturity = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductLimit() {
        return productLimit;
    }

    /**
     * Sets the value of the productLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductLimit(BigDecimal value) {
        this.productLimit = value;
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
     * Gets the value of the requestedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedLimit() {
        return requestedLimit;
    }

    /**
     * Sets the value of the requestedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedLimit(BigDecimal value) {
        this.requestedLimit = value;
    }

    /**
     * Gets the value of the schoolCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCode() {
        return schoolCode;
    }

    /**
     * Sets the value of the schoolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCode(String value) {
        this.schoolCode = value;
    }

    /**
     * Gets the value of the studenTcId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStudenTcId() {
        return studenTcId;
    }

    /**
     * Sets the value of the studenTcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStudenTcId(Long value) {
        this.studenTcId = value;
    }

}
