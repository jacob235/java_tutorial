package day09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class test02_String {

	public static void main(String[] args) {
		String msg = "java programming/23000";
		System.out.println(msg.indexOf("/"));
		
		
		String d1 = msg.substring(0, msg.indexOf("/"));
		String d2 = msg.substring(msg.indexOf("/")+1);
		System.out.println(d1);
		System.out.println(d2);
		
		String url = "http://127.0.0.1:8080/web1/list.do";
		System.out.println(url.lastIndexOf('/'));
		String url_last = url.substring(url.lastIndexOf('/'));
		System.out.println(url_last);
		
		System.out.println(url.contains("web1"));
		
		String data = "2019001_홍길동/90_70/100";
		System.out.println(data);
		System.out.println(data.replace('_', '/'));		// _ 을 /로 대체한다.
		data = data.replace('_', '/');
		String[] sdata = data.split("/");
		System.out.println(Arrays.toString(sdata));
		System.out.println("=============================================================");
		data = "2019_홍길동/ 90_70/100";
		StringTokenizer st = new StringTokenizer(data, "/_");		// _ , / 모두 구분지어서 쪼개준다.
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.print(st.nextToken() + " ");
		}
		System.out.println();
		System.out.println("=============================================================");

		
		
		String data1 = " 홍길동 / 이순신/김유신 /박철 ";
		
		String[] name = data1.split("/");
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i].trim().charAt(0));
			for(int j = 0 ; j < name[i].trim().length()-1; j++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
	}
}
