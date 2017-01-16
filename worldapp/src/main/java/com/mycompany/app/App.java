package com.mycompany.app;

import sharedlibrary.HappyFuture;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "WorldApp!" );

        HappyFuture happyFuture = new HappyFuture();
        happyFuture.happinessFactory();

    }
}
