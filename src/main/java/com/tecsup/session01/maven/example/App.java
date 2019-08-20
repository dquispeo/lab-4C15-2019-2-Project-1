package com.tecsup.session01.maven.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// TODO Auto-generated method stub
    			final String str = "Hola!";

    			App appObject = new App();
    			System.out.println("La cadena invertida de \"" + str + "\" es \"" + appObject.reverseString(str) + "\"");

    		}

    		public String reverseString(String src) {
    			
    			String ret = new StringBuilder(src).reverse().toString();
    			
    			
    			return ret ;
    }
}
