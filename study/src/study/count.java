package study;

import java.lang.annotation.Retention;

public class count {
    public  count(int a) {
        a=a+1;
    	System.out.println("a=" + a);
    }
    public int sum(int a) {
    	System.out.println("aa="+a);
    	return a;
    }
    public static void main(String []args) {
    	count count1 = new count(3);
    	count count2 = new count(4);
    	count1.sum(4);
    	count2.sum(3);
    }
}
