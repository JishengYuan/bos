
package com.example.client;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloAppService", targetNamespace = "http://ws.example.com/", wsdlLocation = "http://192.168.1.100:8080/hello?wsdl")
public class HelloAppService
    extends Service
{

    private final static URL HELLOAPPSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOAPPSERVICE_EXCEPTION;
    private final static QName HELLOAPPSERVICE_QNAME = new QName("http://ws.example.com/", "HelloAppService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.100:8080/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOAPPSERVICE_WSDL_LOCATION = url;
        HELLOAPPSERVICE_EXCEPTION = e;
    }

    public HelloAppService() {
        super(__getWsdlLocation(), HELLOAPPSERVICE_QNAME);
    }

    public HelloAppService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOAPPSERVICE_QNAME, features);
    }

    public HelloAppService(URL wsdlLocation) {
        super(wsdlLocation, HELLOAPPSERVICE_QNAME);
    }

    public HelloAppService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOAPPSERVICE_QNAME, features);
    }

    public HelloAppService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloAppService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloApp
     */
    @WebEndpoint(name = "HelloAppPort")
    public HelloApp getHelloAppPort() {
        return super.getPort(new QName("http://ws.example.com/", "HelloAppPort"), HelloApp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloApp
     */
    @WebEndpoint(name = "HelloAppPort")
    public HelloApp getHelloAppPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.example.com/", "HelloAppPort"), HelloApp.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOAPPSERVICE_EXCEPTION!= null) {
            throw HELLOAPPSERVICE_EXCEPTION;
        }
        return HELLOAPPSERVICE_WSDL_LOCATION;
    }

}
