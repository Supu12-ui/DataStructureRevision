package tree;

public class creationoftree {
    public static void main(String [] args)
    {
       Node node =new Node(2);
       node.left=new Node(3);
       print(node);
    }
    static void print(Node node)
    {
        if(node==null)
        {
            return ;
        }
        print(node.left);
        System.out.println(node.data);
        print(node.right);
    }
}
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
