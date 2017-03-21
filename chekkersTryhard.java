package cleanedUpGames;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

public class chekkersTryhard {

	public static void main(String[] args) throws IOException {
		//create frame
		JFrame chekkers = new JFrame();
		
		//create ArrayList
		ArrayList<JLabel> chekkerBits = new ArrayList<JLabel>();
		ArrayList<DoodadTryhard> al = new ArrayList<DoodadTryhard>();
		
		//populate frame background with gameboard pic
		chekkers.add(insertBackground(chekkers));
		
		
		
		//populate the JFrame with chekkerBits
		createPieces(al);
		createJLabelsFromBits(chekkerBits, al);
		addDragListener(chekkerBits);
		
		System.out.println(chekkerBits.size());
		
		System.out.println();
		for(int i = 0; i < chekkerBits.size(); i++){
			chekkers.add(chekkerBits.get(i));
		}
	
		//display stuff
		chekkers.setSize(getScreenDimension());
		chekkers.setUndecorated(true);
		chekkers.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        chekkers.pack();
		chekkers.setVisible(true);
	}
	
	//find the image for the gameBoard pic
	public static JLabel insertBackground(JFrame jf) throws IOException {
		String backPic = "C:/Users/MotherShip/Documents/Programming/KnightlyParty/Pictures/chekkersPics/checkerboard.jpg";
		BufferedImage image = ImageIO.read(new File(backPic));
		JLabel jl = new JLabel(new ImageIcon(image));
		return jl;
	}
	
	//using Doodads, create checkers pieces and add them to the arrayList
	public static void createPieces(ArrayList<DoodadTryhard> al) throws IOException{
		String redBits = "C:/Users/MotherShip/Documents/Programming/KnightlyParty/Pictures/chekkersPics/redChecker.png";
		String redKingBits = "C:/Users/MotherShip/Documents/Programming/KnightlyParty/Pictures/chekkersPics/redKing.png";
		String blackBits = "C:/Users/MotherShip/Documents/Programming/KnightlyParty/Pictures/chekkersPics/blackChecker.png";
		String blackKingBits = "C:/Users/MotherShip/Documents/Programming/KnightlyParty/Pictures/chekkersPics/blackKing.png";
		
		int redX = 604, redY = 185, redKingX = 1415, redKingY = 410,
				blackX = 1054, blackY = 275, blackKingX = 424, blackKingY = 410;
		
		for(int i = 0; i < 12; i++){
			al.add(new DoodadTryhard(redX, redY, redBits));
		}
		for(int i = 0; i < 12; i++){
			al.add(new DoodadTryhard(redKingX, redKingY, redKingBits));
		}
		for(int i = 0; i < 12; i++){
			al.add(new DoodadTryhard(blackX, blackY, blackBits));
		}
		for(int i = 0; i < 12; i++){
			al.add(new DoodadTryhard(blackKingX, blackKingY, blackKingBits));
		}
	}
	
	
	//Convert the doodads to jLabels
	public static ArrayList<JLabel> createJLabelsFromBits(ArrayList<JLabel>cb, ArrayList<DoodadTryhard> al) throws IOException{
		for(int i = 0; i < al.size(); i++){
			BufferedImage image = ImageIO.read(new File(al.get(i).getName()));
			JLabel jl = new JLabel(new ImageIcon(image));
			cb.add(jl);
		}
		return cb;
	}
	
	public static void addDragListener(ArrayList<JLabel> al){
		DragListenerTryhard dList = new DragListenerTryhard();
		for(int i = 1; i < al.size(); i ++){
			al.get(i).addMouseListener(dList);
			al.get(i).addMouseMotionListener(dList);
		}
	}
	
	public static Dimension getScreenDimension(){
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
}
