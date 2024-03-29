
package serve;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serve package. 
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

    private final static QName _Login_QNAME = new QName("http://serve/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://serve/", "LoginResponse");
    private final static QName _Reguster_QNAME = new QName("http://serve/", "Reguster");
    private final static QName _RegusterResponse_QNAME = new QName("http://serve/", "RegusterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serve
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Reguster }
     * 
     */
    public Reguster createReguster() {
        return new Reguster();
    }

    /**
     * Create an instance of {@link RegusterResponse }
     * 
     */
    public RegusterResponse createRegusterResponse() {
        return new RegusterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reguster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "Reguster")
    public JAXBElement<Reguster> createReguster(Reguster value) {
        return new JAXBElement<Reguster>(_Reguster_QNAME, Reguster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegusterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "RegusterResponse")
    public JAXBElement<RegusterResponse> createRegusterResponse(RegusterResponse value) {
        return new JAXBElement<RegusterResponse>(_RegusterResponse_QNAME, RegusterResponse.class, null, value);
    }

}
