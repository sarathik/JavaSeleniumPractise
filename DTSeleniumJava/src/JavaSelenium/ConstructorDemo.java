package JavaSelenium;

public class ConstructorDemo {

	//This is the Default Constructor
	public ConstructorDemo() {
		System.out.println("This is the Default Constructor section to print");
	}
	
	public ConstructorDemo(int a) {
		System.out.println("This is the Parameterized Constructor :" + a);
	}
	
	public static void main(String[] args) {
		//ConstructorDemo cdemo = new ConstructorDemo();
		ConstructorDemo cdemo = new ConstructorDemo(34);
		
	}
	
}
