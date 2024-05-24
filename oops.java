//   Opps concept in java

/*  1.Class
 *  2.inheritance
 *  3.Polymorpism
 *  4.Abstraction
 *  5.Constructor
 */

// class is a blueprint or templet
// object is a instance of class
/*class Student {
   int id;
   String name;
   int salary;

   void PrintDetail() { // <-----------This is a Method
      System.out.println("My Name :" + name);
      System.out.println("My id :" + id);
   }

   public int getSalary() {
      return salary;
   }

}

public class Apna {
   public static void main(String[] args) {
      Student info = new Student();
      Student info2 = new Student();
      info.name = "gopal";
      info.id = 12;

      info2.name = "hemil";
      info2.id = 40;
      info2.salary = 4000;

      System.out.println("This is a first code in (OOPS) concept");
      info.PrintDetail();
      info2.PrintDetail();
      int salary = info2.getSalary();
      System.out.println("Salary :  " + salary);

      // System.out.println(info.name);
      // System.out.println(info.id);
   }
}*/

/*class Student1{
   int salary;
   String name;

   public int getSalary(){
      return salary;
   }
   public String getName(){
      return name;
   }
   public void setName(String n){
      name=n;
     
   }


}
public class Apna{
   public static void main(String[] args) {
      Student1 r1=new Student1();
      r1.salary=233;
      r1.name="Gopal";
      System.out.println(r1.getSalary());
      System.out.println(r1.getName());
   }
}*/

/*class Cellphone{
  

  public void callRing(){
   
      System.out.println("Ringing .......");
     
   }
  public void callVibrate(){
      System.out.println("Vibrating .......");
   }
   public void frendCall(){
      System.out.println("calling muklu");
   }
}
public class Apna{
   public static void main(String[] args) {
      Cellphone vivo =new Cellphone();
      
   vivo.callRing();
   vivo.callVibrate();
   vivo.frendCall();
      
  
   }
}*/

/*class  Square{                                //  class Square  a*a
   int a;
   public void printSquare(){
      System.out.println("Square Of Number :  " + a*a);
   }
}
class Side{                                         //class   side a*b
   int a;
   int b;
   public void printSide(){
      System.out.println("Side Of Number :" + a*b);
   }
}
class Perimetr{                                            //class perimeter 4*a
   int a;                            

   public int printPerimeter(){
      return 4*a;
   }
}



public class Apna{                                            //  main class in file name 
   public static void main(String[] args) {                   //  main mehtod
      Square sr=new Square();
      sr.a=5;
      sr.printSquare();

      Side mul=new Side();
      mul.a=5;
      mul.b=2;
      mul.printSide();

      Perimetr pe=new Perimetr();
      pe.a=3;
      System.out.println(pe.printPerimeter());

      
   }
}*/

//  Constructor  in java
/*class Employee {
   String name;
   int age;
   public void printCon() {
      System.out.println(this.name + " " + this.age);

   }
   // Employee(){                         //Non-perametrize Constructor ()
   // System.out.println("Constructor......");
   // }
    Employee(String name, int age) {      //Parametrize Constructor Employe(String name,int age)
       this.name = name;
       this.age = age;
   // Employee(Employee co2){                //copy -constuctor
   //    this.name=co2.name;
   //    this.age=co2.age;

   }
   Employee(){
   }
}
class Apna {
   public static void main(String[] args) {
      Employee co = new Employee("gopal",19);
      // co.name="jay";
      // co.age=20;
      // Employee co2=new Employee(co);
    
      co.printCon();
   }
}*/

//  Polymorphism

/*class Student2{
   int age;
   String name;
   public void printInfo(String name){
      System.out.println(name);
   }
   public void printInfo(int age){
      System.out.println(age);
   }
   public void printInfo(String name,int age){
      System.out.println(name+" "+age);
   }
}

public class Apna{
   public static void main(String[] args) {
      Student2 ob=new Student2();
      ob.name="gopal gohel";
      ob.age=34;
      ]lgfqob.printInfo(ob.name,ob.age);
      
   }
}*/
// class Apna{
//    public static void main(String args[]){
//       int a;int b;
//     System.out.println(Math.pow(2,10));
//    }
// }
//  2D Arra
/*   class Apna{
  public static void main(String[] args) {
   int mark[][]=new int [2][3];
   mark[0][0]=10;
   mark[0][1]=20;
   mark[0][2]=90;

   mark[1][0]=30;
   mark[1][1]=40;
   mark[1][2]=50;
   for(int i=0;i<2;i++){
      for(int j=0;j<3;j++){
         System.out.print(mark[i][j]+" ");
      }
   System.out.println();
     
   }
  }
}*/
/*class Apna{
   public static void main(String[] args) {
      String s1=new String("You cannot change me");
      // s1.concat("Fall");
      String s2=new String("You cannot change me");
      // s2.concat("Spring");
      // System.out.println(s1);
      // System.out.println(s2);
      // System.out.println(s1==s2);False
      String s3="You cannot change me";
      // System.out.println(s1==s3); false
      // String s4="You cannot change me";
      // String s5=s4+"You canchange";
      // System.out.println(s3==s5);

   }
}*/
/* 
class Apna{
   public static void main(String[] args) {
      int mark[][]=new int [4][5];
      mark[0][0]=33;
      mark[0][1]=34;
      mark[0][2]=40;
      mark[0][3]=41;
      mark[0][4]=42;


      mark[1][0]=40;
      mark[1][1]=40;
      mark[1][2]=40;
      mark[1][3]=40;
      mark[1][4]=40;

      
      mark[2][0]=40;
      mark[2][1]=40;
      mark[2][2]=40;
      mark[2][3]=40;
      mark[2][4]=40;

      
      mark[3][0]=40;
      mark[3][1]=40;
      mark[3][2]=40;
      mark[3][3]=40;
      mark[3][4]=40;

      for(int i=0;i<4;i++){
         for(int j=0;j<5;j++){
            System.out.print(mark[i][j]+" ");
         }
         System.out.println();
      }
   }
}*/