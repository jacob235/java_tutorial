package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {

	public static void main(String[] args) throws Exception{
		Calendar c = Calendar.getInstance();		// Calendar 객체생성하는 방법
//		 System.out.println(c);
//		 System.out.println("2019년 중 " + Calendar.DAY_OF_YEAR + "일 째");
		 String date = String.format("현재시간은 %tk시 : %tM분 : %tS초 %n", c,c,c);
		 System.out.println(date);
		 
		 System.out.printf("%f %n", Math.PI);
		 String f = String.format("%f", Math.PI);
		 System.out.println("----------------------------------------------");
		 StringBuffer sb = new StringBuffer();
//		 Formatter fm = new Formatter(sb);
//		 Formatter fm = new Formatter();
		 Formatter fm = new Formatter(System.out);		// 콘솔 창에 뜬다
//		 Formatter fm = new Formatter("sss.txt");	
		 // 만약 파일에 가서 기록을 하고 싶을 때 계속 자주가는것이 아니라 
		// 버퍼에 한 번에 모아서 한꺼번에 기록하는 기능(데이터를 모아놓는다) 
		 
		 fm.format("현재시간은 %tk시 : %tM분 : %tS초 %n", c,c,c);		
		 fm.format("%f %n", Math.PI);
		 System.out.println(sb); 								
		 fm.flush();											
		 System.out.println("main end");
		 
		 
		 
		// format형태인 fm이 sb에 연결이 되어있어서 StringBuffer로 가버림 sb에 기록이 됨
		// 내가 원하는 메세지를 파일로 보낼때 Formatter를 많이 쓴다.
		// 어떤 정보들을 포맷을 유지하면서 파일로 보내고 싶을 때 사용한다.
		// Formatter fm = new Formatter(sb); 의 sb에는 파일정보가 많이 온다.
		// log파일 만들때 주로 사용된다.
	}

}
