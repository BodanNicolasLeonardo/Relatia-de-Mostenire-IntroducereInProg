
public class FighterPlane extends Plane{
	
	public FighterPlane(String planeID, int enginePower) {
		super(planeID, enginePower);
		// TODO Auto-generated constructor stub
	}

	public void launchMissile() {
		System.out.println(getPlaneID()+" - Initiating missile launch procedure - Acquiring target - Launching missile - "
				+ "Breaing away - Missile launch completed");
	}
	
}
