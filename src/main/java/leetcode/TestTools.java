package leetcode;

/**
 * By yize on 2015/1/4.
 */
public class TestTools {
    public static void printList(ListNode head){
        ListNode tmp = head;
        while(tmp != null){
            System.out.print(tmp.val + "->");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static ListNode createList(int[] nums){
        ListNode result = null;
        ListNode tmp = null;
        for(int i : nums){
            if(result == null){
                tmp = new ListNode(i);
                result = tmp;
            }else{
                tmp.next = new ListNode(i);
                tmp  = tmp.next;
            }
        }
        return result;
    }

    public static void printArray(int[] a){
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
