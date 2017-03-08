import java.io.IOException;
import java.util.ArrayList;


public class battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//create board for players use
	
	//specify screen? How?
	public void dispBoard(Game board) throws IOException{
		String boardName = "BattleshipBoard1.jpg";
		board.fileToBoard(boardName);
	}
	
	//create on middle screen
	public void dispBoardp3(Game board) throws IOException{
		String boardName = "BattleshipBoard2.jpg";
		board.fileToBoard(boardName);
	}
	
	//add ships
	public ArrayList<Doodad> ships(ArrayList<Doodad> ships){
		int xPos = 322;
		int yPos = 322;
		String shipv = "BattleshipV.jpg";
		String shiph = "BattleshipH.jpg";
		
		try{
			for(int i =0; i< 5; i++){
				Doodad shipV = new Doodad(xPos, yPos, shipv);
				ships.add(shipV);
			}
			yPos+=90;
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
