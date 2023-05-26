package com.apanaschool;
import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //creating a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // linking stape
        newNode.next = head;
        // s
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printData() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //    public void addMiddle(int idx, int data){
//        Node newNode=new Node(data);
//        size++;
//        if(idx==0){
//            addFirst(data);
//            return;
//        }
//
//        Node temp=head;
//        int i=0;
//        while(i<idx-1){
//            temp=temp.next;
//            i++;
//        }
//        newNode.next=temp.next;
//        temp.next=newNode;
//    }
    public static void removeLoop(Node head) {
        // code here
        // remove the loop without losing any nodes
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }


        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }

    private Node getMid(Node head) {
        Node slow = head;
        Node Fast = head.next;
        while (Fast != null && Fast.next != null) {
            slow = slow.next;
            Fast = Fast.next.next;

        }
        return slow; //mid Node
    }

    //    private Node merge(Node head1, Node head2){
//        Node mergeLL=new Node(-1);
//        Node temp=mergeLL;
//        while (head1!=null && head2!=null){
//            if(head1.data<=head2.data){
//                temp.next=head1;
//                head1=head1.next;
//                temp=temp.next;
//            }
//            else {
//                temp.next=head2;
//                head2=head2.next;
//                temp=temp.next;
//            }
//        }
//        while (head1!=null){
//            temp.next=head1;
//            head1=head1.next;
//            temp=temp.next;
//        }
//        while(head2!=null){
//            temp.next=head2;
//            head2=head2.next;
//            temp=temp.next;
//        }
//        return mergeLL.next;
//    }
//    public Node mergeSort(Node head)
//    {
//        if(head == null || head.next==null){
//            return head;
//        }
//        //find mid
//        Node mid= getMid(head);
//        // left & right Ms
//        Node rightHead=mid.next;
//        mid.next=null;
//        Node newLeft=mergeSort(head);
//        Node newRight=mergeSort(rightHead);
//
//        //mearge
//        return merge(newLeft,newRight);
//
//    }
    public void zigZag() {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse linked list
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alt mearge -zig-zag merge

        while ((left != null && right != null)) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
    }

    // rearangr the liked List in A<B>C<D>E<F  this manner
