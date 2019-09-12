public class Test2{
    public static void main (String[] args){
        int a = 3,b = 9,c = 1;
        int max,min;
        max=(a>b?a:b);
        max=(max>c?max:c);
        min=(a<b?a:b);
        min=(min<c?min:c);
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
        // if(a>b){
        //     if(a>c){
        //     System.out.println("MAX=a");}
        //     else {
        //     System.out.println("MAX=c");
        // }
        // int max,min;
        // if(a>b){
        //     max=a;
        // }
        // else{
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
//         int max,min;
//         System.out.println(max);
//     }
// }