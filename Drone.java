
public abstract class Drone {

	private int x;
	private int y;
	private int z;
	
	public Drone(int x, int y, int z){
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public abstract void fly(int x1, int y1, int z1);

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
}
