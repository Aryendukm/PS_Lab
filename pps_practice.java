
public class pps_practice {

	public static void main(String[] args) {
		int x = 3;
		int p=1;
		for(int j=1;j<x;j++) {
			p=p+fact(j);
		}
		System.out.println(p);

	}
	
	static int fact (int n) {
		int z=1;
		for(int i=1;i<=n;i++) {
			z=z*i;
		}
		return z;
	}

}
