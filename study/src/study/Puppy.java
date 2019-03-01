package study;

public class Puppy{
	   int puppyAge;
	   public Puppy(String name){
	      // 这个构造器仅有一个参数：name
	      System.out.println("Passed Name is :" + name ); 
	   }
	   
	   public Puppy(int age){
		      // 这个构造器仅有一个参数：name
		      System.out.println("Passed age is :" + age ); 
		   }
	   
	   public void setAge( int age ){
	       puppyAge = age;
	   }

	   public int getAge( ){
	       System.out.println("Puppy's age is :" + puppyAge ); 
	       return puppyAge;
	   }

	   /**
	 * @param args
	 */
	public static void main(String []args){
	      /* 创建对象 */
		  Puppy myPuppy1 = new Puppy( "tommy" );
	      Puppy myPuppy = new Puppy( "tommy" );
	      /* 通过方法来设定age */
	      myPuppy.setAge( 2 );
	      /* 调用另一个方法获取age */
	      myPuppy.getAge( );
	      /*你也可以像下面这样访问成员变量 */
	      System.out.println("Variable Value :" + myPuppy.puppyAge ); 
	   }
	}



