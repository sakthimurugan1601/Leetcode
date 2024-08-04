
class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        int cry=0;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(l1 != null||l2 != null){
            if(l1 != null){
                cry+=l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                cry+=l2.val;
                l2=l2.next;
            }
            temp.next=new ListNode(cry%10);
            temp=temp.next;
            cry=cry/10;
        }
        if(cry==1){
            temp.next = new ListNode(cry);
        }
        return result.next;
    }
}
            
        
    
