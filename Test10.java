// class Person {
//     public int age;//成员属性 实例变量
//     public String name1="小心",name2="小明";
//     public String sex;
//     public void eat() {//成员方法
//       System.out.println("吃饭!"+name1);
//   }
//     public void sleep() {
//       System.out.println("睡觉!");
//   }
//      void sayhello(){
//       System.out.println(name1+"你好，我是"+name2);
//   }
//  }
// public class Test10{
//   public static void main(String[] args) {
      
//       Person person = new Person();//通过new实例化对象
//       person.eat();//成员方法调用需要通过对象的引用调用
//       person.sleep();
//       person.sayhello();
     
//         //产生对象     实例化对象
//       Person person2 = new Person();
//       Person person3 = new Person();
//   }
// }
// class Person {
// public String name = "张三";
// public int age = 18;

//  }
//  class Test10 {
//  public static void main(String[] args) {
//     Person person = new Person();
//     System.out.println(person.name);
//     System.out.println(person.age);
//  }
//  }
class Person {
    public int age = 18;
    public String name = "张三";
    public void show() {
    System.out.println("我叫" + name + ", 今年" + age + "岁");
}
 }
 class Test10{
 public static void main(String[] args) {
 Person person = new Person();
 Person person2 = new Person(); 
  person2.name = "李四"; 
  person2.age = 20; 
  person2.show();
  person.show();
 }
 }