package adaptermessagemonitoringwsd;

/**
 * Service implementation of {AdapterMessageMonitoring} (generated by SAP WSDL to Java generator).
 */
@javax.xml.ws.WebServiceClient(name = "AdapterMessageMonitoring", targetNamespace = "urn:AdapterMessageMonitoringWsd", wsdlLocation = "META-INF/wsdl/rootwsdl_AdapterMessageMonitoring/rootwsdl_AdapterMessageMonitoring.wsdl")
public class AdapterMessageMonitoring extends javax.xml.ws.Service {

  private final static java.net.URL ADAPTERMESSAGEMONITORING_WSDL_LOCATION = null;
  /**
   * Default service constructor.
   */
  public AdapterMessageMonitoring() throws java.net.MalformedURLException {
    super(ADAPTERMESSAGEMONITORING_WSDL_LOCATION, new javax.xml.namespace.QName("urn:AdapterMessageMonitoringWsd", "AdapterMessageMonitoring"));
  }
  public AdapterMessageMonitoring(java.net.URL wsdlLocation, javax.xml.namespace.QName serviceName) {
    super(wsdlLocation, serviceName);
  }
  /**
   * Get method for webservice port [basicPort].
   */
  @javax.xml.ws.WebEndpoint(name = "basicPort")
  public adaptermessagemonitoringwsd.AdapterMessageMonitoringVi getBasicPort() {
    javax.xml.namespace.QName portName = new javax.xml.namespace.QName("urn:AdapterMessageMonitoringWsd","basicPort");
    return (adaptermessagemonitoringwsd.AdapterMessageMonitoringVi) super.getPort(portName,adaptermessagemonitoringwsd.AdapterMessageMonitoringVi.class);
  }
  /**
   * Get method for webservice port [sslPort].
   */
  @javax.xml.ws.WebEndpoint(name = "sslPort")
  public adaptermessagemonitoringwsd.AdapterMessageMonitoringVi getSslPort() {
    javax.xml.namespace.QName portName = new javax.xml.namespace.QName("urn:AdapterMessageMonitoringWsd","sslPort");
    return (adaptermessagemonitoringwsd.AdapterMessageMonitoringVi) super.getPort(portName,adaptermessagemonitoringwsd.AdapterMessageMonitoringVi.class);
  }
  /**
   * Get method for webservice port [clientCertPort].
   */
  @javax.xml.ws.WebEndpoint(name = "clientCertPort")
  public adaptermessagemonitoringwsd.AdapterMessageMonitoringVi getClientCertPort() {
    javax.xml.namespace.QName portName = new javax.xml.namespace.QName("urn:AdapterMessageMonitoringWsd","clientCertPort");
    return (adaptermessagemonitoringwsd.AdapterMessageMonitoringVi) super.getPort(portName,adaptermessagemonitoringwsd.AdapterMessageMonitoringVi.class);
  }
}