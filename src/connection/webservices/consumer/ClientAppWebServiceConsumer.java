package connection.webservices.consumer;

import connection.webservices.consumer.stubs.ChrisWebServices;
import connection.webservices.consumer.stubs.MyWebServicesService;

/**
 * Created by Nils on 27.01.2017.
 */

public class ClientAppWebServiceConsumer
{
    public static void main( String[] args )
    {
        ChrisWebServices port = new MyWebServicesService().getChrisWebServicesPort();
        System.out.printf( "%s Dein BMI ist %.1f%n",
                port.hello( "Chris" ),
                port.bodyMassIndex( 183, 84 ) );
    }
}
