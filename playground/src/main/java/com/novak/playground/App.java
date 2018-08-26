package com.novak.playground;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String last = "Novak";
    	StringBuilder sb = new StringBuilder(last);
        System.out.println("String Value: " + last);
        System.out.println("StringBuilder Value: " + sb.toString());
        System.out.println(String.format("Compares Objects : %s", last == sb.toString()));
        System.out.println("Comparing Values: " + last.equals(sb.toString()));
        		
    }
}
