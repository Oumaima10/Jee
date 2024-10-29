
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetAllEtudiantsResponse_QNAME = new QName("http://WS/", "getAllEtudiantsResponse");
    private final static QName _GetEtudiantsBycin_QNAME = new QName("http://WS/", "getEtudiantsBycin");
    private final static QName _GetLimitEtudiants_QNAME = new QName("http://WS/", "getLimitEtudiants");
    private final static QName _GetAllEtudiants_QNAME = new QName("http://WS/", "getAllEtudiants");
    private final static QName _GetEtudiantsBycinResponse_QNAME = new QName("http://WS/", "getEtudiantsBycinResponse");
    private final static QName _GetLimitEtudiantsResponse_QNAME = new QName("http://WS/", "getLimitEtudiantsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllEtudiantsResponse }
     * 
     */
    public GetAllEtudiantsResponse createGetAllEtudiantsResponse() {
        return new GetAllEtudiantsResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantsBycin }
     * 
     */
    public GetEtudiantsBycin createGetEtudiantsBycin() {
        return new GetEtudiantsBycin();
    }

    /**
     * Create an instance of {@link GetLimitEtudiants }
     * 
     */
    public GetLimitEtudiants createGetLimitEtudiants() {
        return new GetLimitEtudiants();
    }

    /**
     * Create an instance of {@link GetAllEtudiants }
     * 
     */
    public GetAllEtudiants createGetAllEtudiants() {
        return new GetAllEtudiants();
    }

    /**
     * Create an instance of {@link GetEtudiantsBycinResponse }
     * 
     */
    public GetEtudiantsBycinResponse createGetEtudiantsBycinResponse() {
        return new GetEtudiantsBycinResponse();
    }

    /**
     * Create an instance of {@link GetLimitEtudiantsResponse }
     * 
     */
    public GetLimitEtudiantsResponse createGetLimitEtudiantsResponse() {
        return new GetLimitEtudiantsResponse();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllEtudiantsResponse")
    public JAXBElement<GetAllEtudiantsResponse> createGetAllEtudiantsResponse(GetAllEtudiantsResponse value) {
        return new JAXBElement<GetAllEtudiantsResponse>(_GetAllEtudiantsResponse_QNAME, GetAllEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsBycin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getEtudiantsBycin")
    public JAXBElement<GetEtudiantsBycin> createGetEtudiantsBycin(GetEtudiantsBycin value) {
        return new JAXBElement<GetEtudiantsBycin>(_GetEtudiantsBycin_QNAME, GetEtudiantsBycin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLimitEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getLimitEtudiants")
    public JAXBElement<GetLimitEtudiants> createGetLimitEtudiants(GetLimitEtudiants value) {
        return new JAXBElement<GetLimitEtudiants>(_GetLimitEtudiants_QNAME, GetLimitEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllEtudiants")
    public JAXBElement<GetAllEtudiants> createGetAllEtudiants(GetAllEtudiants value) {
        return new JAXBElement<GetAllEtudiants>(_GetAllEtudiants_QNAME, GetAllEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsBycinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getEtudiantsBycinResponse")
    public JAXBElement<GetEtudiantsBycinResponse> createGetEtudiantsBycinResponse(GetEtudiantsBycinResponse value) {
        return new JAXBElement<GetEtudiantsBycinResponse>(_GetEtudiantsBycinResponse_QNAME, GetEtudiantsBycinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLimitEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getLimitEtudiantsResponse")
    public JAXBElement<GetLimitEtudiantsResponse> createGetLimitEtudiantsResponse(GetLimitEtudiantsResponse value) {
        return new JAXBElement<GetLimitEtudiantsResponse>(_GetLimitEtudiantsResponse_QNAME, GetLimitEtudiantsResponse.class, null, value);
    }

}
