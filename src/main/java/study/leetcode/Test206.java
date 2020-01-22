package main.java.study.leetcode;

import main.java.study.dataStructure.LinkList;
import main.java.study.dataStructure.ListNode;

/**
 *输入: 1->2->3->4->5->NULL
 *输出: 5->4->3->2->1->NULL
 */
public class Test206 {

  public static void main(String[] args) {

    LinkList list = new LinkList();
    for (int i = 1; i <= 5; i++) {
      list.add(i);
    }
    list.print(list.head);
    
    list.print(reverseList3(list.head));
  }



  public static ListNode reverseList(ListNode head) {

    ListNode temp = null;
    ListNode current = head;

    while (current != null) {

      ListNode next = current.next;
      current.next = temp;
      temp = current;
      current = next;
    }

    return temp;
  }
  
  public static ListNode reverseList2(ListNode head) {

    return reverse(head,null);
  }
  
  private static ListNode reverse(ListNode current,ListNode temp){

    if(current != null){
      ListNode next = current.next;
      current.next = temp;
      temp = current;
      return reverse(next,temp);
    }else{
      return temp;
    }
    
  }
  
  public static ListNode reverseList3(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode p = reverseList3(head.next);
    head.next.next = head;
    head.next = null;
    return p;
  }



}


