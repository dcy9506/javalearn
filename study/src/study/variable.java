package study;
public class variable{
   // �����Ա����������ɼ�
   public String name;
   // ˽�б��������ڸ���ɼ�
   private double salary;
   //�ڹ������ж�name��ֵ
   public variable (String empName){
      name = empName;
   }
   //�趨salary��ֵ
   public void setSalary(double empSal){
      salary = empSal;
   }  
   public static int staticVariable=1;
   // ��ӡ��Ϣ
   public void printEmp(){
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   public static void main(String args[]){
      variable empOne = new variable("Ransika");
      empOne.setSalary(10010);
      empOne.printEmp();
   }
}
