package com.xworkz.earphone.exceptionStarter;

import com.xworkz.earphone.exceptionEvent.Theater;
import com.xworkz.earphone.exceptionEvent.constent.TicketType;

public class TheaterStarter {

	public static void main(String[] args) {
		Theater theater = new Theater("KGF");

		theater.bookTicket("", TicketType.GANDI_CLASS, 5);		
		theater.bookTicket("", TicketType.MIDDLE_CLASS, 10);
		theater.bookTicket("", TicketType.BALCONY, 11);

		System.out.println("After booking run..........");
	}

}
