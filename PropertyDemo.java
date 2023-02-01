import java.util.*;
import java.io.*;
public class PropertyDemo
{
public static void main(String[]args)throws Exception
{
Properties p = new Properties();
/*p.setProperty("Brand","Dell");
p.setProperty("Processor","Ryzen-5 3600X");
p.setProperty("OS","Windows10");
p.setProperty("Model","Dekstop");

p.store(new FileOutputStream("/F:/Study/Abdul Bari/PropertiesFile.txt"),"Laptop");

p.storeToXML(new FileOutputStream("/F:/Study/Abdul Bari/PropertiesFile.xml"),"Laptop");*/


p.loadFromXML(new FileInputStream("/F:/Study/Abdul Bari/PropertiesFile.xml"));

System.out.println(p.getProperty("Brand"));


}
}