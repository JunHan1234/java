package ch02.ex02;

public class C05String {
	public static void main(String[] args) {
		// text block
		String comment = """
				이 식당에 방문하길 잘했네요.
				"참 맛있다."
				라는 말이 절로 나오네요.
				""";
		System.out.println(comment);
		// text block 앞부분 들여쓰기는 모두 무시되는것을 확인한다.
		
		String color = """
				red  
				green
				blue 
				""";
		System.out.println(color);
		//space로 만든 값들은 모두 collapse(trim) 되어버린다.
		
		color = """
				red  \s
				green\s
				blue \s
				""";
		System.out.println(color);
		// \s를 넣음으로써 width 값을 통일했다.
		
		String type = "int";
		String code = """
				public void print(""" + type + """
				 val)
				 System.out.println(val);
				)""";
		System.out.println(code);
		
		code = """
				<html>
					<body>
						<p>Hello, Java</p>
					</body>
				</html>           """; //""" 뒤에 아무릴 space를 넣어도 wrapping 돼버린다.
		System.out.println("|" + code + "|");
	}
}
