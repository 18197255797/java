// public class Test8 {
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// // 方法的调用
// int ret = add(a, b);
// System.out.println("ret = " + ret);
//  }
//  // 方法的定义
// public static int add(int x, int y) {
// return x + y;
//  }
// }
// class Test8{
//     public static void main(String[] args) {
//     int a = 10;
//     int b = 20;
//     System.out.println("第一次调用方法之前");
//     int ret = add(a, b);
//     System.out.println("第一次调用方法之后");
//     System.out.println("ret = " + ret);
//     System.out.println("第二次调用方法之前");
//     ret = add(30, 50);
//     System.out.println("第二次调用方法之后");
//     System.out.println("ret = " + ret);
//      }
//     public static int add(int x, int y) {
//     System.out.println("调用方法中 x = " + x + " y = " + y);
//     return x + y;
//      }
// //     }
// public class Test8{
//     public static void main(String[] args) {
//         int i ;
//         int sum = 0;
//         for( i = 1;i<=5;i++){
//             sum += factor (i);
//         }
//        System.out.println("sum="+sum);
//     }
//     public static int factor(int n) {
//         int result = 1;
//         for(int i=1;i<=n;i++){
//              result *=i;
//         }
//         return result;
//     }
// }
// class Test8 { 
//     public static void main(String[] args) { 
//     int a = 10; 
//     int b = 20; 
//     int ret = add(a, b); 
//     System.out.println("ret = " + ret); 
//     double a2 = 10.5; 
//     double b2 = 20.5; 
//     double ret2 = add(a2, b2); 
//     System.out.println("ret2 = " + ret2); 
//     double a3 = 10.5; 
//     double b3 = 10.5; 
//     double c3 = 20.5; 
//     double ret3 = add(a3, b3, c3); 
//     System.out.println("ret3 = " + ret3); 
//     }
//     public static int add(int x, int y) { 
//         return x + y; 
//         } 
//         public static double add(double x, double y) { 
//         return x + y; 
//         } 
//         public static double add(double x, double y, double z) { 
//         return x + y + z; 
//         } 
//        }
//方法的名字都叫 add. 但是有的 add 是计算 int 相加, 有的是 double 相加; 有的计算两个数字相加, 有的是计算三个数
//字相加同一个方法名字, 提供不同版本的实现, 称为方法重载
//2.3 重载的规则
// 针对同一个类:
// 方法名相同
// 方法的参数不同(参数个数或者参数类型)
// 方法的返回值类型不影响重载.

//代码示例: 递归求 N 的阶乘
// public class Test8{
//     public static void main(String[] args) {
//         int n =6;
//         int ret = factor(n);
//         System.out.println("ret =" +ret);
//         }
//     public static int factor(int n) {
//         if(n==1){
//             return 1;
//         }
//         return n*factor(n-1);
//     }
// }
//代码示例1 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
// public class Test8{
//     public static void main(String[] args) {
//         int num =1234;
//         print(num);
//     }
//     public static void print(int num) { 
//       //System.out.println(num % 10);  
//       if (num > 9) { 
//            print(num / 10); 
//        } 
//        System.out.println(num % 10); 
//    }  
// }
//i%10
// 递归求 1 + 2 + 3 + ... + 10
// public class Test8{
//     public static void main(String[] args) {
//         int num = 10;
//         System.out.println(sum(num));
//     }
//     public static int sum(int num) { 
//         int ret= 1;
//         if (num == 1) { 
//             return ret; 
//             } 
//         else {
//                ret=(num + sum(num - 1));
//                return ret;
//             }
//            } 
// }
// 代码示例3 写一个递归方法，输入一个非负整数，返回组成它的数字之和. 例如，输入 1729, 则应该返回1+7+2+9，
// 它的和是19
// public class Test8{
//     public static void main(String[] args) {
//         int num = 1729;
//         System.out.println(sum(num));
//     }
//     public static int sum (int num){
//             if (num < 10) { 
//                 return num; 
//                 } 
//             return num % 10 + sum(num / 10);
//         }
//  }
// public class Test8{
//     public static void main(String[] args) {
//         int num=6;
//         System.out.println(fib(num));
//     }
//     public static int fib(int num) { 
//     int last2 = 1; 
//     int last1 = 1; 
//     int cur = 0; 
//     for (int i = 3; i <= num; i++) { 
//     cur = last1 + last2; 
//     last2 = last1; 
//     last1 = cur; 
//     } 
//     return cur; 
//    }
// }

