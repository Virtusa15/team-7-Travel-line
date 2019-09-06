package entity;

public class Service {

	private String from;
	private String to;
	private String bustype;
	private int fare;
	private int distance;
	private int capacity;
	private String journytime;
	private String serviceno;
	private String departuretime;
	
	
	
	@Override
	public String toString() {
		return "Service [from=" + from + ", to=" + to + ", bustype=" + bustype + ", fare=" + fare + ", distance="
				+ distance + ", capacity=" + capacity + ", journytime=" + journytime + ", serviceno=" + serviceno
				+ ", departuretime=" + departuretime + "]";
	}
	
	
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getJournytime() {
		return journytime;
	}
	public void setJournytime(String journytime) {
		this.journytime = journytime;
	}
	public String getServiceno() {
		return serviceno;
	}
	public void setServiceno(String serviceno) {
		this.serviceno = serviceno;
	}
}
