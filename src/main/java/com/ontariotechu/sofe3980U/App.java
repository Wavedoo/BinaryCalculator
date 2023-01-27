package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App
{
    /**
     * Main program:  The entry point of the program. The local time will be printed first,
     *      Then it will create two binary variables, add them and print the result.
     *
     * @param args: not used
     */
    public static void main( String[] args )
    {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
        Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
        Binary sum= Binary.add(binary1,binary2);
        System.out.println( "Their summation is "+sum.getValue());
        Binary or= Binary.or(binary1,binary2);
        System.out.println( "Their or value is "+or.getValue());
        Binary and= Binary.and(binary1,binary2);
        System.out.println( "Their and value is "+and.getValue());
        Binary multiply= Binary.multiply(binary1,binary2);
        System.out.println( "Their summation is "+multiply.getValue());
    }
}