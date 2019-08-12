package BaekJun;

import java.lang.reflect.Array;
import java.util.*;



class Edge{
	int from, to;
	Edge(int from, int to){
		this.from = from;
		this.to = to;
	}
}
public class ex_13023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n이 정점 개수
		int m = sc.nextInt();
		
		boolean[][] a = new boolean[n][n];
		ArrayList<Integer>[] g = (ArrayList<Integer>[]) new ArrayList[n];
		ArrayList<Edge> edges = new ArrayList<Edge>();
		for(int i = 0; i < n; i++) {
			g[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
		}
	}

}
