package com.javatechie.app.git_demo;

import java.sql.DatabaseMetaData;

import javax.xml.crypto.Data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       
    }
    
    public void addedMethod(){
        System.out.println( "Method added by another user" );
    }
    public void addData(String data) {
    	System.out.println("data ="+data);
    	if (data.equals(Constant.DATA_TYPE)) {
    		System.out.println("I am Samir");
    	}
    	
    }
}
