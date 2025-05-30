
public class Plane {
	
	private String planeID;
	private int enginePower;
	
	public Plane(String planeID, int enginePower) {
		this.planeID = planeID;
		this.enginePower = enginePower;
		
	}

	public String getPlaneID() {
		return planeID;
	}

	public int getEnginePower() {
		return enginePower;
	}
	public void takeOff() {
		System.out.println(planeID +" - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off "
				+ "- Retracting gear - Takeoff complete");
	}
	
	public void fly() {
		System.out.println(planeID+" - Flying");
	}
	
	public void land() {
		System.out.println(planeID+" - Initiating landing procedure - Enabling airbrakes - Lowering gear - "
				+ "Contacting runway - Decelerating - Stopping engines - Landing complete");
	}
}
