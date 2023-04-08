package JavaSelenium;

public class ForLoopStarSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 6; 
		
		for(int i=1 ; i<=max ; i++)
		{
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
