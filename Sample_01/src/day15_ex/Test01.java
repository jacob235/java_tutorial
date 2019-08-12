package day15_ex;

import util.Myutil;
import static util.Myutil.rightPad;

public class Test01 {

	public static void main(String[] args) {
		
		Myutil u = new Myutil();
		
		String s = u.leftPad("ejb", 15, '^');		// instance method
		
		System.out.println(s);
		
		System.out.println(util.Myutil.rightPad("java", 10, '#'));		// static method
		
		System.out.println(rightPad("java", 10, '#'));
		
		System.out.println(Myutil.add(5, 7));
	}

}
