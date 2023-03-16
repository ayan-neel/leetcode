package leetcode.easy;

public class MergeLinkedList {

	public ListNode mergeList(ListNode list1, ListNode list2) {
		ListNode headNode = new ListNode();
		ListNode currentNode = headNode;
		while(list1!=null&&list2!=null) {
			if(list1.val<list2.val) {
			currentNode.next = new ListNode(list1.val);
			list1 = list1.next;
			currentNode = currentNode.next;
			}
		else {
			currentNode.next = new ListNode(list2.val);
			list2 = list2.next;
			currentNode = currentNode.next;
		}
		
	}
	return headNode.next;
		
}

}
