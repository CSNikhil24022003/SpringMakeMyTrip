package anudip.org;
public class Train implements Trip {
	Train()
	{
		System.out.println("Train obj is created");
	}
	public void travel() {
		System.out.println("Booking Done By Train");
	}
}