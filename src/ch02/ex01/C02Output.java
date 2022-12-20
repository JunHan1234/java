package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100);
		// 가로 안의 100이란 데이터는 parameter 이다. / constant가 아니다.
		// constant는 100이라는 값이 저장된 공간이다. 100자체는 literal(data)이다.
		System.out.println(score); // 가로 안의 variable "score"
		System.out.println(100 + 1); // 가로 안의 100 + 1을 보고 expression 이라 한다.
		System.out.println(Math.random());
		// method는 println(), random()과 같은 값을 말한다.
		// method는 return value가 있는것과 없는것으로 구분할 수 있다.

		System.out.print(200);
		System.out.print(300); // 줄바꿈 안함
		System.out.print('\n');
		// print()로 줄바꿈 하는 법,""로 가두면 String type, ''로 가두면 char type이다.
		System.out.print(400);
		System.out.println();

		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello"); // separator
		// boolean, character, decimal, float, string 순이다.

		// 과제: 위 출력문에서 구분자로 '/' 를 사용하라.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");

		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
		// width값을 정하는 법이다. '-'로 하면 왼쪽부터 값이 채워진다.

		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다.");
		// concatenate 사슬같이 잇는 형태의 코드조각이다.
		// snippet = ()속 코드조각을 뜻한다.
	}
}