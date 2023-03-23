package JavaSelenium;

public class SingleLevelInheritanceChild extends SingleLevelInheritance{
	
	public void method3() {
		System.out.println("This is child class output display");
	}
	
	public static void main(String[] args) {
		SingleLevelInheritanceChild child = new SingleLevelInheritanceChild();
		child.method1();
		child.method3();
		child.gParent();
	}

}
