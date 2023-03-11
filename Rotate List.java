class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if( head==null || head.next==null)
            return head;
        int l=length(head);
        if(k==l)
            return head;
        while(k>l)
        {
         k=k-l;   
        }
        while(k>0)
        {ListNode tail=helper(head);
         tail.next=head;
         head=tail;
         k--;}
        return head;
        
    }
    public ListNode helper(ListNode cur)
    {
       ListNode prev=null;
        while(cur.next!=null)
        {
            prev=cur;
            cur=cur.next;
        }
        prev.next=null;
        return cur;
    }
    public int length(ListNode cur)
    {
        int l=0;
        while(cur!=null)
        {
            l++;
            cur=cur.next;
        }
        return l;
    }
}
