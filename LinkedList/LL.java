// package LinkedList;

// public class LL {
//     public static class Node{
//         int data;
//         Node next;

//          Node(int data){
//             this.data = data;
//             // this.next = next;
//          }
//     }

//     public static void displayliknedlist(Node head){
//         if(head==null)return;
//         displayliknedlist(head.next);
//         System.out.println(head.data);
//     }

//     public static int countofll(Node head){
//         if(head==null){
//             return 0;
//         }
//         int count =0;
//         while(head!=null){
//             count++;
//             head = head.next;
//         }
//         return count;
//     }



//     public static void main(String[] args) {
//         Node a = new Node(5);
//         Node b = new Node(15);
//         Node c = new Node(52);
//         Node d = new Node(25);
//         a.next =b;
//         b.next =c;
//         c.next =d;  
        
//         displayliknedlist(a);
//         System.out.println(countofll(a));

//     }
    
// }



package LinkedList;

public class LL {
    public static class Ll {
        Node head = null;
        Node tail = null;

        public void insertatend(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        public void displayll() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public int size(){
            Node temp = head;
            int count=0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public void insertathead(int value){
            Node temp = new Node(value);
            if(head ==null){
                temp = head;
                tail = head;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }

        public void deleteAt(int index){
            Node temp = head;

            if(index==0){
                head=head.next;
                return;
            }
            for(int i=1; i<index; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }

        public int getat(int index) {
            Node temp = head;
            if(index >size() || index<0){
                System.out.println("wrong index");
                return -1;
            }
            for (int i = 0; i < index; i++) { 
                temp = temp.next;
            }
            return temp.data;
        }
        public void insertat(int index, int value){
            Node new1 = new Node(value);
            Node temp = head;

            if(index==size()){
                insertatend(value);
                return;
            }
            else if(index == 0){
                insertathead(value);
            }

            else if(index >size() || index<0){
                System.out.println("wrong index");
            }
           
            for(int i =1; i<index; i++){
                temp = temp.next;
            }
            new1.next = temp.next;
            temp.next = new1;

        }
    }

    public static void main(String[] args) {
        Ll list = new Ll();
        list.insertatend(10);
        list.insertatend(20);
        list.insertatend(30);
        list.insertathead(100);
        list.insertat(3, 156);
        list.insertat(5,670);
        list.insertat(0, 1999);
        

        list.displayll();
        // System.out.println(list.getat(3));
        System.out.println();
        list.displayll();
        System.out.println(list.tail.data);
        list.deleteAt(7);
        list.displayll();
        System.out.println(list.tail.data);
    
    }
}
