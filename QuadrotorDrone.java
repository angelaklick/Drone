
public class QuadrotorDrone extends Drone {

	public QuadrotorDrone(int x1, int y1, int z1) {
		super(x1, y1, z1);
		
	}

	@Override
	public void fly(int x1, int y1, int z1) {
		setX(getX() + x1);
		setY(getY() + y1);
		setZ(getZ() + z1);

	}

}
