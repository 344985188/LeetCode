package main.java.study.dataStructure;

public class LinkList {
  public ListNode head;
  public ListNode current;

  public void add(int data) {
    if (head == null) {
      head = new ListNode(data);
      current = head;
    } else {
      current.next = new ListNode(data);
      current = current.next;
    }
  }
  
  public void print(ListNode node){
     if(node == null){
       return;
     }
     
     while(node !=null){
       System.out.print(node.val+"->");
       node = node.next;
     }
     System.out.print("NULL");
  }
}
