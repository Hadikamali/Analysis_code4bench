import java.util.*;

public class b {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		Pair[] a = new Pair[n];

		for (int i = 0; i < n; ++i)

			a[i] = new Pair(in.nextLong(), in.nextLong(), n);

		Arrays.sort(a);

		for (int i = 0; i < n; ++i) {

			int count = 0;

			for (int j = 0; j < n; ++j) {

				if (a[j].b >= a[i].b)

					++count;

				a[i].arr[j] = count;

			}

		}

		long vol = 0, x = 0, y = 0;

		for (int i = 0; i < n; ++i)

			for (int j = 0; j <= i; ++j)

				if (a[i].a * a[j].b * a[j].arr[i] > vol) {

					vol = a[i].a * a[j].b * a[j].arr[i];

					x = a[i].a;

					y = a[j].b;

				}

		System.out.printf("%d\n%d %d\n", vol, x, y);

		in.close();

	}

	public static class Pair implements Comparable<Pair> {

		long a, b;

		long[] arr;

		Pair(long i, long j, int n) {

			a = Math.max(i, j);

			b = Math.min(i, j);

			arr = new long[n];

		}

		public int compareTo(Pair p) {

			return -Long.compare(a, p.a);

		}

	}

}