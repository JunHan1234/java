package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; // 허용값 초과로 compile error다.
		byte b = 127; // byte를 십진수로 가득 채운 값이다.
		//b = b + 1; // 128값을 byte type b에 write 할 수 없으므로 compile error가 뜬다.
		
		b++; // binary상에서 1이 증가한 값이 b에 write 된다. => -128
		b++; // -127
		System.out.println(b);
	}

}
