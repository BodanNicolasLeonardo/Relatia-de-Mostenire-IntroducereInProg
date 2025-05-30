
public class Concorde extends PassagerPlane{

	public Concorde(String planeID, int enginePower, int maxPassagerss) {
		super(planeID, enginePower, maxPassagerss);
		// TODO Auto-generated constructor stub
	}

	public void goSuperSonic() {
		System.out.println(getPlaneID()+" - Supersonic mode is  activated");
	}
	
	public void goSubSonic() {
		System.out.println(getPlaneID()+" - Supersonic mode is dezactivated");
	}
	
}
