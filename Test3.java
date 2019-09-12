// 1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
// 2. 判定一个数字是否是素数 
// 3. 打印 1 - 100 之间所有的素数 
// 4. 输出 1000 - 2000 之间所有的闰年 
// 5. 输出乘法口诀表 
// 6. 求两个正整数的最大公约数 
//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。

// public class Test3{
//     public static void main(String[] args){
//            int age = 32;
//            if(age<=18){s
//             System.out.println("少年");
//            }
//            if(age>=19&&age<=28){
//             System.out.println("青年");
//            }
//            if(age>=29&&age<=55){
//             System.out.println("中年");
//            }
//            if(age>=56){
//             System.out.println("老年");
//            }
//         }
//     }
// public class Test3{
//        public static void main(String[] args){
//            //素数：指大于1的自然数中，只有1和它本身以外不会再有其他因数的自然数
//                 for (int j = 0; j <= 100; j++) {
//                     System.out.println(j+":  "+isPrime(j) );
//                 }       
//             }        
//             private static boolean isPrime(int src) {
//                 double sqrt = Math.sqrt(src);
//                 if (src < 2) {
//                     return false;
//                 }
//                 if (src == 2 || src == 3) {
//                     return true;
//                 }
//                 if (src % 2 == 0) {// 先判断是否为偶数，若偶数就直接结束程序
//                     return false;
//                 }
//                 for (int i = 3; i <= sqrt; i+=2) {
//                     if (src % i == 0) {
//                         return false;
//                     }
//                 }
//                 return true;
//             }
//         }
// public class Test3{
//          public static void main(String[] args){
//             int i ;
//             for (i=1000;i<=2000;i++){
//                 if(i%4==0){
//                     if(i%100==0){
//                         System.out.println(i);
//                     }
//                 }else if(i%400==0) {
//                     System.out.println(i);
//                 }
//             }
//          }
//         }         
       
//输出乘法口诀表
//1*1=1
//2*1=2  2*2=4
//3*1=3  3*2=6 3*3=9

public class Test3{
     public static void main(String[] args){
           int i=0 ,j=0 ;
         
         for(i=1;i<=9;i++){
           System.out.println();
            for(j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");//这边用print 不换行，如果用println，则输出不是正规的乘法口诀表
            }
        }
     }
     }
//求两个正整数的最大公约数
// public class Test3{
//             public static void main(String[] args){
//            //(12 16）=4
//            int a = 12;
//            int b = 15;
//            int i,j;
//            for(i=1;i<=12;i++){
//                if(a%i==0){
//                    System.out.print("i="+i+"\t");
//                }
//            }
//            System.out.println();
//            for(j=1;j<=b;j++){
//             if(b%j==0){
//                 System.out.print("j="+j+"\t");
//             }
//            }
//            if(i==j){
//             System.out.println("最大公约数为"+i);
//         }
//         if(i==j){
//             System.out.println("最大公约数为"+i);
//     }
// }
// public class Test3{
//     public static void main(String[] args){
//         int a = 12;
//         int b = 15;
//         int r;
//         if(a<b){
//             int tmp=a;
//             a = b;
//             b = tmp;
//         }
//         if(a%b==0){
//             System.out.println(b);
//         }
//         r=a%b;
//         while(r!=0){
//             a=b;
//             b=r;
//             r=a%b;      
//           }
//           System.out.println(b);
//     }
// }
//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。

// public class Test3{
//     public static void main(String[] args) {
//     double  i = 1.0;
//     double sum = 0;
//     for (i=1.0;i<=100.0;i++){
//         if(i%2!=0){
//         sum += (1/i);
//         }else{
//                 sum+=(-1)*(1/i);
//         }
//         }
//         System.out.println(sum);
//     } 
// }
























