package assignment_06;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
class UserHandler extends  DefaultHandler{
    boolean name = false;
    boolean id = false;
    boolean std = false;
    boolean mark = false;
    boolean address = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
      if (qName.equalsIgnoreCase("name")) {
            name = true;
        } else if (qName.equalsIgnoreCase("id")) {
            id = true;
        } else if (qName.equalsIgnoreCase("std")) {
            std = true;
        }
      else if (qName.equalsIgnoreCase("mark")) {
          mark = true;
      }
        else if (qName.equalsIgnoreCase("address")) {
            address = true;
        }
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (name) {
            System.out.println("Student Name: "
                    + new String(ch, start, length));
            name = false;
        }
        else if (id) {
            System.out.println("Student ID: " + new String(ch, start, length));
            id = false;
        } else if (std) {
            System.out.println("Student Standard: " + new String(ch, start, length));
            std = false;
        } else if (mark) {
            System.out.println("Student Mark : " + new String(ch, start, length));
            mark = false;
        } else if (address) {
            System.out.println("Student Address : " + new String(ch, start, length));
            address = false;
        }
    }

//    @Override
//    public void endElement(String uri, String localName, String qName) throws SAXException {
//        if (qName.equalsIgnoreCase("student")) {
//            System.out.println("End Element :" + qName);
//        }
//    }
}
public class DOM_SAX_parser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("./src/assignment_06/student.xml");
            SAXParserFactory fact = SAXParserFactory.newInstance();
            SAXParser saxParser = fact.newSAXParser();
            UserHandler userHandler = new UserHandler();
            saxParser.parse(inputFile, userHandler);

        } catch (Exception ex) {
            System.out.println("SAXException ");
        }
    }

}