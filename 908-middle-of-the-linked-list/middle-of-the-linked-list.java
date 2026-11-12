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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int cn=0;
        while(temp!=null){
            cn++;
            temp=temp.next;
        }
        int k=(cn/2)+1;
        temp=head;
        int l=0;
        while(temp!=null){
            l++;
            if(l==k){
                head=temp;;
            }
            temp=temp.next;
        }
        return head;
    }
}