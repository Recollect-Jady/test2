package test.A;

public class Main {

	public static void main(String[] args) {
		C c = new C();
	
		B b = new B();
		b.setC(c);
		
		A a = new A();
		a.setB(b);
		a.a();
		
	}

}
