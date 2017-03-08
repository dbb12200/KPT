package KPT;

import java.io.IOException;
import java.util.ArrayList;


public class battleship {

	public static void main(String[] args) throws IOException {
		Game board = new Game();
		ArrayList<Doodad> ships = new ArrayList<Doodad>();
		
		dispBoard(board);
		dispBoardp3(board);
		
		ships1(ships);
		ships2(ships);
		displayShips(ships);
		
	}
	
	//create board for players use
	
	//specify screen? How?
	public static void dispBoard(Game board) throws IOException{
		String boardName = "BattleshipBoard1.jpg";
		board.showOnScreenOne(boardName);
	}
	
	//create on middle screen
	public static void dispBoardp3(Game board) throws IOException{
		String boardName = "BattleshipBoard2.jpg";
		board.showOnScreenTwo(boardName);
	}
	
	//add ships to player 1
	public static ArrayList<Doodad> ships1(ArrayList<Doodad> ships){
		int xPos = -1500;
		int yPos = 322;
		String shipv = "BattleshipV.jpg";
		String shiph = "BattleshipH.jpg";
		
		try{
			for(int i =0; i< 5; i++){
				
				Doodad shipV = new Doodad(xPos, yPos, shipv);
				ships.add(shipV);
			}
			yPos+=500;
			
			for(int j = 0; j < 5; j++){
				Doodad shipH = new Doodad(xPos, yPos, shiph);
				ships.add(shipH);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return ships;
	}
	
	//add ships to not player 1
	public static ArrayList<Doodad> ships2(ArrayList<Doodad> ships){
		int xPos = 800;
		int yPos = 322;
		String shipv = "BattleshipV.jpg";
		String shiph = "BattleshipH.jpg";
		
		try{
			for(int i =0; i< 5; i++){
				
				Doodad shipV = new Doodad(xPos, yPos, shipv);
				ships.add(shipV);
			}
			yPos+=500;
			
			for(int j = 0; j < 5; j++){
				Doodad shipH = new Doodad(xPos, yPos, shiph);
				ships.add(shipH);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return ships;
	}
	
	//display pieces
	public static void displayShips(ArrayList<Doodad> ships){
		for(int i = 0; i < ships.size(); i++){
			ships.get(i).addDragListener();
		}
	}
	
	
	
}