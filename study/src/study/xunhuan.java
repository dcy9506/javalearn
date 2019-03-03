package study;
import java.io.*;
import java.util.Scanner;

public class xunhuan {
	public xunhuan(int b) {
		int c=0;
		while(b>=1) {	
			c=c+b;
			b-=1;
			
		}
		System.out.print("c=" +c +"\n");
	}
	
	public int qiuji(int i) {
		 
		int y=1;
		while (i>0) {
			y=y*i;
			i-=1;
			
		}
		System.out.println("y="+y);
		return y;
	}
	
//	public static void main(String []as) throws IOException{
//		System.out.print("Enter a int:"); 
//	    int k = (int) System.in.read(); 
//		xunhuan c1 =new xunhuan(k);	
//		c1.qiuji(k);
//	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int length=input.nextInt();//输入一个整数
		System.out.println("输入的整数是："+length);
		xunhuan c2 = new xunhuan(length);
		c2.qiuji(length);
		
		}
}












