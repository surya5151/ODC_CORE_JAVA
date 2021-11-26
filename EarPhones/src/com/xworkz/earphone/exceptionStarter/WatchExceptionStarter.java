package com.xworkz.earphone.exceptionStarter;

import java.awt.FontFormatException;
import java.awt.print.PrinterException;
import java.rmi.NotBoundException;
import java.sql.SQLException;
import java.util.concurrent.TimeoutException;

import javax.management.InvalidApplicationException;
import javax.management.modelmbean.XMLParseException;
import javax.naming.ConfigurationException;
import javax.xml.transform.TransformerException;

import com.xworkz.earphone.exceptionEvent.Watch;

public class WatchExceptionStarter {

	public static void main(String[] args)
			throws InvalidApplicationException, PrinterException, NotBoundException, SQLException, TimeoutException,
			XMLParseException, TransformerException, ConfigurationException, FontFormatException {

		Watch watch = new Watch();
		watch.createWatchException();

	}

}
