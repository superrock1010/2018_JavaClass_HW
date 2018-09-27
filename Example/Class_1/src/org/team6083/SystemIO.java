package org.team6083;

import java.util.Scanner;

public class SystemIO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		//宣告名稱為in 的scanner
		int a = in.nextInt(); //讀取一個整數
		System.out.println("輸入的整數為: "+a);//輸出並換行
		System.out.print("我");
		System.out.print("沒換行");
		//這樣會輸出“我沒換行”
	}

}
