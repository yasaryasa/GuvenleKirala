
package com.yaser.service.regular_payment_insert;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CcaApiWebRegularPaymentInsertServiceService", targetNamespace = "http://service.web.api.cca.hmn.ykb.com/", wsdlLocation = "file:/D:/dev/projects/github/GuvenleKirala/KiramGuvendeRemote/src/main/resources/wsdl/WebRegularPaymentInsertService.wsdl")
public class CcaApiWebRegularPaymentInsertServiceService
    extends Service
{

    private final static URL CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_EXCEPTION;
    private final static QName CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_QNAME = new QName("http://service.web.api.cca.hmn.ykb.com/", "CcaApiWebRegularPaymentInsertServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/dev/projects/github/GuvenleKirala/KiramGuvendeRemote/src/main/resources/wsdl/WebRegularPaymentInsertService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_WSDL_LOCATION = url;
        CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_EXCEPTION = e;
    }

    public CcaApiWebRegularPaymentInsertServiceService() {
        super(__getWsdlLocation(), CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_QNAME);
    }

    public CcaApiWebRegularPaymentInsertServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_QNAME, features);
    }

    public CcaApiWebRegularPaymentInsertServiceService(URL wsdlLocation) {
        super(wsdlLocation, CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_QNAME);
    }

    public CcaApiWebRegularPaymentInsertServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_QNAME, features);
    }

    public CcaApiWebRegularPaymentInsertServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CcaApiWebRegularPaymentInsertServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICcaApiWebRegularPaymentInsertService
     */
    @WebEndpoint(name = "CcaApiWebRegularPaymentInsertServicePort")
    public ICcaApiWebRegularPaymentInsertService getCcaApiWebRegularPaymentInsertServicePort() {
        return super.getPort(new QName("http://service.web.api.cca.hmn.ykb.com/", "CcaApiWebRegularPaymentInsertServicePort"), ICcaApiWebRegularPaymentInsertService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICcaApiWebRegularPaymentInsertService
     */
    @WebEndpoint(name = "CcaApiWebRegularPaymentInsertServicePort")
    public ICcaApiWebRegularPaymentInsertService getCcaApiWebRegularPaymentInsertServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.web.api.cca.hmn.ykb.com/", "CcaApiWebRegularPaymentInsertServicePort"), ICcaApiWebRegularPaymentInsertService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_EXCEPTION!= null) {
            throw CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_EXCEPTION;
        }
        return CCAAPIWEBREGULARPAYMENTINSERTSERVICESERVICE_WSDL_LOCATION;
    }

}