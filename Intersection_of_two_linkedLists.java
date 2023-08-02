//160. Intersection of Two Linked Lists
// Given the heads of two singly linked-lists headA and headB, return
// the node at which the two lists intersect. If the two linked lists 
//have no intersection at all, return null.
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1 = 0, count2 = 0;
        ListNode temp1 = headA, temp2 = headB;
        while (temp1 != null) {
            count1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            count2++;
            temp2 = temp2.next;
        }
        int diff = count1 - count2;
        if (diff > 0) {
            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
        } else if (diff < 0) {
            while (diff < 0) {
                headB = headB.next;
                diff++;
            }
        }
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;

    }
}