package mycompany;

import sharedlibrary.HappyFuture;

/**
 * Hello world!
 *
 */
public class HelloApp 
{
    public static void main( String[] args )
    {
        System.out.println( "HelloApp!" );

        HappyFuture happyFuture = new HappyFuture();
        happyFuture.happinessFactory();
    }
}
