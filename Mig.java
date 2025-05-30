
public class Mig extends FighterPlane{

	public Mig(String planeID, int enginePower) {
		super(planeID, enginePower);
		
	}

	public void highSpeedGeometry() {
		System.out.println(getPlaneID() + "High Speed Geometry is selected ");
		
	}
	
	public void normalGeometry() {
		System.out.println(getPlaneID() + "Normal Speed Geometry is selected ");
	}
}
