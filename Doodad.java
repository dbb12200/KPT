import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


	
public class Doodad {
	private static Scanner scanner;
	private int x, y, height, width;
	private Owner owner;
	private Visibility visibility;
	BufferedImage picture;
	
	public enum Owner{
		PLAYER_1, PLAYER_2, PLAYER_3
	}
	
	public enum Visibility{
		PLAYER_1, PLAYER_2, PLAYER_3
	}
	
	/*
	private static String getPicture(){
		String picture = "";
		scanner = new Scanner(System.in);
		System.out.print("Enter the animal of your choosing, Monkey = 1, Elephant = 2, Parrot = 3. Your choice is: ");
		int animal = scanner.nextInt();
    	switch (animal){
    	case 1:
    		picture = "monkey.jpg";
    		break;
    	case 2:
    		picture = "elephant.jpg";
    		break;
    	case 3:
    		picture = "parrot.jpg";
    		break;
        default:
        	picture = "elephant.jpg";
    	}
    	return picture;
	}
	
	
	public void showDoodad() throws IOException {
        File file = new File(getPicture());
        BufferedImage image = ImageIO.read(file);
        JLabel label = new JLabel(new ImageIcon(image));
        JFrame f = new JFrame();
        f.setUndecorated(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(getAxis(),getAxis()); 
        f.setVisible(true); 
    }
    */
	
	private Image getPicture(){
		String picture = "";
		scanner = new Scanner(System.in);
		System.out.print("Enter the animal of your choosing, Monkey = 1, Elephant = 2, Parrot = 3. Your choice is: ");
		int animal = scanner.nextInt();
    	switch (animal){
    	case 1:
    		picture = "monkey.jpg";
    		break;
    	case 2:
    		picture = "elephant.jpg";
    		break;
    	case 3:
    		picture = "parrot.jpg";
    		break;
        default:
        	picture = "elephant.jpg";
    	}
    	URL pictureImage = getClass().getResource(picture);
    	return new ImageIcon(pictureImage).getImage()
	}
	
	public Doodad(int x, int y, int width, int height, BufferedImage picture, Owner owner, Visibility visibility){
		this.width = width;
		this.height = height;
		this.x = getAxis();
		this.y = getAxis();
		
		//TODO: make this actually work
		this.picture = showDoodad();
		
		//TODO: make this viable - waiting on Game class and/or putting all this on the KPT computer?
		this.owner = owner;
		
		//TODO: make this viable - waiting on Game class and/or putting all this on the KPT computer?
		this.visibility = visibility;
	}

	private static int getAxis()
    {
    	System.out.print("Enter doodad axis:");
    	int axis = scanner.nextInt();
    	return axis;
    }
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	private Image getPicturey(String picture){
		
	}
	
	
}