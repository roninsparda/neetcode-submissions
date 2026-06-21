class MyHashMap {
    class ListNode{
        int key , value ;
        ListNode next;

        public ListNode(){
            this(-1,-1,null);

        }
        public ListNode(int key, int value, ListNode next){
            this.key  = key;
            this.value = value;
            this.next = next;
        }
    }

    ListNode [] set;
    public MyHashMap() {
        set = new ListNode[1000];
        for(int i = 0; i < set.length; i++){
            set[i] = new ListNode();
        }
    }
    
    public void put(int key, int value) {
        int hashKey = key % set.length;

        ListNode current = set[hashKey];
        while(current.next != null){
            if(current.next.key == key){
                current.next.value = value;
                return;
            }
            current = current.next;
        }
        current.next = new ListNode(key, value, null);
    }
    
    public int get(int key) {
        int hashKey = key % set.length;

        ListNode current = set[hashKey];
        while(current.next != null){
            if(current.next.key == key){
               return current.next.value;
            }
            current = current.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int hashKey = key % set.length;

        ListNode current = set[hashKey];
        while(current.next != null){
            if(current.next.key == key){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
      
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */