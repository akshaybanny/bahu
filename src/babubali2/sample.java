package babubali2;

public class sample {
	public static void main(String[] args) {
		
		int a=7;
		int count=0;
		
		for(int i=1;i<=a;i++) {
		  if(a%i==0) {
			  count++;
		  }
		}
		if(count==2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("is not a prime");
		}
		
		
		
		
		
	}

}
