package pak1;

public class Test01 {

	public static void main(String[] args) {
		/* �ִ� ���ϱ� */
		
		int arr[] = { 4, 13, 150, 17, -2, 32, 355, -234, 23423, -43534, 12 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println(max);
		
		/*
		 * int tmp = 0;
		 * 
		 * for(int j = 0; j < arr.length-1; j++) { for(int i = 0; i < arr.length-1 ;
		 * i++) { if (arr[i] < arr[i+1]) { tmp = arr[i]; arr[i] = arr[i+1]; arr[i+1] =
		 * tmp; } } } for(int i =0; i< arr.length; i++){ System.out.print(arr[i]+", ");
		 * }
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("�ִ� : " + arr[0]);
		 * 
		 * for(int j = 0; j < arr.length-1; j++) { for(int i = 0; i < arr.length-1 ;
		 * i++) { if (arr[i] > arr[i+1]) { tmp = arr[i]; arr[i] = arr[i+1]; arr[i+1] =
		 * tmp; } } } System.out.println("�ּڰ� : " + arr[0]);
		 */
		
		
	}
	
	

}
