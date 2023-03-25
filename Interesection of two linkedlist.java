struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
   struct ListNode*c1=headA;
    struct ListNode*c2=headB;
    while(c1!=NULL)
    { c2=headB;
        while(c2!=NULL)
        {
            if(c1==c2)
                return c1;
            c2=c2->next;
        }
    c1= c1->next;
    }
    return NULL;
}
