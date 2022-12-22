/*
Класа XML, во која ќе биде сместен методот за креирање на
соодветниот фајл. Методот на влез да прима име на фајлот, како и
објект чии вредности треба да се прикажат во фајлот.
 */

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class XML {
    public void createXMLFile(String nameOfFile, Vraboten vraboten) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // glaven element
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("vraboten");
            doc.appendChild(rootElement);

            // ime element
            Element ime = doc.createElement("ime");
            ime.appendChild(doc.createTextNode(vraboten.getIme()));
            rootElement.appendChild(ime);

            // prezime element
            Element prezime = doc.createElement("prezime");
            prezime.appendChild(doc.createTextNode(vraboten.getPrezime()));
            rootElement.appendChild(prezime);

            // plata element
            Element plata = doc.createElement("plata");
            plata.appendChild(doc.createTextNode(String.valueOf(vraboten.getPlata())));
            rootElement.appendChild(plata);

            // ispisi xml doc
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(nameOfFile));
            transformer.transform(source, result);

            System.out.println("XML file created!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
