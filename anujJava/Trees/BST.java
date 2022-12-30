import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
class BST{
    public static void main(String []args){

        Node root=createTree();
        int data=7;
        // Node root2=delete(root,data);
        // inorder(root2);
        // if(CheckIsBst(root,Integer.MAX_VALUE,Integer.MIN_VALUE))
        // if(CheckIsBst(root)){
        //     System.out.println("It is BST");}
        // else System.out.println("It is not BST");
        int ans=calcFloor(root,4);
        System.out.println(ans);
    }
    static Node createTree(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        int data=sc.nextInt();
        root=new Node(data);
        if(data==-1) return null;
        System.out.println("Enter left of "+data+" which is samller than "+data);
        root.left=createTree();
        System.out.println("Enter Right "+data+" which is greater than  "+data);
        root.right=createTree();

        return root;
    }
    static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    static int ans = Integer.MAX_VALUE;
    static int calcFloor(Node root,int k){
        Node cur=root;
        // if(root==null) return null;
        //Node cur=root;
        while(cur!=null){
            
            // if(ans<cur.data && cur.data<k ) ans=cur.data;
            // if(cur.data>k){
            //     cur=cur.left;
            // }
            // else cur=cur.right;
            if(cur.data==k) return cur.data;
            if(cur.data>k){ 
                ans=cur.data;
                cur=cur.left;}
            else {
                //ans=cur.data;
                cur=cur.right;
            }
        }
        
        // if(k<cur.data) calcFloor(cur.left,k);
        // else calcFloor(cur.right,k);

        
        return ans;

    }
    static Node prev=null;

    // static boolean CheckIsBst(Node root){
    //     if(root!=null) {
    //     // int  prev=Integer.MIN_VALUE;
    //     CheckIsBst(root.left);
    //     if(root.data<prev.data){
    //        return false;
    //     }else prev=root;
    //     CheckIsBst(root.right);
    // }
    //     return true;


    // }
    // static boolean CheckIsBst(Node root,int high,int low){
    //     // if(root==null) return true;
    //     // if((root.data<high && root.data>low)) {
    //     //     CheckIsBst(root.left,root.data-1,low);
    //     //     CheckIsBst(root.right,high,root.data+1);

    //     // }
    //     // else{
    //     //     return false;

    //     // }
    //     // return true;
    //     // if(root==null) return true;
    //     // if(root.data<low||root.data>high) return false;
    //     // return( CheckIsBst(root.left,root.data-1,low)&& CheckIsBst(root.right,high,root.data+1));
    //     // else return false;


    // }
    // static Node insert(Node root,int data){
    //     if(root==null ) return new Node(data);
    //     if(root.data>data){
    //         root.left=insert(root.left,data);
    //     }
    //     else if(root.data<data){
    //         root.right=insert(root.right,data);
    //     }
    //     return root;
    // }
    // static Node delete(Node root, int data){
    //     if(root==null) return null;
    //     Node cur=root;
    //     Node parent=null;
    //     while(cur!=root){
    //         parent=root;
    //         if(cur.data>data){
    //             cur=cur.left;
    //         }
    //         else cur=cur.right;
    //     }
    //     if(cur.right==null && cur.left==null) cur=null;
    //     else if(cur.right==null && cur.left!=null){
    //         if(cur.left.data<parent.data){
    //             parent.left=cur.left;
    //             cur=null;
    //         }
    //         else{
    //             parent.right=cur.left;
    //             cur=null;
    //         }
    //     }
    //     else if(cur.right!=null && cur.left==null){
    //         if(cur.right.data<parent.data){
    //             parent.left=cur.right;
    //             cur=null;
    //         }
    //         else{
    //             parent.right=cur.right;
    //             cur=null;
    //         }
    //     }
    //     else if(cur.right!=null && cur.left!=null){
    //         Node temp=modify(cur.left,cur.right,cur);
    //         cur=temp;
    //         if(cur.right.data<parent.data){
    //             parent.left=cur.right;
    //             cur=null;
    //         }
    //         else{
    //             parent.right=cur.right;
    //             cur=null;
    //         }
    //     }

    //     return root;
    // } 
    // static Node modify(Node left,Node right,Node parent){
    //     Node cur=right;
    //     while(cur!=null){
    //         cur=cur.left;
    //     }
    //     parent=cur;
    //     cur=null;
    //     parent.left=left;
    //     parent.right=right;
    //     return parent;

    // }

}