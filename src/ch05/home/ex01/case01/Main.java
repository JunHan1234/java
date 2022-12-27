package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		flower1.flowerName = "창포꽃";
		flower1.petalCentimeter = 7;
		flower1.sepalCentimeter = 2;
		
		flower2.flowerName = "코스모스";
		flower2.petalCentimeter = 4;
		flower2.sepalCentimeter = 1;
		
		//System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.\n", flower1.flowerName, flower1.petalCentimeter, flower1.sepalCentimeter);
		//System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.\n", flower2.flowerName, flower2.petalCentimeter, flower2.sepalCentimeter);
	}	//printf는 확인용도의 출력이다.
}
/*
창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm 입니다.
코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm 입니다.
*/