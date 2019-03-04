package study;


public class count {
	int y =0;
    public  count(int a) {
        a=a+1;
    	System.out.println("a=" + a);
    }
    public int sum(int a) {
    	a=a+variable.staticVariable;
    	System.out.println("aa="+a);
    	return a;
    }
    int chu(int x1,int x2) {
    	y=x1%x2;
    	System.out.println("ÓàÊıÊÇ£º"+y);
    	return y;
    }
    public static void main(String []args) {
    	count count1 = new count(3);
    	count count2 = new count(4);
    	count count3 = new count(3);
    	count3.chu(30,15);
    	count1.sum(4);
    	count2.sum(3);
    }
}
