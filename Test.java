public class Test{
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        // int tmp = 0;//简单算法
        // tmp = a;
        // a = b ;
        // b = tmp ;
        a = a^b;//按位异或
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
    
}