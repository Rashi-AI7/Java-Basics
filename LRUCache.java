class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    HashMap <Integer, Node> map = new HashMap<>();
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int lim=0;
    public LRUCache(int capacity) {
        lim=capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public void addNode(Node newNode){
        Node oldNext = head.next;
        head.next = newNode;
        newNode.next = oldNext;
        oldNext.prev = newNode;
        newNode.prev = head;
    }

    public void delNode(Node oldNode){
        oldNode.prev.next = oldNode.next;
        oldNode.next.prev = oldNode.prev;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node ansNode = map.get(key);
        int ans = ansNode.val;

        delNode(ansNode);
        addNode(ansNode);
        
        return ans;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node oldNode = map.get(key);
            delNode(oldNode);
            map.remove(key);
        }
        if(map.size()==lim){
            Node lru = tail.prev;
            delNode(lru);
            map.remove(lru.key);
        }
        Node newNode = new Node(key, value);
        addNode(newNode);
        map.put(key, newNode);
    }
}

