package JavaSelenium;

public class PolymorphismSample {

	public void sampleMethod(int a, int b) {
		int output = a+b;
		System.out.println(output);
		
		
	}
	
	public void sampleMethod(int x, int y, int z) {
		int output1 = x + y + z;
		System.out.println(output1);
	
	}

	public static void main(String[] args) {
		
		PolymorphismSample psm = new PolymorphismSample();
		psm.sampleMethod(3, 8);
		psm.sampleMethod(1, 3,8);
	}
	
}
