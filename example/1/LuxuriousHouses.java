import java.util.Scanner;


public class LuxuriousHouses {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num=scan.nextInt();

		int max;

		int []arr = new int [num];

		for (int i = 0; i <arr.length; i++) {

			arr[i]=scan.nextInt();
		}

		int res[] = new int [num];

		max=arr[arr.length-1];

		res[arr.length-1]=0;

		for (int i = arr.length-2; i >= 0; i--) {

			if(arr[i]>max){

				max = arr[i];

				res[i]= 0;

				//System.out.println("0");

			}

			else{

				res[i]=max-arr[i]+1;

				//System.out.println(max-arr[i]+1);

			}

		}

		for (int i = 0; i < res.length; i++) {

			System.out.print(res[i] + " ");

		}

	}

}