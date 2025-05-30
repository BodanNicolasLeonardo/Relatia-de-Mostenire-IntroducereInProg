
public class TomCat extends FighterPlane{

	public TomCat(String planeID, int enginePower) {
		super(planeID, enginePower);
		
	}

	public void refuel() {
		System.out.println(getPlaneID() + "Initializing rwfueling procedure - Locating refueler - Catching up " + " Refueling Complete" );
	}
}
