package KPT;

import java.awt.Image;

public class Doodad {
	//fields that Doodad uses
	private int width, height, xAxis, yAxis;
	private Image art;
	private Owner owner;
	private Visibility visible;
	
	//create enum for owner
	public enum Owner{
		PLAYER_1, PLAYER_2, PLAYER_3
	}
	//create enum for visibility
	public enum Visibility{
		PLAYER_1, PLAYER_2, PLAYER_3
	}
	//constructor
	public Doodad(int width, int height, Image art, int xAxis, int yAxis, Owner owner, Visibility visible){
		this.width = width;
		this.height = height;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.art = art;
		this.owner = owner;
		this.visible = visible;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}

	public Image getArt() {
		return art;
	}

	public void setArt(Image art) {
		this.art = art;
	}

}