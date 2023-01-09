package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>();
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(Autobot autobot: corps) {
			autobot.run();
			autobot.fight();
			//autobot.guard(); //Bumblebee 객체만 가능한 method.
			
			if(autobot instanceof Bumblebee bot) bot.guard();
			if(autobot instanceof Prime bot) bot.command();
		}
	}
}
