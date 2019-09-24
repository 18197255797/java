
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
    
    
    
    // public class Test9{
    //     public static void main(String[] args) {
    //         hanNuoTa(5,'A','B','C');
    //     }
    //     //递归方法
    //     public static void hanNuoTa(int n,char from,char in,char to){
    //         if(n == 1){
    //             System.out.println("把第一个从"+from+"移动到"+to);
    //         }else{
    //             //把上面所有的挪动到中间位置
    //             hanNuoTa(n-1,from,to,in);
    //             //移动下面的盘子
    //             System.out.println("把第"+n+"个从"+from+"移动到"+to);
    //             //挪动最下面的盘子
    //             hanNuoTa(n-1,in,from,to);
    //         }
    //     }
    // }
    //青蛙跳台阶 相当于斐波那契数列求解
    public class Test9{
        public static void main(String[] args) {
          System.out.println(jumpfloor(5)); 
            
        }
        public static int jumpfloor(int num) {
            if(num==1){
                return 1;
            }
            if(num==2){
                return 2;
            }
            return jumpfloor(num-1)+jumpfloor(num -2);
        }
    }
