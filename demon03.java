import java.util.LinkedList;
import java.util.List;
import java.util.Date;
//1.判断链表是否带环
public class Demon03 {
       public static void main(String[] args) {
           Date date = new Date();
           // 得到一个毫秒级别的时间戳
           System.out.println(date.getTime());
      }
   }
    // public boolean hasCycle(ListNode head) {
    //     if(head == null){
    //         return null;
    //     }
    //     ListNode fast = head;
    //     ListNode slow = head;
    //     if(fast!=null&&fast.next!=null){
    //         fast = fast.next.next;
    //         slow = slow.next;
    //         while(fast == next){
    //             return ture;
    //         }
    //     }
    //     return false;
    
        // if(head == null){
        //     return null;
        // }
        // ListNode fast = head;
        // ListNode slow = head;
        // if(fast != null && fast.next != null){
        //     fast = fast.next.next;
        //     slow = slow.next:
        //     while(fast == slow){
        //         return ture;
        //     }
        // }
        // return false;
    //}
    //2，给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    //public ListNode detectCycle(ListNode head) {
    // 从链表头部出发, 到入口点的距离,
    // 和从快慢指针的交汇处出发, 到入口点的距离相等


    // if(head == null){
    //     retun null;
    // }
    // ListNode fast = head;
    // ListNode slow = head;
    // while(fast!=null&&fast.next!=null){
    //     fast = fast.next.next;
    //     slow = slow.next;
    //     if(fast == slow){
    //         break;
    //     } 
    // }
    // if(fast ==null&&fast.next==null){
    //     return null;
    // }
    // ListNode prev = head;
    // ListNode cur = fast;
    // if(prev!=cur){
    //     prev = prev.next;
    //     cur = cur.next;
    // }
    // return cur;
    // }

//   if{head == null}{
//         return null;
//     }
//     ListNode fast = head;
//     ListNode slow = fead;
//     while(fast != null && fast.next !=null){
//         fast = fast.next.next;
//         slow = slow.next;
//         if(fast == slow){
//             break;
//         }
//     }
//     //不带环
//     if(fast == null && fast.next == null ){
//         return null;
//     }
//     ListNode cur1 = head;
//     ListNode cur2 = fast;
//     if(cur1 != cur2){
//         cur1 = cur1.next;
//         cur2 = cur2.next;
//     }
//     return cur1;
//     }
// }
