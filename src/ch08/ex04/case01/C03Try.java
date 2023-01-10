package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null; //PrintWriter class를 이용해 출력장치로 file을 쓸 수 있다.
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt")); //해당 경로에 파일이 생성됨을 try블럭 실행 후 확인할 수 있다.
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			out.print("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		} finally { //try 블럭이 온전히 실행되건 아니건 실행.
			if(out != null) out.close(); //close()는 앞에있는 객체를 즉시 없애버린다. 여기선 try를 없앤(끈)다.
		} //finally는 무조건 해야한다. 안하면 객체가 그대로 남아 사고위험이 있다.
		
		System.out.println("end.");
	}
}
