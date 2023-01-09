package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C "; // (객체 instanceof class)
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A "; // A는 interface이기 때문에 compile error 안뜸.
		if(b instanceof Object) msg += "Object";
		System.out.println(msg);
		
		// if(b instanceof F) b는 F type을 가질 가능성이 없으므로 compile error.
		// if(c instanceof F)
		
		F f = new F();
		msg = "";
		// if(f instanceof C)
		if(f instanceof A) msg += "A "; // A는 interface이기 때문에 그냥 쓸 수 있다.
		if(f instanceof Object) msg += "Object";
		System.out.println(msg);
	}
}
