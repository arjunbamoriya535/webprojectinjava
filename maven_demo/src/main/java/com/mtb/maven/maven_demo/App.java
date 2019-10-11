package com.mtb.maven.maven_demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Mitrajit's Tech Blog -- Welcome to the my first maven project");
        Date date = new Date();
        String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate= dateFormat.format(date);
        System.out.println("Today's date and time is : " + formattedDate);
    }
}
