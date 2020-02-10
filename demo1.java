package first;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
//    public boolean isPalindrome(String s) {
//        int a=s.length();
//        if(a==0){
//            return true;
//        }
//        //char []str = s.toCharArray();
//        int left=0;
//        int right = a-1;
//
//        for(;left<right;){
//            if(Character.isLetterOrDigit(s.charAt(left))){
//                left++;
//                continue;
//            }
//            if(Character.isLetterOrDigit(s.charAt(right))){
//                right--;
//                continue;
//            }
//            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                return false;
//            }
//
//        }
//        while(left==right){
//            return true;
//        }


    public static void main(String args[]){
        int num = 10;
        System.out.println(test(num));
    }
    public static int test(int b){
        try { b += 10;
            return b;
        }catch(RuntimeException e){

        }catch(Exception e2){

        } finally{ b += 10; return b; }
    }
}

