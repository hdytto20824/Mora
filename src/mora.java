import java.util.Scanner;

public class mora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�п�J:1=�ŤM 2=���Y 3=��\n");
		int p1 = scanner.nextInt();

		if (p1 <= 3 && p1 >= 1) {
			System.out.println("�п�J:1=�ŤM 2=���Y 3=��");
			int p2 = scanner.nextInt();

			if (p2 <= 3 && p2 >= 1) {
				if (p1 == p2)
					System.out.println("Deuce");
				else if (p1 == 1 && p2 == 2)
					System.out.println("P2 WIN");
				else if (p1 == 2 && p2 == 3)
					System.out.println("P2 WIN");
				else if (p1 == 3 && p2 == 1)
					System.out.println("P2 WIN");
				
				else if (p1 == 1 && p2 == 3)
					System.out.println("P1 WIN");
				else if (p1 == 2 && p2 == 1)
					System.out.println("P1 WIN");
				else if (p1 == 3 && p2 == 2)
					System.out.println("P1 WIN");
			} else
				System.out.println("���~");
		} else
			System.out.println("���~");
	}
}