package com.xworkz.earphone.exceptionEvent;

import com.xworkz.earphone.exceptionEvent.constent.TicketType;
import com.xworkz.earphone.exceptionEvent.exception.HouseFullRunTimeException;

public class Theater {
	private int gandiClassTicket = 5;
	private int middleClassTicket = 10;
	private int balconyTicket = 15;
	private String movieName;

	public Theater(String movieName) {

		this.movieName = movieName;
	}

	public boolean bookTicket(String movieName, TicketType ticketType, int totalTickets) {
		System.out.println("invoked bookTicket");
		if (movieName.equals(movieName)) {

			if (TicketType.GANDI_CLASS.equals(ticketType) && totalTickets <= this.gandiClassTicket) {
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;
			} 

			else if(TicketType.MIDDLE_CLASS.equals(ticketType) && totalTickets <= this.middleClassTicket) {
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;
			} 
			else if (TicketType.BALCONY.equals(ticketType) && totalTickets <=this.balconyTicket) {
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;

			} else {
				System.err.println("Can not book ticket for ".concat(movieName).concat(" Ticket is full for ")
						.concat(ticketType.toString()));
				throw new HouseFullRunTimeException("Your booked in maximum ticket not available this much ticket");
			}
		}

		return false;
	}

}
