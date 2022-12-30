import java.util.*;
import java.io.*;
class Graphs{
    public static void main(String []args){
        int e=6;
        int v=8;
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        // for(int i=0;i<e;i++){
        //     System.out.println("Enter the source ");
        //     int s=sc.nextInt();
        //     System.out.println("Enter the destination ");
        //     int d=sc.nextInt();
        //     addEdge(adj,s,d);
        // }
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
        addEdge(adj,2,4);
        addEdge(adj,5,7);
        // addEdge(adj,6,7);

        ArrayList<Integer> ans =new ArrayList<>();
        int pred[]=new int[v+1];
        int dist[]=new int[v+1];
        // bfs(adj,1,v,ans);
        int c=0;
        boolean vis[]=new boolean[v];
        Arrays.fill(vis,false);
        for(int i=0;i<v;i++){
            if(!vis[i]){
                c++;
                bfs(adj,vis,i,v,ans);
            }
        }

        System.out.println("No Of components are"+ c);
        
        

        System.out.println(adj);
        System.out.println(ans);


    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int src,int des){
        adj.get(src).add(des);
        adj.get(des).add(src);
    }
    // static void dfs(ArrayList<ArrayList<Integer>> adj,int v,boolean vis[],int src,ArrayList<Integer> ans){
    //     // boolean vis[]=new boolean[v];
    //     dfsTraverse(adj,vis,0,ans);
    // }
    // static void dfsTraverse(ArrayList<ArrayList<Integer>> adj,boolean vis[],int src,ArrayList<Integer> ans){
    //     vis[src]=true;
    //     ans.add(src);
    //     for(int e:adj.get(src)){
    //         if(!vis[e]){
    //             System.out.println(1);
    //             dfsTraverse(adj,vis,e,ans);
    //         }
    //     }
    // } 
    // static boolean bfs(ArrayList<ArrayList<Integer>> adj,int src, int dest, int v,int pred[],int dist[]){
    //     // LinkedList<Integer> queue=new LinkedList<>();
    //     Queue<Integer> queue=new ArrayDeque<>();
    //     boolean vis[]=new boolean[v];
    //     // for(int i=0;i<v;i++){
            
    //     // }
    //     Arrays.fill(vis,false);
    //     Arrays.fill(dist,Integer.MAX_VALUE);
    //     Arrays.fill(pred,-1);
    //     vis[src]=true;
    //     int u=0;
    //     dist[src]=0;
    //     queue.offer(src);
    //     while(!queue.isEmpty()){
    //         int cur=queue.poll();
    //         u++;
    //         for(int i=0;i<adj.get(u).size();i++){
    //             int neighbor=adj.get(u).get(i);
    //             if(vis[neighbor]==false) vis[neighbor]=true;

    //         }
    //         return false;
    //     }

        
    // }
    // static void bfs(ArrayList<ArrayList<Integer>> adj,boolean vis[],int src,int v,ArrayList<Integer> ans){
    //     // boolean vis[]=new boolean [v];
    //     // Arrays.fill(vis,false);
    //     //vis[src]=true;
    //     Queue<Integer> q=new ArrayDeque<>();
    //     q.offer(src);
    //     while(!q.isEmpty()){
    //         int temp=q.poll();
    //         if(vis[temp]!=true){
    //         for(Integer e: adj.get(temp)){
    //             if(vis[temp]==false) {
    //                 ans.add(temp);
    //                 vis[temp]=true;
    //             }
    //             q.offer(e);//System.out.println(1);
    //            // vis[temp]=true;

    //         }
    //     }}
    // }
    

}