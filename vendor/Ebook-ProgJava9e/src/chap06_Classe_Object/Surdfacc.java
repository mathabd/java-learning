package chap06_Classe_Object;

public class Surdfacc {
	public static void main(String args[]) {
		A1 a = new A1();
		a.g();
		System.out.println("--- dans main");
		int n = 2;
		float x = 2.5f;
		a.f(n);
		a.f(x);
	}
}

class A1 {
	public void f(float x) {
		System.out.println("f(float) x = " + x);
	}

	private void f(int n) {
		System.out.println("f(int) n = " + n);
	}

	public void g() {
		int n = 1;
		float x = 1.5f;
		System.out.println("--- dans g ");
		f(n);
		f(x);
	}
}
