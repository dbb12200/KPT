import java.io.IOException;
import java.util.Scanner;

public class test {	
	public static void main(String[] args) throws IOException{ 
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int desired;
		
		
		System.out.println("How many pictures do you want?");
		desired = scan.nextInt();
		
		Doodad doodad[]= new Doodad[desired];
		try {
				{
					while(num<desired){
						int[] coords = getCoords(scan);
						String name = getName(scan);
						doodad[num] = new Doodad(coords[0], coords[1], name );
						num++;
					}
						
				}
		}
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		for(int i = 0; i<desired;i++){
			doodad[i].drag();
		}
	}
	
	public static String getName(Scanner scan){
		System.out.print("What is the name of the file: ");
		return scan.next();
	}
	public static int[] getCoords(Scanner scan){
		int arr[] = new int[2];
		System.out.println("Please put in coordinates for your piece.");
		System.out.print("X-coord: ");
		arr[0] = scan.nextInt();
		System.out.print("y-coord: ");
		arr[1] = scan.nextInt();
		return arr;
	}
	
	
}