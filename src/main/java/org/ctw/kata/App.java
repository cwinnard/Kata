package org.ctw.kata;

import org.ctw.kata.writer.Writer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Writer appWriter = new Writer();
    	
        System.out.println(appWriter.write("World!!", "Hello "));
    }
}
