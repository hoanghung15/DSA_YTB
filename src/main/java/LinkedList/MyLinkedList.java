package LinkedList;

public class MyLinkedList {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        } else {
            System.out.println("List is empty");
        }
    }

    public static Node addToHead(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node addToTail(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return head;
    }

    public static Node addToIndex(Node head, int value, int index) {
        if (index == 0) {
            return addToHead(head, value);
        } else {
            int cnt = 0;
            Node curNode = head;
            Node newNode = new Node(value);
            while (curNode != null) {
                cnt++;
                if (cnt == index) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return head;
    }

    //Delete
    public static Node removeHead(Node head) {
        if (head != null) {
            return head.next;
        }
        return head;
    }
    public static Node removeLast(Node head){
        if(head != null){
            Node lastNode = head;
            Node preNode = null;
            while(lastNode.next != null){
                preNode = lastNode;
                lastNode = lastNode.next;
            }
            preNode.next = lastNode.next;
        }
        return head;
    }
//    public  static  Node removeCenter(Node head){
//        if(head != null){
//            Node
//        }
//        return null;
//    }
    public  static Node reverse(Node head){
        Node curNode = head;
        while(curNode != null && curNode.next != null){
            Node nextNode =curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }

        return head;
    }
    public  static  Node removeAtIndex(Node head, int index){
        if(head != null && index != 0){
            Node curNode = head;
            Node preNode = null;
            int cnt=0;
            while(curNode.next != null){
                preNode =curNode;
                curNode = curNode.next;
                cnt ++;
                if(cnt == index){
                    break;
                }
            }
            preNode.next = curNode.next;
        }
        return  head;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n1 = reverse(n1);
        printLinkedList(n1);
    }
}
