public class Test {
    public static void main(String[] args) {
        Node node=new Node(1);
        Node node1=new Node(2);
        Node node2=new Node(3);
        Node node3=new Node(4);
        Node n1=node.append(node1).append(node2).append(node3);
//        Node n2=node.append(node1);
//        Node n3=node.append(node2);
//        Node n4=node.append(node3);
        node.show();
        System.out.println(node.getNext().getNext().getNext().getData());
    }
}
