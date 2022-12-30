import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
class BinaryTree{
    public static void main (String []args){
        //  Scanner sc=null;
        // sc=new Scanner(System.in);
       Node root= createTree();
    //    inOrder(root);
    //    System.out.println();
    //    preOrder(root);
    //    System.out.println();
    //    postOrder(root);
        //System.out.println(root);
        //int height=findHeight(root);
        // System.out.println(height);
        // int max=findMax(root);
        // System.out.println(max);
        // levelTraverse(root);
        // leftView(root,height+1);
        // ArrayList<Integer> a=topView(root);
        // System.out.println(a);
        // binarytoDLL(root);
        // display(root.head);
        Node ans=LeastCommonAnscetors(root,2,3);
        System.out.println(ans.data);
        }
    static Node createTree(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        int data=sc.nextInt();
        root=new Node(data);
        if(data==-1) return null;
        System.out.println("Enter left of"+data);
        root.left=createTree();
        System.out.println("Enter Right of"+data);
        root.right=createTree();

        return root;
    }
    // static void inOrder(Node root){
    //     if(root==null) return ;
    //     inOrder(root.left);
    //     System.out.print(root.data+" ");
    //     inOrder(root.right);
    // }
    // static void preOrder(Node root){
    //     if(root==null) return ;
    //     System.out.print(root.data+" ");
    //     preOrder(root.left);
    //     // System.out.print(root.data+" ");
    //     preOrder(root.right);
    // }
    // static void postOrder(Node root){
    //     if(root==null) return ;
        
    //     postOrder(root.left);
    //     // System.out.print(root.data+" ");
    //     postOrder(root.right);
    //     System.out.print(root.data+" ");
    // }
    // static int findHeight(Node root){
    //     if(root==null)
    //         return 0;
    //     else return Math.max(findHeight(root.left),findHeight(root.right))+1;
    // }
    // static int findMax(Node root){
    //     if(root==null){
    //         return 0;
    //     }
    //     else return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
    // }
    // static void levelTraverse(Node root){
    //     Queue<Node> q=new LinkedList<>();
    //     q.add(root);
    //     q.add(null);
    //     while(!q.isEmpty()){
    //         Node cur=q.poll();
    //         if(cur==null){
    //             if(q.isEmpty()){
    //                 return;
    //             }
    //             q.add(null);
    //             System.out.println();
    //             continue;
    //         }
    //         System.out.print(cur.data+"  ");
    //         if(cur.left!=null){
    //             q.add(cur.left);
    //         }
    //         if(cur.right!=null){
    //             q.add(cur.right);
    //         }
    //     }
    // }
    // static void leftView(Node root,int h){
        
    //     ArrayList<Node> a=new ArrayList<>();
    //     //Arrays.fill(a,null);
    //     for(int j=0;j<h+1;j++){
    //         a.add(null);
    //     }

    //     solve(a,root,0);

    //     // for(Node i: a)
    //     //     System.out.println(i.data);
    //     for(Node i: a) System.out.println(i.data);
    //     //for(int i=0;i<a.size();i++)   System.out.println();
    // }
    // static void solve(ArrayList<Node> a,Node root, int level){
    //     if(root==null) return;
    //     //System.out.println(level);
    //     if(a.get(level)==null){
    //         //System.out.println(a);
    //         a.set(level,root);}
    //     //System.out.println(a);
    //     solve(a,root.left,level+1);
    //     //a.set(level,root);
    //     solve(a,root.right,level+1);
    //     // solve(a,root.left,level+1);
    // }
    // static ArrayList<Integer> topView(Node root){
    //     Queue<Pair> q=new ArrayDeque<>();
    //     Map<Integer,Integer> map=new TreeMap<>();
    //     q.add(new Pair(0,root));
    //     while(!q.isEmpty()){
    //         Pair cur=q.poll();
    //         // if(!map.containsKey(cur.dist)){
    //             map.put(cur.dist,cur.node.data);
    //         // }
    //         if(cur.node.left!=null){
    //             q.add(new Pair(cur.dist-1,cur.node.left));}
    //         if(cur.node.right!=null){
    //         q.add(new Pair(cur.dist+1,cur.node.right));
    //         }
    //     }
    //     ArrayList<Integer> a=new ArrayList<>();
    //     for(Map.Entry<Integer,Integer> entry: map.entrySet()){
    //         a.add(entry.getValue());
    //     }
    //     return a;

    // }
    // static LL prev=null;static LL head=null;
    //  void binarytoDLL(Node root){
    //     if(root==null) return;
    //     // Node cur=root;
    //     binarytoDLL(root.left);
    //     if(prev==null) head=root;
    //     else{ 
    //         root.left=prev;
    //         prev.right=root;
        
    //     }
    //     prev=root;

    //     binarytoDLL(root.right);

    // }
    // void display(LL head){
    //     while(head !=null){
    //         System.out.println(head.d);
    //         head=head.next;
    //     }
    // }
    static Node LeastCommonAnscetors(Node root,int a,int b){
        if(root==null) return null;
        if(root.data==a|| root.data==b) return root;
        Node left=LeastCommonAnscetors(root.left,a,b);
        Node right=LeastCommonAnscetors(root.right,a,b);
        if(left==null) return right;
        if(right==null) return left;
        return root;

    }


    
}
class Pair{
    int dist;
    Node node;
    Pair(int dist,Node node){
        this.dist=dist;
        this.node=node;
    }
}
class LL{
    int d;
    LL prev;
    LL next;
    LL(int d){
        this.d=d;
        prev=null;
        next=null;
    }

}