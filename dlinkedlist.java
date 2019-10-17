class DLinkedNode {
    public int val = 0;
    public DLinkedNode prev = null;
    public DLinkedNode next = null;

    public DLinkedNode(int val) {
        this.val = val;
    }
}

public class DLinkedList {
    private DLinkedNode head = null;

    public DLinkedList() {
        // 创建傀儡节点
        head = new DLinkedNode(-1);
        // 带环
        head.next = head;//双向链表，指向自身
        head.prev = head;
    }
//头插
    public void addFirst(int data) {
        // 1. 创建一个新的节点
        DLinkedNode newNode = new DLinkedNode(data);
        DLinkedNode next = head.next;

        newNode.next = next;
        next.prev = newNode;
        head.next = newNode;
        newNode.prev = head;
    }
//尾插
    public void addLast(int data) {
        DLinkedNode newNode = new DLinkedNode(data);
        // 这个节点就是新的节点的前一个节点
        // head 就是新的节点的后一个节点
        DLinkedNode prev = head.prev;//记录最后一个节点
        newNode.next = head;
        head.prev = newNode;
        prev.next = newNode;
        newNode.prev = prev;
    }
//任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        int size = size();
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            // 头插
            addFirst(data);
            return;
        }
        if (index == size) {
            // 尾插
            addLast(data);
            return;
        }//其他情况的插入
        DLinkedNode next = getPos(index);
        DLinkedNode prev = next.prev;

        DLinkedNode newNode = new DLinkedNode(data);
        prev.next = newNode;
        newNode.prev = prev;

        next.prev = newNode;
        newNode.next = next;
    }
//找到下标为index的节点
    public DLinkedNode getPos(int index) {
        // 找到下标为 index 对应的节点
        DLinkedNode cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
//求链表长度
    public int size() {
        int size = 0;
        for (DLinkedNode cur = head.next;
            cur != head; cur = cur.next) {
            size++;
        }
        return size;
    }
//查找是否包含关键字key是否在单链表当中
    public boolean contains(int toFind) {
        for (DLinkedNode cur = head.next;
                cur != head; cur = cur.next) {
            if (cur.val == toFind) {
                return true;
            }
        }
        return false;
    }
//删除第一次出现关键字为key的节点
    public void remove(int key) {
        // 1. 先根据 key 找到要删除的元素的位置
        DLinkedNode toRemove = find(key);
        if (toRemove == null) {
            // 没有找到要删除的节点
            return;
        }
        // 2. 具体进行删除
        DLinkedNode prev = toRemove.prev;
        DLinkedNode next = toRemove.next;
        prev.next = next;
        next.prev = prev;
    }

    public void removeAll(int key) {
        while (true) {
            // 1. 先根据 key 找到要删除的元素的位置
            DLinkedNode toRemove = find(key);
            if (toRemove == null) {
                // 没有找到要删除的节点
                return;
            }
            // 2. 具体进行删除
            DLinkedNode prev = toRemove.prev;
            DLinkedNode next = toRemove.next;
            prev.next = next;
            next.prev = prev;
        }
    }
//
    public DLinkedNode find(int key) {
        for (DLinkedNode cur = head.next;
             cur != head; cur = cur.next) {
            if (cur.val == key) {
                return cur;
            }
        }
        return null;
    }

    public void display() {
        System.out.print("正向: [");
        for (DLinkedNode cur = head.next;
                cur != head; cur = cur.next) {
            System.out.print(cur.val);
            if (cur.next != head) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("反向: [");
        for (DLinkedNode cur = head.prev;
                cur != head; cur = cur.prev) {
            System.out.print(cur.val);
            if (cur.prev != head) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public void clear() {
        // clear 预期得到的是一个初始状态下的空链表
        // 对于我们当前这样的链表来说, 初始状态也
        // 带有一个傀儡节点, 傀儡节点 prev 和 next 指向自身
        head.next = head;
        head.prev = head;
    }
}
