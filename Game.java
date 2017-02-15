import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game {
	ArrayList<Doodad> doodadCol = new ArrayList<Doodad>();
	Scanner scan = new Scanner(System.in);
	BufferedImage board;
	
	
	public String getBoardName(){
		System.out.print("What board do you want: ");
		return scan.next();
		
	}
	
	public Image fileToBoard() throws IOException{
		//take in string from getBoardName
		String boardName = getBoardName() + ".jpg";
		
		//take string, convert to file
		File file = new File(boardName);
		
		//take file, convert to image
		board = ImageIO.read(file);		
		
		//display image
		return board;
		
		
	}
	
	public void displayBoard() throws IOException{
		JLabel label = new JLabel(new ImageIcon(fileToBoard()));
		JFrame jf = new JFrame();
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jf.setUndecorated(true);
		
		jf.getContentPane().add(label);;
		jf.pack();
		jf.setVisible(true);
	}
	
	public static void displayDoodads(){
		
	}
	
	public void addDoodad(Doodad d){
		doodadCol.add(d);
	}
	
	public void removeDoodad(Doodad d){
		doodadCol.remove(d);
	}
	
	public void readDoodad(){
		
	}
	
	public void updateCoords(){
		
	}
	
	
}
