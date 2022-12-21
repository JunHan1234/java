package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|" + " a happy ".trim() + "|";
		//data 뒤에 . 을 입력하면 해당 class에서 사용가능한 method들이 표시된다.
		//trim method로 문자열 처음과 끝의 space를 제거한다.
		s = s.concat(" dog"); //concat method는 주어에 목적어를 붙이는 역할을 한다. "|a happy| dog"
		s = s.substring(2); // 2 index 미만의 문자열을 잘라내기 한다. 0과 1 index 삭제한다. " happy| dog"
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));
		
		int i = "apple".codePointAt(0); // codePointAt으로 0번째 문자열에 해당하는 unicode 값을 출력한다.
		i = "a".hashCode(); // "a"의 unicode값을 출력한다.
		i = "b".hashCode();
		i = "c".compareTo("a"); // 앞 unicode값 - 뒤 unicode값을 출력한다. "99 - 97 = 2"
		i = "a".compareTo("b"); // 활용해서 음수값을 출력할 수도 있다.
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a"); // 대소문자 무시한 값을 비교하고 빼서 출력한다.
		i = s.indexOf("l"); //s = "hello"; 의 첫번째 index의 l이 어디에 위치하는지 출력한다.
		i = s.lastIndexOf("l"); // 문자열의 마지막 l의값이 어디에 위치하는지 출력한다.
		i = s.length(); // 문자열의 길이를 측정한다.
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de"); // s의 문자열이 "de"로 시작하는지 판단한다.
		b = s.endsWith("lop"); // s의 문자열이 "lop"으로 끝나는지 판단한다.
		b = s.equals("develop"); // b와 s의 문자열이 같은지 다른지 boolean으로 출력한다.
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop"); //대소문자를 무시하고 판단한다.
		b = "".isEmpty(); // 문자열이 완벽히 공백인지 판단한다.
		b = s.matches("[a-zA-Z]*"); // 변수 s의 문자열이 대소문자 알파벳인지 판단한다.
		b = s.matches("[0-9]*"); // 변수 s의 문자열이 숫자 0~9로 이루어져있는지 판단한다.

		System.out.println(b);
		
	}
}