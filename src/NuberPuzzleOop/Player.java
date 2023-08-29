package NuberPuzzleOop;

public class Player {
	private int x;
	private int y;
	private String xs;
	private String ys;


	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setPositions(String xs, String ys)
	{
		this.xs= xs;
		this.ys= ys;
	}
	public String getXs() {
		return xs;
	}
	public String getYs() {
		return ys;
	}

}
