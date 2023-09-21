package anudip.org;
public class MakeMyTrip {
	 Trip trip;
	 MakeMyTrip()
	 {
		 System.out.println("MakeMyTrip obj created"); 
	 }
	public Trip getTrip() {
		return trip;
	}
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	public MakeMyTrip(Trip trip) {
		super();
		this.trip = trip;
	}
	void booking() {
		trip.travel();
	}
}