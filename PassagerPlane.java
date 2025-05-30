
public class PassagerPlane extends Plane{

	public int maxPassagerss;
	
	public PassagerPlane(String planeID, int enginePower, int maxPassagerss) {
		super(planeID, enginePower);
		this.maxPassagerss = maxPassagerss;
		
	}

	public int getmaxPassagerss() {
		return maxPassagerss;
	}
	
}
