package com.yaser.service.product_type_service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b14002 Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CcaApiRegularPaymentProductsServiceService", targetNamespace = "http://service.regularpayment.api.cca.hmn.ykb.com/", wsdlLocation = "file:/D:/YKBIdeWorkspace/DenemeRemote/src/main/resources/wsdl/ProductType.wsdl")
public class CcaApiRegularPaymentProductsServiceService extends Service {
    private final static URL CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_EXCEPTION;
    private final static QName CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_QNAME = new QName("http://service.regularpayment.api.cca.hmn.ykb.com/", "CcaApiRegularPaymentProductsServiceService");
    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/YKBIdeWorkspace/DenemeRemote/src/main/resources/wsdl/ProductType.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_WSDL_LOCATION = url;
        CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_EXCEPTION = e;
    }

    public CcaApiRegularPaymentProductsServiceService() {
        super(__getWsdlLocation(), CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_QNAME);
    }

    public CcaApiRegularPaymentProductsServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_QNAME, features);
    }

    public CcaApiRegularPaymentProductsServiceService(URL wsdlLocation) {
        super(wsdlLocation, CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_QNAME);
    }

    public CcaApiRegularPaymentProductsServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_QNAME, features);
    }

    public CcaApiRegularPaymentProductsServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CcaApiRegularPaymentProductsServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return returns ICcaApiRegularPaymentProductsService
     */
    @WebEndpoint(name = "CcaApiRegularPaymentProductsServicePort")
    public ICcaApiRegularPaymentProductsService getCcaApiRegularPaymentProductsServicePort() {
        return super.getPort(new QName("http://service.regularpayment.api.cca.hmn.ykb.com/", "CcaApiRegularPaymentProductsServicePort"), ICcaApiRegularPaymentProductsService.class);
    }

    /**
     * 
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features
     *            not in the <code>features</code> parameter will have their default values.
     * @return returns ICcaApiRegularPaymentProductsService
     */
    @WebEndpoint(name = "CcaApiRegularPaymentProductsServicePort")
    public ICcaApiRegularPaymentProductsService getCcaApiRegularPaymentProductsServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.regularpayment.api.cca.hmn.ykb.com/", "CcaApiRegularPaymentProductsServicePort"), ICcaApiRegularPaymentProductsService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_EXCEPTION != null) {
            throw CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_EXCEPTION;
        }
        return CCAAPIREGULARPAYMENTPRODUCTSSERVICESERVICE_WSDL_LOCATION;
    }
}