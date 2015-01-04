import java.util.*;

public class BitSolution {
	public static boolean question(char ch , int i) {

	    	char[] verify_arr = {193, 35, 9, 33, 1, 9, 3, 33, 9, 225};
      		char k = (char)((((ch << 5) | (ch >> 3)) ^ 111) & 255);
      		return (char)verify_arr[i] == k;
  	}

	public static void main(String[] args) {

		String alphabeta = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_ !@#$%";
		char[] alphabet = alphabeta.toCharArray();
		for (int i = 0; i < 10; i++) {
			for (char c : alphabet) {
				if (question(c , i)) {
					System.out.print(c);
					break;
				}
			}
		}
		System.out.println();
	}

}
