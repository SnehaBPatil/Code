
struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    struct ListNode*cur=head;
    int c=0;
    int i;
    while(cur!=NULL)
    {
        c++;
        cur=cur->next;
    }
    if(c<=1)
        return NULL;
    cur=head->next;
    struct ListNode*prev;
    if(c==n)
    {
        head=head->next;
    }
    for(i=1,prev=head;c-i >n;prev=cur,cur=cur->next,i++);


    prev->next=cur->next;

    return head;

}
