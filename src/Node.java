public class Node {
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Node(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public void show(){
        Node current=this;
        while (true){
            System.out.println(current.data);
            current=current.next;
            if(current.next==null){
                break;
            }
        }
    }
    public Node append(Node node){
        Node current=this;
        while (true){
            if (current.next!=null){
                current=current.next;
            }else {
                current.next=node;
                break;
            }
        }
        return current.next;
    }
}
