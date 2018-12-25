
package com.yaser.service.regular_payment_insert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccaWebRegularPaymentInsertDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccaWebRegularPaymentInsertDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://intf.service.web.api.cca.hmn.ykb.com/}coreDTO">
 *       &lt;sequence>
 *         &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cellNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cellPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeCityCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="homeDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeZipCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="instructionRefNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maturity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="monthlyIncome" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcIdentityNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="workAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workCityCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPlaceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workZipCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccaWebRegularPaymentInsertDTO", propOrder = {
    "businessSector",
    "cellNo",
    "cellPrefix",
    "channelCode",
    "companyName",
    "educationStatus",
    "homeAddress",
    "homeCityCode",
    "homeDistrict",
    "homeZipCode",
    "instructionRefNo",
    "limit",
    "maturity",
    "monthlyIncome",
    "occupation",
    "productType",
    "tcIdentityNo",
    "workAddress",
    "workCityCode",
    "workDistrict",
    "workPlaceTitle",
    "workYear",
    "workZipCode"
})
public class CcaWebRegularPaymentInsertDTO
    extends CoreDTO
{

    protected Long businessSector;
    protected String cellNo;
    protected String cellPrefix;
    protected String channelCode;
    protected String companyName;
    protected String educationStatus;
    protected String homeAddress;
    protected Integer homeCityCode;
    protected String homeDistrict;
    protected Integer homeZipCode;
    protected Long instructionRefNo;
    protected Long limit;
    protected Integer maturity;
    protected Long monthlyIncome;
    protected Long occupation;
    protected String productType;
    protected Long tcIdentityNo;
    protected String workAddress;
    protected Integer workCityCode;
    protected String workDistrict;
    protected String workPlaceTitle;
    protected Integer workYear;
    protected Integer workZipCode;

    /**
     * Gets the value of the businessSector property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessSector() {
        return businessSector;
    }

    /**
     * Sets the value of the businessSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessSector(Long value) {
        this.businessSector = value;
    }

    /**
     * Gets the value of the cellNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellNo() {
        return cellNo;
    }

    /**
     * Sets the value of the cellNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellNo(String value) {
        this.cellNo = value;
    }

    /**
     * Gets the value of the cellPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPrefix() {
        return cellPrefix;
    }

    /**
     * Sets the value of the cellPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPrefix(String value) {
        this.cellPrefix = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the educationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationStatus() {
        return educationStatus;
    }

    /**
     * Sets the value of the educationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationStatus(String value) {
        this.educationStatus = value;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAddress(String value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the homeCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHomeCityCode() {
        return homeCityCode;
    }

    /**
     * Sets the value of the homeCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHomeCityCode(Integer value) {
        this.homeCityCode = value;
    }

    /**
     * Gets the value of the homeDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeDistrict() {
        return homeDistrict;
    }

    /**
     * Sets the value of the homeDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeDistrict(String value) {
        this.homeDistrict = value;
    }

    /**
     * Gets the value of the homeZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHomeZipCode() {
        return homeZipCode;
    }

    /**
     * Sets the value of the homeZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHomeZipCode(Integer value) {
        this.homeZipCode = value;
    }

    /**
     * Gets the value of the instructionRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstructionRefNo() {
        return instructionRefNo;
    }

    /**
     * Sets the value of the instructionRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstructionRefNo(Long value) {
        this.instructionRefNo = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimit(Long value) {
        this.limit = value;
    }

    /**
     * Gets the value of the maturity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaturity() {
        return maturity;
    }

    /**
     * Sets the value of the maturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaturity(Integer value) {
        this.maturity = value;
    }

    /**
     * Gets the value of the monthlyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * Sets the value of the monthlyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthlyIncome(Long value) {
        this.monthlyIncome = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOccupation(Long value) {
        this.occupation = value;
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
     * Gets the value of the tcIdentityNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTcIdentityNo() {
        return tcIdentityNo;
    }

    /**
     * Sets the value of the tcIdentityNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTcIdentityNo(Long value) {
        this.tcIdentityNo = value;
    }

    /**
     * Gets the value of the workAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkAddress() {
        return workAddress;
    }

    /**
     * Sets the value of the workAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkAddress(String value) {
        this.workAddress = value;
    }

    /**
     * Gets the value of the workCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkCityCode() {
        return workCityCode;
    }

    /**
     * Sets the value of the workCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkCityCode(Integer value) {
        this.workCityCode = value;
    }

    /**
     * Gets the value of the workDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDistrict() {
        return workDistrict;
    }

    /**
     * Sets the value of the workDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDistrict(String value) {
        this.workDistrict = value;
    }

    /**
     * Gets the value of the workPlaceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPlaceTitle() {
        return workPlaceTitle;
    }

    /**
     * Sets the value of the workPlaceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPlaceTitle(String value) {
        this.workPlaceTitle = value;
    }

    /**
     * Gets the value of the workYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkYear() {
        return workYear;
    }

    /**
     * Sets the value of the workYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkYear(Integer value) {
        this.workYear = value;
    }

    /**
     * Gets the value of the workZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkZipCode() {
        return workZipCode;
    }

    /**
     * Sets the value of the workZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkZipCode(Integer value) {
        this.workZipCode = value;
    }

}
