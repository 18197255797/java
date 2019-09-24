// public class Test7{
//     public static void main(String[] args) {
//         Person person = new Person();
//         person.show();
//     }
// }
// class Person {
//     public int age = 18;//就地初始化
//     public String name = "张三";
//     public void show() {
//     System.out.println("我叫" + name + ", 今年" + age + "岁");
//     }
//     public void eat{ 
//         System.out.println(this.name+"正在吃饭");
//     }
// }
// public class Test7{
//     public static void main(String[] args) {
//         Seqlist seqlist = new Seqlist;
//         Seqlist add(pos:1,date:4) 
//     }
// }
// public class seqlist{
//     private int[] date = new elme[10];//这个数组的最大容量10，但并非有效，除非进行插入
//     private int size = 0;//表示当前数组的有效元素个数
//     public void display(){
//         for(int i = 0;i<size ; i++){
//             System.out.println(elme[i]);

//         }
//     public void add(int pos ,int elme){
//         if (pos<0||pos>size){//pos  :在 pos 位置新增元素(下标)
//             return ;//无效
//         }
//         if(pos==size){//尾插的情况，直接把元素放在size下标的位置
//             this.date[pos] = elme;
//             this.size++;
//             return ;
//         }
//         for (int i = this.size;i>pos;i--){
//             this.date[i] = elme;
//         }
//         this.date[pos] = elme;




//     }
// }
// }