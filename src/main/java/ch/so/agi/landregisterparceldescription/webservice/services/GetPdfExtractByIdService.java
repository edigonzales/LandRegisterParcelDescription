package ch.so.agi.landregisterparceldescription.webservice.services;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import net.sf.saxon.s9api.SaxonApiException;

public interface GetPdfExtractByIdService {
    File getExtract(String egrid) throws Exception;
}
