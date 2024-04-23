package Array;

public class DuplicateArray {

	public static void main(String[] args) {
		int s[] = new int[8];
		s[0] = 8;
		s[1] = 4;
		s[2] = 8;
		s[3] = 7;
		s[4] = 4;
		s[5] = 1;
		s[6] = 2;
		s[7] = 7;
		System.out.println("duplicate elements in array are :");
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					System.out.println(s[j]);
				}
			}
		}

	}
}
