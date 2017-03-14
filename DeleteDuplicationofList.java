

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
				if(pCurrent==pHead){     //当前节点为头结时，由于pPrev为null，
					pHead=pNext;     //因此需改变pHead,
					pCurrent=pHead;  //
				}                        
				else{                    //
					pPrev.next=pNext;//否则直接更改pPrev.next
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
