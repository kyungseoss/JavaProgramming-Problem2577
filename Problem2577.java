package problem2577;

import java.util.Scanner;

/* 
 * 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하라.
       예를 들어 A = 150, B = 266, C = 427 이라면 
   A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
      계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
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
