package day08;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[][] value = new int[20][20];
        int a = 0, b = 0;
        for(int i = 0; i < n; i++){
            a = input.nextInt();
            b = input.nextInt();
            for(int j = 1; j < 20; j++) {
            	if(value[a][j] == 0)
            		value[a][j] = 1;
            	else value[a][j]++;
            	}
            
            for(int j = 1; j < 20; j++) {
            	if(value[j][a] == 0)
            		value[j][a] = 1;
            	else value[j][a]++;
            	}
           }
        
        for(int i = 1; i < 20; i++) {
        	for(int j = 1; j <20; j++) {
        		if(value[i][j] == 1) {
        			value[i][j] = 0;
        		}
        		if(value[i][j] == 2) {
        			value[i][j] = 1;
        		}
        	}
        }
				
        for(int i = 1; i < 20; i++) {
        	for(int j = 1; j< 20; j++) {
                System.out.print(value[i][j] + " ");
        	}
        	System.out.println();
        }
        

        
	}

}
