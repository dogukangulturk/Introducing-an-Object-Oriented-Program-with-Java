package ch02;

public class ValuesOfExpressions {

	public static void main(String[] args) {
		int k = 2_147_483_647; // Max limit int
		int i = k + 1;
		System.out.println(i);

		// That's not an unreachable code :)
		int a = 15;
		int m;
		if (a < 11)
			m = 7;

		System.out.println();

		// System.out.println(m);
	}
}
