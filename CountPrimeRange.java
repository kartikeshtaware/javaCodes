import java.util.*;


public class CountPrimeRange{
	
	public boolean isPrimeNumber(int n){
		if(n<=1){
			return false;
		}
		
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public int findRnageCount(int n){
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int count = 0;
		
		for(int i=1;;i++){
			
			a.add(i);
			
			
			if(isPrimeNumber(i)){
				count++;
				
				if(count == n){
					
					break;
				}
			}
			
			
			
		}
		//System.out.println(a);
		return a.size();
	}
	
	/*
	public int findRnageCount(int n){
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int count = 0;
		
		int end;
		
		
		for(int i=1;;i++){
			
			a.add(i);
			
			
			if(isPrimeNumber(i)){
				count++;
				
				if(count == n){
					end = i;
					break;
				}
			}
			
			
			
		}
		//System.out.println(a);
		return end;
	}
	
	*/
	
	public static void main(String args[]){
		
		CountPrimeRange c = new CountPrimeRange();
		
		System.out.println(c.findRnageCount(10));
		
		
	}
}