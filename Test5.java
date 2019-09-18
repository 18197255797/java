
//6. 输出一个整数的每一位.*/
// import java.util.Scanner;
// public class Test4{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("请输入一个三位数字");
//     int num = sc.nextInt();
//     int i , j , k ;
//     i = num/100;
//     j = num/10%10;
//     k = num %10;
//     System.out.println("百位="+i);
//     System.out.println("百位="+j);
//     System.out.println("百位="+k);
//   }
// }
//4. 写一个函数返回参数二进制中 1 的个数
//比如： 15 0000 1111 4 个 1
// import java.util.Scanner;
//  public  class Test5{
//     public static void main(String[] args) {
        
//         System.out.println("请输入数字");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int result = Demoll;
//         System.out.println(result);
//     }
//     public int Demoll(int n ) {
//     int count= 0;
//     //int j=num>>1;
//     while(n!=0){
//          count++;
//         n = n&(n-1);
//     }
//   return count;
// }
// }
//*5. 获取一个数二进制序列中所有的偶数位和奇数位，
//分别输出二进制序列。
import java.util.Scanner;
  public  class Test5{
   public static void main(String[] args) {
        
        System.out.println("请输入数字");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int i =0;
         System.out.println("奇数序列：");
         for(i=30;i>=0;i-=2){
           System.out.print((num>>i)&1);//最高的奇数位右移30位&1
         }
         System.out.println();
         System.out.println("偶数序列：");
         for(i=31;i>=1;i-=2){
          System.out.print((num>>i)&1);//最高的偶数位右移31位&1
        }
   }
  }
  