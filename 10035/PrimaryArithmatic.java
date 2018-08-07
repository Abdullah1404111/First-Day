import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			int n1 = input.nextInt();
			int n2 = input.nextInt();
			if (n1 == 0 && n2 == 0)
				break;

			int tc = 0;
			int c = 0;
			while (n1 != 0 || n2 != 0) {
				int sum = c + n1 % 10 + n2 % 10;
				if (sum >= 10)
					++tc;
				c = sum / 10;
				n1 /= 10;
				n2 /= 10;
			}
			if (tc == 0)
				System.out.println("No carry operation.");
			else if (tc == 1)
				System.out.println("1 carry operation.");
			else
				System.out.println(tc + " carry operations.");
		}
	}
}