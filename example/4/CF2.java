import java.util.Scanner;



public class CF2

{

	public static void main(String[] args)

	{

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int parts = 0;

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)

			arr[i] = scan.nextInt();

		int changes = 0;

		while (parts < n)

		{

			for (int i = 0; i < n && parts < n; i++)

			{

				if (arr[i] <= parts)

				{

					parts++;

					arr[i] = Integer.MAX_VALUE;

					if (i == n-1 && parts == 0)

						changes--; //if it starts at the end

				}

			}

			if (parts == n)

				break;

			changes++;

			for (int i = n-1; i >= 0 && parts < n; i--)

			{

				if (arr[i] <= parts)

				{

					parts++;

					arr[i] = Integer.MAX_VALUE;

				}

			}

			if (parts == n)

				break;

			changes++;

		}

		System.out.println(Math.max(0, changes));

		scan.close();

	}

}