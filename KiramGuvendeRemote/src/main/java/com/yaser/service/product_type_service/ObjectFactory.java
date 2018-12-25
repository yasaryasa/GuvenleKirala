package com.yaser.service.product_type_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.yaser.service package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
    private final static QName _HmnServiceException_QNAME = new QName("http://intf.service.regularpayment.api.cca.hmn.ykb.com/", "HmnServiceException");
    private final static QName _DatatypeConfigurationException_QNAME = new QName("http://intf.service.regularpayment.api.cca.hmn.ykb.com/", "DatatypeConfigurationException");
    private final static QName _GetRegularPaymentProductsResponse_QNAME = new QName("http://intf.service.regularpayment.api.cca.hmn.ykb.com/", "getRegularPaymentProductsResponse");
    private final static QName _GetRegularPaymentProducts_QNAME = new QName("http://intf.service.regularpayment.api.cca.hmn.ykb.com/", "getRegularPaymentProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.yaser.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.yaser.service.product_type_service.BaseResponse.Parameters }
     * 
     */
    public BaseResponse.Parameters createBaseResponseParameters() {
        return new BaseResponse.Parameters();
    }

    /**
     * Create an instance of {@link GetRegularPaymentProductsResponse }
     * 
     */
    public GetRegularPaymentProductsResponse createGetRegularPaymentProductsResponse() {
        return new GetRegularPaymentProductsResponse();
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
     * Create an instance of {@link GetRegularPaymentProducts }
     * 
     */
    public GetRegularPaymentProducts createGetRegularPaymentProducts() {
        return new GetRegularPaymentProducts();
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link ResponseApiRegularPaymentProducts }
     * 
     */
    public ResponseApiRegularPaymentProducts createResponseApiRegularPaymentProducts() {
        return new ResponseApiRegularPaymentProducts();
    }

    /**
     * Create an instance of {@link RequestApiRegularPaymentProducts }
     * 
     */
    public RequestApiRegularPaymentProducts createRequestApiRegularPaymentProducts() {
        return new RequestApiRegularPaymentProducts();
    }

    /**
     * Create an instance of {@link CcaRegularPaymentProductsDTO }
     * 
     */
    public CcaRegularPaymentProductsDTO createCcaRegularPaymentProductsDTO() {
        return new CcaRegularPaymentProductsDTO();
    }

    /**
     * Create an instance of {@link CoreDTO }
     * 
     */
    public CoreDTO createCoreDTO() {
        return new CoreDTO();
    }

    /**
     * Create an instance of {@link com.yaser.service.product_type_service.BaseResponse.Parameters.Entry }
     * 
     */
    public com.yaser.service.product_type_service.BaseResponse.Parameters.Entry createBaseResponseParametersEntry() {
        return new com.yaser.service.product_type_service.BaseResponse.Parameters.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HmnServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.service.regularpayment.api.cca.hmn.ykb.com/", name = "HmnServiceException")
    public JAXBElement<HmnServiceException> createHmnServiceException(HmnServiceException value) {
        return new JAXBElement<HmnServiceException>(_HmnServiceException_QNAME, HmnServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatatypeConfigurationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.service.regularpayment.api.cca.hmn.ykb.com/", name = "DatatypeConfigurationException")
    public JAXBElement<DatatypeConfigurationException> createDatatypeConfigurationException(DatatypeConfigurationException value) {
        return new JAXBElement<DatatypeConfigurationException>(_DatatypeConfigurationException_QNAME, DatatypeConfigurationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegularPaymentProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.service.regularpayment.api.cca.hmn.ykb.com/", name = "getRegularPaymentProductsResponse")
    public JAXBElement<GetRegularPaymentProductsResponse> createGetRegularPaymentProductsResponse(GetRegularPaymentProductsResponse value) {
        return new JAXBElement<GetRegularPaymentProductsResponse>(_GetRegularPaymentProductsResponse_QNAME, GetRegularPaymentProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegularPaymentProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.service.regularpayment.api.cca.hmn.ykb.com/", name = "getRegularPaymentProducts")
    public JAXBElement<GetRegularPaymentProducts> createGetRegularPaymentProducts(GetRegularPaymentProducts value) {
        return new JAXBElement<GetRegularPaymentProducts>(_GetRegularPaymentProducts_QNAME, GetRegularPaymentProducts.class, null, value);
    }
}
