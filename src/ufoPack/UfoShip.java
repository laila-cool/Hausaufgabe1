package ufoPack;
import view.IGameObject;



public class UfoShip implements IGameObject{
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String sprite;
	
	public UfoShip(int x, int y, int width, int height, String sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
				
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public String getImagePath() {
		return sprite;
	}
	
	@Override
	public String toString() {
		return "x = " + x + " , y = " + y;
	}

}
