package com.xmlProject;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author rbhavsar
 * Created on 4/28/18.
 */

/*
<?xml version = "1.0" encoding = "UTF-8" standalone = "no"?>
<cars>
   <supercars company = "Ferrari">
      <carname type = "formula one">Ferrari 101</carname>
      <carname type = "sports">Ferrari 202</carname>
   </supercars>
</cars>
 */
public class CreateXmlFileDemo {


  public static void main(String[] args) {

    try {
      DocumentBuilderFactory dbFactory =
          DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.newDocument();

      // root element
      Element rootElement = doc.createElement("cars"); //<cars
      doc.appendChild(rootElement);

      // supercars element
      Element supercar = doc.createElement("supercars"); //<supercars
      rootElement.appendChild(supercar);

      // setting attribute to element
      Attr attr = doc.createAttribute("company");//<supercars company
      attr.setValue("Ferrari"); // <supercars company="Ferrari"
      supercar.setAttributeNode(attr);

      // carname element
      Element carname = doc.createElement("carname");
      Attr attrType = doc.createAttribute("type");
      attrType.setValue("formula one");
      carname.setAttributeNode(attrType);
      carname.appendChild(doc.createTextNode("Ferrari 101"));
      supercar.appendChild(carname);

      Element carname1 = doc.createElement("carname");
      Attr attrType1 = doc.createAttribute("type");
      attrType1.setValue("sports");
      carname1.setAttributeNode(attrType1);
      carname1.appendChild(doc.createTextNode("Ferrari 202"));
      supercar.appendChild(carname1);

      // write the content into xml file
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource source = new DOMSource(doc);
      StreamResult result = new StreamResult(new File("/Users/rbhavsar/StudentData/Data/src/com/xmlProject/create.xml"));
      transformer.transform(source, result);

      // Output to console for testing
      StreamResult consoleResult = new StreamResult(System.out);
      transformer.transform(source, consoleResult);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
