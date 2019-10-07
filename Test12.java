 
import java.util.Scanner;
public class Test12{
    public static void main(String[] args) {
        //1.逐个输入成绩，并计算平均值
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入学生成绩个数");
        int length = sr.nextInt();//确定数组长度
        double sz[] = new double[length];//创建一个长度为length的数组
        System.out.println("请输入分数：");
        for(int i=0;i<length;i++){
           sz[i]=sr.nextDouble();//数组初始化
       }
       double sum=0;
       double result=0;
       for(int i=0;i<length;i++){
         sum=sum+sz[i];
        }
        result=sum/length;
        System.out.println("平均分："+result);
    }
}  
    