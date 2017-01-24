package KPT;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import KPT.Doodad.Owner;
import KPT.Doodad.Visibility;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedImage img = null;
		try{
			img = ImageIO.read(new File("parrot.jpeg"));
		}
		catch (IOException e){
			
		}
		
		ArrayList<Doodad> ar = new ArrayList<>();
		Doodad d1 = new Doodad(5, 4, img, 3, 16, Owner.PLAYER_1, Visibility.PLAYER_3);
		Doodad d2 = new Doodad(5, 3, img, 3, 16, Owner.PLAYER_2, Visibility.PLAYER_3);
		Doodad d3 = new Doodad(5, 2, img, 3, 16, Owner.PLAYER_1, Visibility.PLAYER_3);
		Doodad d4 = new Doodad(5, 1, img, 3, 16, Owner.PLAYER_2, Visibility.PLAYER_3);
		
		ar.add(d1);
		ar.add(d2);
		ar.add(d3);
		ar.add(d4);
	
		for(int i = 0; i < ar.size(); i++){
			System.out.println("Doodad d"+i+"'s height is: " + ar.get(i).getHeight());
		}
		
		for(int i = 0; i < ar.size(); i++){
			
		}
	}
	
}