//  public Node rearrangedLinkedList(Node head){
//       if (head ==null || head.next==null){
//           return head;
//
//       }
//       Node node=head;
//       boolean flag=true;
//       while (node.next!=null){
//           if(flag){
//               if (node.data>node.next.data){
//                   int temp= node.data;
//                   node.data=node.next.data;
//                   node.next.data=temp;
//               }
//               flag=! flag;
//           }else {
//               if (node.data<node.next.data){
//                   int temp= node.data;
//                   node.data=node.next.data;
//                   node.next.data=temp;
//               }
//               flag=! flag;
//           }
//           node=node.next;
//       }
//       return head;
//  }

    public void removeLast() {
        if (size == 0) {
            System.out.println("linked list is empty");
        } else if (size == 1) {
            head = tail = null;
        } else {
            Node temp = head;
            for (int i = 1; i < size - 1; i++) {
                System.out.print(temp.data + " ");

                temp = temp.next;
                System.out.print(temp.data + " ");

            }
            // System.out.println(temp.data);
            temp.next = null;
            tail = temp;
        }
    }

    public int searchNode(Node head, int key) {
        System.out.println("hell");
//        if(head==null){
//            System.out.println("linked List is empty");
//        }

        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            } else {
                temp = temp.next;
                i++;
            }
        }
        return -1;

    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {

        return helper(head, key);
    }

    public int getCount(Node head) {

        //Code here
        Node temp = head;
        int i = 0;
        if (temp == null) {
            return i;
        }

        while (temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    public void deleteNode(Node head, int x) {
        Node temp = head;
        int i = 0;
        while (i < x - 2 && temp != null) {
            temp = temp.next;
            i++;
            System.out.println(temp.data);
        }
        temp.next = temp.next.next;
        temp = temp.next;


    }


    int getNthFromLast(Node head, int n) {
        // Your code here
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
            return head.data;
        }

        Node prev = head;
        int i = 1;
        while (i < size - n) {
            prev = prev.next;
            i++;
        }
        Node te = prev.next;
        prev.next = prev.next.next;

        return te.data;
    }

    //    public Node insertInMid(Node head, int data){
//        //Insert code here, return the head of modified linked list
//
//        Node newNode= new Node(data);
//        if(head.next==null){
//            head.next=newNode;
//        }
////        Node temp=head;
////        int count=0;
////        while (temp!=null){
////            temp=temp.next;
////            count++;
////        }
////        Node prev=head;
////        int i=1;
////        while (i<(count/2)) {
////            prev=prev.next;
////        }
////        Node temppp=prev
//
//
//        else{
//            Node slow=head;
//            Node fast=head;
//            while(fast!=null  && (fast.next!=null && fast.next.next!=null)){
//                slow=slow.next;
//                fast=fast.next.next;
//            }
//            System.out.println(slow.data);
//            Node temp=slow.next;
//            slow.next=newNode;
//            newNode.next=temp;
//        }
//     return head;
//    }
//    boolean isPalindrome(Node head){
//
//        ArrayList<Character> ch=new ArrayList<>();
//        Node temp=head;
//        while (temp!=null){
//            ch.add(temp.data);
//            temp=temp.next;
//        }
//        int start=0;
//        int end=ch.size()-1;
//        while (start<end){
//            if(ch.get(start)!=ch.get(end)){
//                return false;
//            }
//        }
//
//       return  true;
//    }
    public static void isPalindrom(int n) {
        ArrayList<Integer> ll = new ArrayList<>();

        while (n != 0) {
            int temp = n;
            temp = n % 10;
            ll.add(temp);
            n = n / 10;
        }

        int start = 0;
        int end = ll.size() - 1;
        while (start < end) {
            if (ll.get(start) != ll.get(end)) {
                System.out.println("Not Palindrom");
            }
            start++;
            end--;
        }
        System.out.println("palindrom");
    }

    public static void shuffleArray(long arr[], int n) {
        // Your code goes here
        long arr1[] = new long[n / 2];
        long arr2[] = new long[n / 2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        int idx = 0;
        for (int i = n / 2; i < arr.length; i++) {
            arr2[idx] = arr[i];
            idx++;

        }

        int id1 = 0;
        int id2 = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                arr[i] = arr1[id1];
                id1++;
            } else {
                arr[i] = arr2[id2];
                id2++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static Node addOne(Node head) {
        //code here.
        Node temp = head;

        while (temp == null && temp.next == null) {


            System.out.println("1");
            temp = temp.next;
        }
        temp.data = temp.data + 1;
        System.out.println(temp.data);
        return head;
    }
//    public static void main(String[] args) {
//        LinkedList ll=new LinkedList();
//        ll.addFirst(12);
//        ll.addFirst(13);
//        ll.addFirst(14);
//        ll.addFirst(15);
//        ll.addFirst(16);
////
////        System.out.println(size);
////        System.out.println(size/2);
//ll.printData();
//ll.addOne(head);
//ll.printData();

//        if(ll.isPalindrome(head)){
//            System.out.println("palindrom");
//
//        }
//        else{
//            System.out.println("not a palindrom");
//        }

//long arr[]={1,2,3,4,5,6};
//int n= arr.length;
//shuffleArray(arr,n);
//
//
////ll.deleteNode(head,3);
//        System.out.println(ll.getNthFromLast(head,3));
//ll.printData();
//
//
//     System.out.println(ll.recSearch(11));
//ll.removeLast();
//ll.printData();
//ll.rearrangedLinkedList(head);
//ll.printData();


//    }
//}


        public static int countSequence(int n) {
            // Convert the number to its binary representation
            String binary = Integer.toBinaryString(n);

            // Initialize counter variable to 0
            int count = 0;

            // Iterate through the binary digits from left to right
            for (int i = 0; i < binary.length() - 2; i++) {
                // Check if the current and next two digits form the subsequence "101"
                if (binary.charAt(i) == '1' && binary.charAt(i + 1) == '0' && binary.charAt(i + 2) == '1') {
                    // If yes, increment the counter
                    count++;
                }
            }

            // Return the final count
            return count;
        }

        public static void main(String[] args) {
            int n = 21;
            int count = countSequence(n);
            System.out.println("Number of times the sequence '101' occurs in the binary representation of " + n + " is: " + count);
        }
    }



//==+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//    public Node findMidNode(Node head ){
//        //     Node slow=head;
//        //     Node fast=head;
//        //     while(fast.next != null  && fast.next!= null){
//        //         slow=slow.next;
//        //         fast=fast.next.next;
//
//        //     }
//        //     return slow;
//        // }
//        // boolean isPalindrome(Node head)
//        // {
//        //     //Your code here
//        //     if(head==null || head.next==null){
//        //         return true;
//        //     }
//
//        //     Node slow=head;
//        //     Node fast=head;
//        //     while(fast.next != null  && fast.next!= null){
//        //         slow=slow.next;
//        //         fast=fast.next.next;
//
//        //     }
//
//
//
//        //     Node midNode=slow;
//
//        //   Node  prev=null;
//        //   Node curr = midNode;
//
//        //   while(curr!=null){
//        //   Node   next=curr.next;
//        //       curr.next=prev;
//        //       prev=curr;
//        //       curr=next;
//
//
//        //   }
//        //   Node right=prev;
//        //   Node left=head;
//        //   while(right!=null){
//        //       if(left.data!=right.data){
//        //           return false;
//        //       }
//        //      left=left.next;
//        //      right=right.next;
//        //   }
//        //   return true;
//
//

//    }
//}