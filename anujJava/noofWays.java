class noofWays{
    public static void main(String args[]){
        String  ans="";
        // String ar[]=new String[8];

        String ar[]=solve("abc",0,ans);
       // System.out.println(n);
    }
//     static int solve(int m,int n){
//         if(m==1||n==1){
//             return 1;
//         }
//         else{
//             return solve(m-1,n)+solve(m,n-1);
//         }
//     }
        // static int solve(int n,int k){
        //     if(n==1) return 0;
        //     else return (solve(n-1,k)+k)%n;
        // }
        static void solve(String s,int i,String ans){
            if(i==s.length()){
                System.out.println(ans);
                return;
            }
            solve(s,i+1,ans+s.charAt(i));
            solve(s,i+1,ans);


        }

}