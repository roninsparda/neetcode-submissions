class MyHashSet {
    class ListNode{
        int data;
        ListNode next;

        public ListNode(int key){
            this.data = key;
            this.next = null;
        }
    }

    private final ListNode set[] ;
    public MyHashSet() {
        set  = new ListNode[1000];
        for(int i = 0; i < set.length; i++){
            set[i] = new ListNode(0);
        }
    }
    
    public void add(int key) {
        int hashKey = key % (set.length);

        ListNode current = set[hashKey];
        while(current.next != null){
            if(current.next.data == key){
                return;
            }
            current = current.next;
        }
        current.next = new ListNode(key);
    }
    
    public void remove(int key) {
        int hashKey = key %set.length;
        ListNode current = set[hashKey];
        while(current.next != null){
            if(current.next.data == key){
                current.next = current.next.next;
                return;
            }
            
            current = current.next;
        }
    }
    
    public boolean contains(int key) {
        int hashKey = key % (set.length);

        ListNode current = set[hashKey];
        while(current.next != null){
            if(current.next.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */