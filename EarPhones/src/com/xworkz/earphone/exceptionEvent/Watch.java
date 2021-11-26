package com.xworkz.earphone.exceptionEvent;

import java.awt.FontFormatException;
import java.awt.print.PrinterException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.nio.charset.CoderMalfunctionError;
import java.rmi.NotBoundException;
import java.sql.SQLException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.TimeoutException;

import javax.management.InvalidApplicationException;
import javax.management.modelmbean.XMLParseException;
import javax.naming.ConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerException;

public class Watch {

	public Watch() {
		System.out.println("invoked no-org const...");
	}

	public void createWatchException()
			throws InvalidApplicationException, PrinterException, NotBoundException, SQLException, TimeoutException,
			XMLParseException, TransformerException, ConfigurationException, FontFormatException {

//		RuntimeException runtimeException= new RuntimeException();
//		throw runtimeException;

//		InvalidApplicationException apliApplicationException = new InvalidApplicationException("");
//		throw apliApplicationException;

//		PrinterException printerException = new PrinterException();
//		throw printerException;

//		NotBoundException notBoundException = new NotBoundException();
//		throw notBoundException;

//		SQLException sqlException = new SQLException();
//		throw sqlException;

//		TimeoutException timeoutException = new TimeoutException();
//		throw timeoutException;

//		XMLParseException xmlParseException = new XMLParseException();
//		throw xmlParseException;

//		TransformerException transformerException = new TransformerException("");
//		throw transformerException;

//		ConfigurationException configurationException = new ConfigurationException();
//		throw configurationException;

//		FontFormatException fontFormatException = new FontFormatException("");
//		throw fontFormatException;		

//		AnnotationTypeMismatchException annotationTypeMismatchException = new AnnotationTypeMismatchException(null, "");
//		throw annotationTypeMismatchException;

//		AnnotationFormatError anoAnnotationFormatError = new AnnotationFormatError("");
//		throw anoAnnotationFormatError;

//		CoderMalfunctionError coderMalfunctionError = new CoderMalfunctionError(null);
//		throw coderMalfunctionError;

//		FactoryConfigurationError factoryConfigurationError = new FactoryConfigurationError();
//		throw factoryConfigurationError;

//		ServiceConfigurationError serviceConfigurationError = new ServiceConfigurationError(null);
//		throw serviceConfigurationError;

		LinkageError linkageError = new LinkageError();
		throw linkageError;

	}

}
