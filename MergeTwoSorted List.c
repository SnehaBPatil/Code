
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    if(list1==NULL)
        return list2;
    else if(list2==NULL)
        return list1;
    struct ListNode*c1=list1;
    struct ListNode*c2=list2;
    while(c1->next!=NULL)
    {
        c1=c1->next;
    }
    c1->next=c2;
   // display(list1);
   sort(list1);
    
    return list1;
    

}
void sort(struct ListNode*c)
{
    struct ListNode*i;
    struct ListNode*j;
    for(i=c;i!=NULL;i=i->next)
    {
        for(j=c;j->next!=NULL;j=j->next)
        {
            if(j->val > j->next->val)
            {
                int temp=j->val;
                j->val=j->next->val;
                j->next->val=temp;
            }
        }
    }
  
}
void display(struct ListNode*c)
{
    while(c!=NULL)
    {
        printf("%d",c->val);
        c=c->next;
    }
}
