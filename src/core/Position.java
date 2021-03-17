package core;

public class Position {
	
	private double x;
	private double y;
	
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public int getIntX() {
		return (int) Math.round(x);
	}
	
	public double getY() {
		return y;
	}
	
	public int getIntY() {
		return (int) Math.round(y);
	}

	public void apply(Movement movement) {
		Vector2D vector = movement.getVector();
		x += vector.getX();
		y += vector.getY();
	}
	
	

}
