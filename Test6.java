// public class Test6{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         int i=0;
//         for(i=0;i<arr.length;i++){
//             System.out.print(+arr[i]+" ");
//         }
//         System.out.println();
//         for(int x:arr){
//             System.out.print(x+" ");
//         }
        // System.out.println("length: " + arr.length); 
        // System.out.println("arr[1]="+arr[1]); 
        // System.out.println(arr[0]); 
        // arr[2] = 100;
        // System.out.println(arr[2]);

//     }
// }
//1.逐个输入成绩，并计算平均值
// import java.util.Scanner;
// public class Test6{
//      public static void main(String[] args) {
//         Scanner sr = new Scanner(System.in);
//         System.out.println("请输入学生个数");
//         int length = sr.nextInt();//确定数组长度
//         double sz[] = new double[length];//创建一个长度为length的数组
//         System.out.println("请输入分数：");
//         for(int i=0;i<length;i++){
//            sz[i]=sr.nextDouble();//数组初始化
//        }
//        double sum=0;
//        double result=0;
//        for(int i=0;i<length;i++){
//          sum=sum+sz[i];
//         }
//         result=sum/length;
//         System.out.println("平均分："+result);
//     }
// }  
//从键盘输入n个学生的m门成绩，求每个学生的总成绩，每门课的平均成绩
import java.util.Scanner;
public class Test6{
    public static void main(String[] args) {
       System.out.println("请输入学生个数和成绩个数");
       int n=0;
       int m=0;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();//学生个数
       m = sc.nextInt();//成绩个数
       double average = 0;
       for(int i=1;i<=n;i++){//外层求课程的平均成绩
            int sum = 0;
           for(int j=1;j<=m;j++){//内层求学生的总成绩
            System.out.println("请输入第"+i+"个学生的"+j+"门成绩");
            Scanner sc1 = new Scanner(System.in);
            sum += sc1.nextInt();
           }
           System.out.println("该学生的总成绩："+sum);
           average = (double)sum/n;
           System.out.println("该学生的平均成绩"+average);
       }
    }
}
