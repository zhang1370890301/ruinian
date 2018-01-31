package maopao;

public class maopao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 1, 30, 25, 90,3};
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length -1-i; j++) {
				if (a[j] < a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}

			}
			for (int b : a) {
				System.out.print(b + ",");
			}
			System.out.println();
		}

	}

}
