package 作业;

public class Xiaozuoye {
	private int i;
	private String sex;
	private String type;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// 水仙花数
	public void shuixianhua() {
		for (int i = 100; i <= 999; i++) {
			int a = i / 100;
			int b = (i % 100) / 10;
			int c = i % 10;
			if ((Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == i) {
				System.out.println(i + "是水仙花数");
			}

		}

	}

	// 最大公约数
	public void gongyueshu() {

		int i = 10;
		int j = 6;
		int k = i > j ? j : i;
		for (int m = k; m > 0; m--) {
			if (i % m == 0 && j % m == 0) {
				System.out.println(m + "是最大公约数");
				break;

			}

		}

	}

	// 最小公倍数
	public void gongbeishu(int i, int j) {

		int a = i * j;
		int b = i > j ? i : j;
		for (int c = b; c <= a; c++) {

			if (c % i == 0 && c % j == 0) {

				System.out.println(c + "是最小公倍数");
				break;
			}

		}

	}

	// 四个数能组成多少三位数
	public void san() {
		int[] a = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			int b = a[i];
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					int c = a[j];

					for (int k = 0; k < a.length; k++) {
						if (k != j && k != i) {
							int d = a[k];
							int e = b * 100 + c * 10 + d;

							System.out.print(e+",");
						}

					}
				}
			}

		}

	}

}
