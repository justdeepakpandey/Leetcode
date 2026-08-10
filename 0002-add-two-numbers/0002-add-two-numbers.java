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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        while(l1!=null){
            list1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            list2.add(l2.val);
            l2=l2.next;
        }
        int i=0;
        int j=0;
        int carry=0;
        ArrayList<Integer> list3=new ArrayList<>();
        while(i<list1.size()||j<list2.size()){
            int a=0;
            int b=0;
            if(i<list1.size()){
                a=list1.get(i);
            }
            if(j<list2.size()){
                b=list2.get(j);
            }
            int sum=a+b+carry;
            list3.add(sum%10);
            carry=sum/10;
           
            i++;
            j++;
        }
         if(carry>0){
                list3.add(carry);
            }

            ListNode dummy=new ListNode(0);
            ListNode curr=dummy;
            for(int digit:list3){
                curr.next=new ListNode(digit);
                curr=curr.next;
            }
            return dummy.next;
    }
}