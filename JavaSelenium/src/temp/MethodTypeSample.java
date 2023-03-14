package temp;

public class MethodTypeSample {
	
	public int addition(int a, int b) {
		int sumOutput;
		sumOutput = a + b;	
		return sumOutput;
		
	}
	
	public int subtraction(int a,int b) {
		int subOutput;
		subOutput = a -b;
		return subOutput;
	}
	
	public void multi(int sumOutput1, int subOutput1) {
		int multiOutput = sumOutput1 * subOutput1;
		System.out.println("The output is : "+multiOutput);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//(a+b)(a-b)
	
	MethodTypeSample mts = new MethodTypeSample();
	int sumOutput11 = mts.addition(10, 2);
	int subOutput11 = mts.subtraction(10, 2);
	mts.multi(sumOutput11,subOutput11);
	}
}
