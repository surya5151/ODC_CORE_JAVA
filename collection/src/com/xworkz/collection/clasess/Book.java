package com.xworkz.collection.clasess;

public class Book {
	
	private String name;
	
	private String Author;
	
	private int publisedYear;
	
	private double price;
	
	
	
	public Book() {
		System.out.println(this.getClass().getSimpleName()+ "invoked no-org constructor");
	}


	public Book(String name, String author, int publisedYear, double price) {
		super();
		this.name = name;
		Author = author;
		this.publisedYear = publisedYear;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public int getPublisedYear() {
		return publisedYear;
	}


	public void setPublisedYear(int publisedYear) {
		this.publisedYear = publisedYear;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", Author=" + Author + ", publisedYear=" + publisedYear + ", price=" + price
				+ "]";
	}
	

}
