
//1. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
// public class Test4{
//     public static void main(String[] args) {
//         int i ;
//         int count=0;
//         for(i=1;i<=100;i++){
//             if(i%10==9||i/10==9){
//                 System.out.println(i);
//                 count++;
//             }
//         }        
//         System.out.println(count);
//     }
// }
// 求出0～999之间的所有“水仙花数”并输出。
//(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
// public class Test4{
//     public static void main(String[] args) {
//     int i,j,k,n; 
  
//         for(n=100;n<=999;n++){
//         i=n%10;//得到个位上的数
//         j=n/10%10;//得到十位上的数
//         k=n/100;    //	得到百位上的数
//            if(k*100+j*10+i==i*i*i+j*j*j+k*k*k){
//                System.out.println(n);
//             }
//         }
//     }
// }
//3. 编写代码模拟三次密码输入的场景。
//最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
//可以重新输入，最多输入三次。三次均错，则提示退出程序
//public class Test4{
  
// import java.util.Scanner;

//   public class Test4{
//      public static void main(String[] args) {       
//         String password="root";
//         int j=3;
//         Scanner in = new Scanner(System.in); 
//         while(j!=0){
//           System.out.println("请输入密码");
//           String p = in.nextLine();//输入
//           if(p.equals(password)){//比较，且相同
//             System.out.println("欢迎进入系统");
//             break;
//           }else{
//                   j--;
//                   System.out.println("输入错误，还有"+j+"次机会");
//                 }  
//           if(j==0){
//                   System.out.println("退出程序");         
//          }        
//      }
//    }
// }
//4.完成猜数字游戏
import java.util.Random;
import java.util.Scanner;
public class Test4{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //输入，开辟空间
    Random random = new Random();//生成随机数
    int togess = random.nextInt(100);//nextInt整数 把随机生成的数字赋给要猜的数字
    while(true)
    {
      System.out.println("请输入数字Num(1-100)");
      int num = scanner.nextInt();//玩家输入数字(整数)
      if(num>togess){
        System.out.println("猜大了");
      }
      if(num<togess){
        System.out.println("猜小了");
      }
      if(num==togess){
        System.out.println("恭喜你，猜对了");
        break;
      }
    }
    scanner.close();
  }
}
    
        





















