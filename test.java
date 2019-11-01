package Exception;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try{System.out.println("frist");
            arr = null;
            System.out.println(arr[4]);
            System.out.println("second");
        }catch(ArrayIndexOutOfBoundsException e) {
            // 打印出现异常的调用栈
            System.out.println("数组下标异常");
            e.printStackTrace();
       }
        catch(NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }
//        System.out.println("third");
        finally {
            System.out.println("finally ");
        }
    }
}
