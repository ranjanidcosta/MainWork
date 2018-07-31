package com.ranjani.bean;

import java.time.LocalDate;


public class Show {
	private String showId;
	private String showName;
	private String location;
	private LocalDate showDate;
	private int availableSeats;
	private double priceTicket;
	
	public String getShowId() {
		return showId;
	}
	public void setShowId(String showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getPriceTicket() {
		return priceTicket;
	}
	public void setPriceTicket(double priceTicket) {
		this.priceTicket = priceTicket;
	}
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showName=" + showName + ", location=" + location + ", showDate=" + showDate
				+ ", availableSeats=" + availableSeats + ", priceTicket=" + priceTicket + "]";
	}
	public Show(String showId, String showName, String location, LocalDate showDate, int availableSeats,
			double priceTicket) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.location = location;
		this.showDate = showDate;
		this.availableSeats = availableSeats;
		this.priceTicket = priceTicket;
	}
	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}
}
