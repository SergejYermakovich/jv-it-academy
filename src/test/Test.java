package test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Test {
    public static void main(String[] args) throws DatatypeConfigurationException {
        final XMLGregorianCalendar date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar("2024-02-09");
        final XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar("2024-02-09");

        System.out.println(date1.equals(date2));
    }
}
