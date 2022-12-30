import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}

class bstImplement{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        Node root2=root;
        System.out.println("Enter no of queries");
        int n=sc.nextInt();
        while(n>0){
        System.out.println("1 for insert\n 0 for delete");
        int input=sc.nextInt();
        int output=-1,num;
        // Node root=null;
        if(input==1){
            System.out.println("Enter the num to be inserted");
            num=sc.nextInt();
            output=insert(root,num);

        }
        else if(input==0){
            System.out.println("Enter the num to be deleted");
            num=sc.nextInt();
            output=delete(root,num);
        }
        System.out.println(output+"  is inserted ");
        n--;
        // inorder(root);
    }
    System.out.println("Traversing....");
    inorder(root);
    }
    public static int insert(Node root,int num){
        Node temp ;
        if(root==null) {
            root=new Node(num);
            return num;
        }
        if(root.data>num){
            temp=root.left;
            root.left.data=insert(temp,num);
        }
        else if(root.data<=num){  
            temp=root.right;
            root.right.data=insert(temp,num);}
        return 10;
    }
    public static void inorder(Node root){
        if(root==null)  System.out.println("null");
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static int delete(Node root,int num){
        // // if(root.data==null){return 0;}
        // if(search(root))
        // boolean flag=false;
        // while(root!=null){
        //     if(root.data)
        // }
        return 0;
    }
}