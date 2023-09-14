package assignment_06;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;

public class XML_Using_DOM {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        DocumentBuilder b = f.newDocumentBuilder();
        Document doc = b.newDocument();
        Element rootEle = doc.createElement("employeeInfo");

        Element empEle = doc.createElement("employee");
        Element idEle = doc.createElement("id");
        Element empName = doc.createElement("name");
        Element empDep = doc.createElement("dept");

        Text t1 = doc.createTextNode("01");
        Text t2 = doc.createTextNode("Tony");
        Text t3 = doc.createTextNode("IT");


        idEle.appendChild(t1);
        empName.appendChild(t2);
        empDep.appendChild(t3);

        empEle.appendChild(idEle);
        empEle.appendChild(empName);
        empEle.appendChild(empDep);

        rootEle.appendChild(empEle);

        doc.appendChild(rootEle);

        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("./src/assignment_06/employeeInfo.xml")));
    }
}
