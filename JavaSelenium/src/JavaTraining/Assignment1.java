package JavaTraining;

public class Assignment1 {

	//(((((10/2)-2)+2)- 2)*2)
	
	public int sumMethod(int a, int b) {
		int sout = a + b;
		return sout;
	}
	
	public int subMethod(int a, int b) {
		int subOut = a - b;
		return subOut;
	}
	
	public int multiMethod(int a, int b) {
		int mulOut = a * b;
		return mulOut;
	}
	
	public int divMethod(int a ,int b) {
		int divOut = a / b;
		return divOut;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 = 10; 
		int b1 = 2;
		
		Assignment1  asgn1 = new Assignment1();
		int divOutput = asgn1.divMethod(a1, b1);
		int subOut = asgn1.subMethod(divOutput, b1);
		int addOut = asgn1.sumMethod(subOut, b1);
		int subOut1 = asgn1.subMethod(addOut, b1);
		int mulOut = asgn1.multiMethod(subOut1, b1);
				
		
		System.out.println("The output of the Formula for Assignment 2" + mulOut);

	}

}
