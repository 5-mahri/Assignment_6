package assignment6;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num+" ");
				num = num + rows-j;
			}
			System.out.println();
		}
	}

}
