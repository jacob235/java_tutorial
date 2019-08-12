package day10;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("java progRamING".equals("java progRamING"));
		System.out.println("java progRamING".equals("JAVA progRamING"));
		System.out.println("java progRamING".equalsIgnoreCase("JAVA ProgRAming"));
		System.out.println("java progRamING".equalsIgnoreCase("JAVA"));
		System.out.println("java progRamING".equals("JAVA"));
		System.out.println("java progRamING".toUpperCase().contains("JAVA"));
		System.out.println("java progRamING".toLowerCase().contains("JAVA".toLowerCase()));
	}

}
