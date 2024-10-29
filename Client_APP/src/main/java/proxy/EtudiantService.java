
package proxy;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EtudiantService", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EtudiantService {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Etudiant>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEtudiants", targetNamespace = "http://WS/", className = "proxy.GetAllEtudiants")
    @ResponseWrapper(localName = "getAllEtudiantsResponse", targetNamespace = "http://WS/", className = "proxy.GetAllEtudiantsResponse")
    @Action(input = "http://WS/EtudiantService/getAllEtudiantsRequest", output = "http://WS/EtudiantService/getAllEtudiantsResponse")
    public List<Etudiant> getAllEtudiants();

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Etudiant
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEtudiantsBycin", targetNamespace = "http://WS/", className = "proxy.GetEtudiantsBycin")
    @ResponseWrapper(localName = "getEtudiantsBycinResponse", targetNamespace = "http://WS/", className = "proxy.GetEtudiantsBycinResponse")
    @Action(input = "http://WS/EtudiantService/getEtudiantsBycinRequest", output = "http://WS/EtudiantService/getEtudiantsBycinResponse")
    public Etudiant getEtudiantsBycin(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<proxy.Etudiant>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLimitEtudiants", targetNamespace = "http://WS/", className = "proxy.GetLimitEtudiants")
    @ResponseWrapper(localName = "getLimitEtudiantsResponse", targetNamespace = "http://WS/", className = "proxy.GetLimitEtudiantsResponse")
    @Action(input = "http://WS/EtudiantService/getLimitEtudiantsRequest", output = "http://WS/EtudiantService/getLimitEtudiantsResponse")
    public List<Etudiant> getLimitEtudiants(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}