/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode oddHead=null,oddTail=null;
        ListNode EvenHead=null,EvenTail=null;
        ListNode current=head;
        int index=1;
        while(current!=null){
            if(index%2==0){
                if(EvenHead==null){
                    EvenHead=current;
                    EvenTail=current;
                }else{
                    EvenTail.next=current;
                    EvenTail=current;
                }
            }else{
                if(oddHead==null){
                    oddHead=current;
                    oddTail=current;
                }else{
                    oddTail.next=current;
                    oddTail=current;
                }
            }
            current=current.next;
            index++;
        }
        if(EvenHead==null) return oddHead;
        if(oddHead ==null )return EvenHead;
        oddTail.next=EvenHead;
        EvenTail.next=null;
        return oddHead;


    }
}