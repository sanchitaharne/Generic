package com.properties;

import java.io.*;
import java.util.Properties;

public class LoadProperty {

    public static void main(String[] args) throws IOException {
        loadFromStream();
        loadFromXML();
    }

    public static void loadFromStream() throws IOException {
        String s1 = "Height=100";
        String s2 = "Width=200";

        FileInputStream fis = new FileInputStream("src/com/properties/config.txt");
        FileOutputStream fos = new FileOutputStream("src/com/properties/config.txt");

        fos.write(s1.getBytes());
        fos.write("\n".getBytes());

        fos.write(s2.getBytes());
        fos.write("\n".getBytes());

        Properties prop = new Properties();
        prop.load(fis);
        prop.list(System.out);
    }

    public static void loadFromXML() throws IOException {

    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream("src/com/properties/config.xml");
    prop.loadFromXML(fis);

    FileOutputStream fos = new FileOutputStream("src/com/properties/FromXML.txt");
    prop.store(fos,"");

    }
}
