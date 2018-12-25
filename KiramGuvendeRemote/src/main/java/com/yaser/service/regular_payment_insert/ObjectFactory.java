
package com.yaser.service.regular_payment_insert;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yaser.service.regular_payment_insert package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DatatypeConfigurationException_QNAME = new QName("http://intf.service.web.api.cca.hmn.ykb.com/", "DatatypeConfigurationException");
    private final static QName _HmnServiceException_QNAME = new QName("http://intf.service.web.api.cca.hmn.ykb.com/", "HmnServiceException");
    private final static QName _NwbRegularPaymentInsert_QNAME = new QName("http://intf.service.web.api.cca.hmn.ykb.com/", "nwbRegularPaymentInsert");
    private final static QName _NwbRegularPaymentInsertResponse_QNAME = new QName("http://intf.service.web.api.cca.hmn.ykb.com/", "nwbRegularPaymentInsertResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yaser.service.regular_payment_insert
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.yaser.service.regular_payment_insert.BaseResponse.Parameters }
     * 
     */
    public com.yaser.service.regular_payment_insert.BaseResponse.Parameters createBaseResponseParameters() {
        return new com.yaser.service.regular_payment_insert.BaseResponse.Parameters();
    }

    /**
     * Create an instance of {@link DatatypeConfigurationException }
     * 
     */
    public DatatypeConfigurationException createDatatypeConfigurationException() {
        return new DatatypeConfigurationException();
    }

    /**
     * Create an instance of {@link HmnServiceException }
     * 
     */
    public HmnServiceException createHmnServiceException() {
        return new HmnServiceException();
    }

    /**
     * Create an instance of {@link NwbRegularPaymentInsert }
     * 
     */
    public NwbRegularPaymentInsert createNwbRegularPaymentInsert() {
        return new NwbRegularPaymentInsert();
    }

    /**
     * Create an instance of {@link NwbRegularPaymentInsertResponse }
     * 
     */
    public NwbRegularPaymentInsertResponse createNwbRegularPaymentInsertResponse() {
        return new NwbRegularPaymentInsertResponse();
    }

    /**
     * Create an instance of {@link CcaWebRegularPaymentInsertDTO }
     * 
     */
    public CcaWebRegularPaymentInsertDTO createCcaWebRegularPaymentInsertDTO() {
        return new CcaWebRegularPaymentInsertDTO();
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link ResponseApiWebRegularPaymentApplicationInsert }
     * 
     */
    public ResponseApiWebRegularPaymentApplicationInsert createResponseApiWebRegularPaymentApplicationInsert() {
        return new ResponseApiWebRegularPaymentApplicationInsert();
    }

    /**
     * Create an instance of {@link RequestApiWebRegularPaymentApplicationInsert }
     * 
     */
    public RequestApiWebRegularPaymentApplicationInsert createRequestApiWebRegularPaymentApplicationInsert() {
        return new RequestApiWebRegularPaymentApplicationInsert();
    }

    /**
     * Create an instance of {@link CoreDTO }
     * 
     */
    public CoreDTO createCoreDTO() {
        return new CoreDTO();
    }

    /**
     * Create an instance of {@link com.yaser.service.regular_payment_insert.BaseResponse.Parameters.Entry }
     * 
     */
    public com.yaser.service.regular_payment_insert.BaseResponse.Parameters.Entry createBaseResponseParametersEntry() {
        return new com.yaser.service.regular_payment_insert.BaseResponse.Parameters.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatatypeConfigurationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.service.web.api.cca.hmn.ykb.com/", name = "DatatypeConfigurationException")
    public JAXBElement<DatatypeConfigurationException> createDatatypeConfigurationException(DatatypeConfigurationException value) {
        return new JAXBElement<DatatypeConfigurationException>(_DatatypeConfigurationException_QNAME, DatatypeConfigurationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HmnServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.service.web.api.cca.hmn.ykb.com/", name = "HmnServiceException")
    public JAXBElement<HmnServiceException> createHmnServiceException(HmnServiceException value) {
        return new JAXBElement<HmnServiceException>(_HmnServiceException_QNAME, HmnServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NwbRegularPaymentInsert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.service.web.api.cca.hmn.ykb.com/", name = "nwbRegularPaymentInsert")
    public JAXBElement<NwbRegularPaymentInsert> createNwbRegularPaymentInsert(NwbRegularPaymentInsert value) {
        return new JAXBElement<NwbRegularPaymentInsert>(_NwbRegularPaymentInsert_QNAME, NwbRegularPaymentInsert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NwbRegularPaymentInsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.service.web.api.cca.hmn.ykb.com/", name = "nwbRegularPaymentInsertResponse")
    public JAXBElement<NwbRegularPaymentInsertResponse> createNwbRegularPaymentInsertResponse(NwbRegularPaymentInsertResponse value) {
        return new JAXBElement<NwbRegularPaymentInsertResponse>(_NwbRegularPaymentInsertResponse_QNAME, NwbRegularPaymentInsertResponse.class, null, value);
    }

}
