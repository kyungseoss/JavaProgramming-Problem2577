package problem2577;

import java.util.Scanner;

/* 
 * �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��϶�.
       ���� ��� A = 150, B = 266, C = 427 �̶�� 
   A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
      ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 * 
 */

public class Problem2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result=1;
		int num[] = new int[3];
		int count[] = new int[10];
		
		for(int i=0; i<3; i++) {
			num[i] = scan.nextInt();
			result = result * num[i];
		}
		
		while(result>0) {
			count[result%10]++;
			result /=10;
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
