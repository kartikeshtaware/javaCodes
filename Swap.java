// swap the number by 5 methods

public class Swap{
	
	public void swapByTemp(int a, int b){
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a +" "+b);
	}
	
	public void swapByAddSub(int a, int b){
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a +" "+b);
	}
	
	public void swapByMulDiv(int a, int b){
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println(a +" "+b);
		
	}
	
	public void swapBitwiseXOR(int a, int b){
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a +" "+b);
		
	}
	
	public void swapSingleStatement(int a,int b){
		b = a+b-(a=b);
		
		System.out.println(a +" "+b);
		
	}
		
	public static void main(String args[]){
		
		Swap s = new Swap();
		s.swapByTemp(10,34);
		s.swapByAddSub(10,34);
		s.swapByMulDiv(10,34);
		s.swapBitwiseXOR(10,34);
		s.swapSingleStatement(10,34);
		
	}

}