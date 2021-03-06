package ch.pbs.benevole.renderer.uc.kursbestaetigung.xml;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XMLAccessor {
	
	public static XMLKursbeschreibung readKursbeschreibung(InputStream xmlDocument) throws Exception{
		JAXBContext jaxbContext = JAXBContext.newInstance(XMLKursbeschreibung.class, XMLKursbeschreibung.InhaltElement.class, XMLText.class, XMLTextStyle.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (XMLKursbeschreibung)unmarshaller.unmarshal(xmlDocument);
	}
	
	public static XMLKursConfig readKursConfig(InputStream xmlDocument) throws Exception{
		JAXBContext jaxbContext = JAXBContext.newInstance(XMLKursConfig.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (XMLKursConfig)unmarshaller.unmarshal(xmlDocument);
	}
	
}
