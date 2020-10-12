package assignment6;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a;
		for(int j=7; j>=1; j--) {
			for( i=1; i<=7-j; i++) {
	    		   System.out.print(" ");
	    	   }
			  for(int m=i; m<j+i; ++m) {
				  System.out.print(m+" ");
			  }
			  System.out.println();
		  }
		for(int b=1; b<=7; b++) {
			for( a=1; a<=7-b; a++) {
	    		   System.out.print(" ");
	    	   }
			for(int p=a; p<b+a; ++p) {
					System.out.print(p+" ");
				
				}	System.out.println();
			}
	}

}
