package com.example.thedarksideofthesubway;


public class MatrixMadness {
	
	public static int[][] regularMatrix = new int[47][47];
	
	public static void generateNormalMatrix() {
		
		for(int i = 0; i < 45; i++) {
			for(int j = 0; j < 45; j++) {
				regularMatrix[i][j] = 100;
			}
		}
		
		regularMatrix[0][0] = 0;
		
		for(int i = 1; i < 45; i++) {
			for(int j = 1; j < 45; j++) {
				regularMatrix[i][i] = 0;
				if(i < 5 && j < 5) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 6;
				} else if(i >= 5 && j >= 5 && i < 10 && j < 10) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 4;
				} else if(i >= 10 && j >= 10 && i < 14 && j < 14) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 6;
				} else if(i >= 14 && j >= 14 && i < 15 && j < 15) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 4;
				} else if(i >= 15 && j >= 15 && i < 20 && j < 20) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 6;
				} else if(i >= 20 && j >= 20 && i < 21 && j < 21) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 21 && j >= 21 && i < 27 && j < 27) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 7;
				} else if(i >= 27 && j >= 27 && i < 28 && j < 28) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 28 && j >= 28 && i < 31 && j < 31) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 7;
				} else if(i >= 31 && j >= 31 && i < 32 && j < 32) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 32 && j >= 32 && i < 34 && j < 34) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 4;
				} else if(i >= 34 && j >= 34 && i < 35 && j < 35) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 35 && j >= 35 && i < 36 && j < 36) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 4;
				} else if(i >= 36 && j >= 36 && i < 37 && j < 37) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 37 && j >= 37 && i < 43 && j < 43) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 4;
				}
			}
		}
		
		regularMatrix[20][5] = 6;
		regularMatrix[24][10] = 7;
		regularMatrix[5][20] = 6;
		regularMatrix[4][23] = 7;
		regularMatrix[16][35] = 4;
		regularMatrix[16][36] = 4;
		regularMatrix[14][33] = 7;
		regularMatrix[8][37] = 4;
		regularMatrix[8][38] = 4;
		regularMatrix[10][24] = 7;
//		
//		for(int i = 0; i < 45; i++) {
//			for(int j = 0; j < 45; j++) {
//				System.out.print(regularMatrix[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	public static void generateOddMatrix() {
		
		for(int i = 0; i < 45; i++) {
			for(int j = 0; j < 45; j++) {
				regularMatrix[i][j] = 100;
			}
		}
		
		regularMatrix[0][0] = 0;
		
		for(int i = 1; i < 45; i++) {
			for(int j = 1; j < 45; j++) {
				regularMatrix[i][i] = 0;
				if(i < 5 && j < 5) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 8;
				} else if(i >= 5 && j >= 5 && i < 10 && j < 10) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 9;
				} else if(i >= 10 && j >= 10 && i < 14 && j < 14) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 8;
				} else if(i >= 14 && j >= 14 && i < 15 && j < 15) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 9;
				} else if(i >= 15 && j >= 15 && i < 20 && j < 20) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 8;
				} else if(i >= 20 && j >= 20 && i < 21 && j < 21) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 21 && j >= 21 && i < 27 && j < 27) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 8;
				} else if(i >= 27 && j >= 27 && i < 28 && j < 28) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 28 && j >= 28 && i < 31 && j < 31) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 10;
				} else if(i >= 31 && j >= 31 && i < 32 && j < 32) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 32 && j >= 32 && i < 34 && j < 34) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 9;
				} else if(i >= 34 && j >= 34 && i < 35 && j < 35) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 35 && j >= 35 && i < 36 && j < 36) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 9;
				} else if(i >= 36 && j >= 36 && i < 37 && j < 37) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 0;
				} else if(i >= 37 && j >= 37 && i < 43 && j < 43) {
					regularMatrix[i][i - 1] = regularMatrix[i - 1][i] = 9;
				}
			}
		}
		
		regularMatrix[20][5] = 8;
		regularMatrix[24][10] = 8;
		regularMatrix[5][20] = 8;
		regularMatrix[4][23] = 8;
		regularMatrix[16][35] = 9;
		regularMatrix[16][36] = 9;
		regularMatrix[14][33] = 8;
		regularMatrix[8][37] = 9;
		regularMatrix[8][38] = 9;
		regularMatrix[10][24] = 8;
		
		for(int i = 0; i < 45; i++) {
			for(int j = 0; j < 45; j++) {
				System.out.print(regularMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] getMatrix() {
//		generateNormalMatrix();
//		generateOddMatrix();
		return regularMatrix;
	}
}
