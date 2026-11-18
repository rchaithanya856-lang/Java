package Training;

public class ThreeFunctionAdd {
	public static void main(String[] args) {
		add(20,30);
	}
	static void add(int a,int b) {
		System.out.println(a+b);
		add(10,20,30);
	}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
		add(10,20,30,40);
	}
	static void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
}
