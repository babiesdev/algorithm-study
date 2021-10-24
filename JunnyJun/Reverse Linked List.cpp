class Solution
{
public:
    ListNode *reverseList(ListNode *head)
    {
        ListNode *prev = NULL;

        while (head)
        {
            ListNode *tail = head->next;
            head->next = prev;
            prev = head;
            head = tail;
        }
        return prev;
    }
};
