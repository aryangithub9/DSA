package LinkedList;

public class Leetcode {
    public static class Node{
                 int data;
                 Node next;
        
                  Node(int data){
                     this.data = data;
                     // this.next = next;
                  }
             }
        
             public static void displayliknedlist(Node head){
                 if(head==null)return;
                 System.out.print(head.data+" ");
                 displayliknedlist(head.next);
                 System.out.println();
             }
             

            
             public static Node removeNthNodefromlastinoneloop(Node head, int n){
               Node fast = head;
               Node slow = head;
               
               for(int i=1; i<=n; i++){
                    fast=fast.next;
               }
               while (fast.next!=null) {
                slow=slow.next;
                fast=fast.next;
               }
               return slow;
             }
             public static int countofll(Node head){
                 if(head==null){
                     return 0;
                 }
                 int count =0;
                 while(head!=null){
                    count++;
                     head = head.next;
                 }
                 return count;
             }
        
        
        
            public static void main(String[] args) {
                Node a = new Node(5);
                Node b = new Node(15);
                Node c = new Node(52);
                Node d = new Node(25);
                Node e = new Node(67);
                Node f = new Node(232);
                a.next =b;
                b.next =c;
                c.next =d; 
                d.next = e; 
                e.next=f;
                
                displayliknedlist(a);
                // Node ans = NthNodefromlastinoneloop(a, 6);
                // System.out.println(ans.data);
                // removenthNodeFROMlast(a, 3);
                displayliknedlist(a);
        
            
        }
    
}
