
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class DeleteDuplicationofList {
	public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null)
			return null;
		ListNode pNext=pHead.next;
		ListNode pCurrent=pHead;
		ListNode pPrev=null;
		while(pNext!=null){
			if(pNext.val==pCurrent.val){
				while(pNext!=null&&pNext.val==pCurrent.val){
					pNext=pNext.next;
					pCurrent.next=pNext;
				}
				if(pCurrent==pHead){
					pHead=pNext;
					pCurrent=pHead;
				}
				else{
					pPrev.next=pNext;
					pCurrent=pNext;
				}
				if(pNext==null)
					break;
				pNext=pNext.next;
			}
			else{
				pPrev=pCurrent;
				pCurrent=pNext;
				pNext=pNext.next;
			}
		}
		return pHead;
    }
}
