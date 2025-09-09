package lab_6_Jamesg127;

public class areaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Campsite camp = new Campsite(10.0);
		Trail hike = new Trail(25.0, 6.0);
		System.out.print(camp.area() + hike.area());
	}

}
