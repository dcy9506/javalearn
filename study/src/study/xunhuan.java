package study;

public class xunhuan {
	public xunhuan(int b) {
		int c=0;
		while(b>=1) {	
			c=c+b;
			b-=1;
			
		}
		System.out.print("c=" +c +"\n");
	}
	
	public int qiuji(int q) {
		int y=1;
		while (q>0) {
			y=y*q;
			q-=1;
		}
		System.out.println("y="+y);
		return y;
	}
	
	public static void main(String []as) {
		xunhuan c1 =new xunhuan(21);	
		c1.qiuji(10);
	}
}
