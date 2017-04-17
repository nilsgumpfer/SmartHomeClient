package connection.webservices.consumer.stubs;

/**
 * Created by Nils on 17.04.2017.
 */
public class MySmartHomeServiceProvider {
    private static MySmartHomeServiceProvider ourInstance = new MySmartHomeServiceProvider();
    private static SmartHomeManagerWebServices smartHomeManagerWebServicesPort;

    public static MySmartHomeServiceProvider getInstance() {
        return ourInstance;
    }

    private MySmartHomeServiceProvider() {
         smartHomeManagerWebServicesPort = new SmartHomeManagerWebServiceDescriptorService().getSmartHomeManagerWebServicesPort();
    }

    public SmartHomeManagerWebServices getPort(){
        return MySmartHomeServiceProvider.getInstance().smartHomeManagerWebServicesPort;
    }

}
