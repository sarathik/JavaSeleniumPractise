package JavaSelenium;

public class DynamicPolymSample extends PolymorphismSample{

	public void sampleMethod(int a, int b) {
		super.sampleMethod(41, 44);
		int output = a+b;
		System.out.println(output);		
	}
	
	public static void main(String[] args) {
		DynamicPolymSample dnp = new DynamicPolymSample();
		dnp.sampleMethod(5, 5);
	}
}
