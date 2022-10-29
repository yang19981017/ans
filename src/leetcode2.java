public class leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        int temp = 0;
        ListNode t = ans;
        while (l1 != null || l2 != null || temp > 0) {
            int t1 = l1 == null ? 0 : l1.val;
            int t2 = l2 == null ? 0 : l2.val;
            t.next = new ListNode((t1 + t2 + temp) % 10);
            t = t.next;
            temp = (t1 + t2 + temp) / 10;
            l1=l1==null?l1:l1.next;
            l2=l2==null?l2:l2.next;
        }
        t.next=null;
        return ans.next;
    }
}
