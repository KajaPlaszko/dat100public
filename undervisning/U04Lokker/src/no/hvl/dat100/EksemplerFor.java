package no.hvl.dat100;

public class EksemplerFor {

	public static void main(String[] args) {

		// a)

		int x = 3;
		int a = 4;
		int z = 10;

		for (int i = 1; i <= x; i++) {
			a = a + z;
		}

		System.out.println("a = " + a);

		// b)

		for (int i = 0; i < 6; i++) {
			
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
		}

	}

}
