package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {

		//
		// 코드를 완성 하십시오.
		//
		int[] result = {arr[0], arr[1]};
		int a[][] = new int[arr.length-1][arr.length-1];
		int r = a[0][0];
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(i != j) {
					a[i][j-1] = arr[i] * arr[j];
					if(r < a[i][j-1]) {
						result[0] = arr[i];
						result[1] = arr[j];
					}
				}
			}
		}
		System.out.println("[" + result[0] + "," + result[1] + "]");
	}
}
