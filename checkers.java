import java.io.IOException;
import java.util.ArrayList;

public class checkers {

	public static void main(String[] args) throws IOException {
		//TODO Auto-generated method stub
		//TODO get shareGameBoard working
		//TODO display checkers

		Game board = new Game();
		
		//Hold doodads		
		ArrayList<Doodad> pieces = new ArrayList<Doodad>();
		
		shareGameBoard(board);
		showReds(pieces);
		showBlacks(pieces);
		kings(pieces);

	}
	
	//create game board
	public static void shareGameBoard(Game board) throws IOException{
		String boardName =  "checkerboard.jpg";
		board.fileToBoard(boardName);
	}
	
	//Display red checkers
	public static void showReds(ArrayList<Doodad> pieces){
		
		//int num = 0;
		int xorigin = 329;
		int yorigin = 120;
		String redPiece = "RedChecker.png";

		
		try {

			for(int  i = 0; i < 3; i++){
				for(int j = 0; j < 4; j++){
					Doodad piece = new Doodad(xorigin, yorigin, redPiece);
					pieces.add(piece);
					yorigin+=180;
				}
				xorigin+=90;
				if(i%2!=0){
					yorigin-=810;
				}
				else{
					yorigin-=630;
				}
			}
		}
			
		catch(Exception e){
			e.printStackTrace();
		}
		for(int m = 0; m < pieces.size(); m++){
			pieces.get(m).addDragListener();
		}
	}
	
	//display black checkers
	public static void showBlacks(ArrayList<Doodad> pieces){
		
		String blackPiece = "BlackChecker.png";
		//int num = 0;
		int xShift = 90*5;
		int yShift = 90;
		int xorigin = 329 + xShift;
		int yorigin = 120 - yShift;
		int listStart = pieces.size();
		int count=0;
		
		try {
			for(int  i = 0; i < 3; i++){
				for(int j = 0; j < 4; j++){
					Doodad piece = new Doodad(xorigin, yorigin, blackPiece);
					pieces.add(listStart+count, piece);
					yorigin+=180;
					count++;
				}
				xorigin+=90;
				if(i%2!=0){
					yorigin-=630;
				}
				else{
					yorigin-=810;
				}
			}
		}
			
		catch(Exception e){
			e.printStackTrace();
		}
		
		for(int m = listStart; m < pieces.size(); m++){
			pieces.get(m).addDragListener();
		}		
	}
	
	//kinging
	public static void kings(ArrayList<Doodad> pieces) throws IOException{
		//black king stack
		int xBlack = 149;
		int y = 120;
		int xRed = 1139;
		int num = 0;
		int num2  = 0;
		int length1 = pieces.size();
		int length2;
		String blackKing = "BlackKing.png";
		String redKing = "RedKing.png";
		
		
		try{
			while(num < 12){
				Doodad piece= new Doodad(xBlack, y, blackKing);
				pieces.add(length1+num, piece);
				num++;
			}
			
			length2 = pieces.size();
			while(num2 < 12){
				Doodad piece = new Doodad(xRed, y, redKing);
				pieces.add(length2+num2, piece);
				num2++;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

		for(int i = 0; i < 12; i++){
			pieces.get(length1+i).addDragListener();
		}
		
		for(int i = 0; i < 12 ; i++){
			pieces.get(36+i).addDragListener();
		}
	}	
}