package com.mtb.mavendemo;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("this my blog i am arjun  singh kushwah  ");
        Date date=new Date();
        String strDateformate="hh:mm:ss";
        DateFormat formate=new SimpleDateFormat(strDateformate);
        String dateformate=formate.format(date);
        System.out.println("date is "+dateformate);
        
    }
}
