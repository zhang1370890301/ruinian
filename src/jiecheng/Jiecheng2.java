package jiecheng;

public class Jiecheng2 {
	private long i;

	public long getI() {
		return i;
	} 

	public void setI(long i) {
		this.i = i;
	}

	public void setShuzi() {
		long i=1;
		for (int j = 1; j <= 20; j++) {
			i = i * j;
		}
		System.out.println(i);

	}

}
