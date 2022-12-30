import java.util.*;
import java.io.*;
class paranthesisMatch{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        Stack<Character> st=new Stack<>();
        // System.out.println(s);
        // st.push(s.charAt(0);)
        for(int i=0;i<s.length();i++){
            if(isOpening(s.charAt(i))){
                // System.out.println(s.charAt(i));
                st.push(s.charAt(i));
                System.out.println(st);
            }
            else{
                System.out.println(s.charAt(i));
                System.out.println(st.peek());
                if(correctCombination(st.peek(),s.charAt(i))){
                    // System.out.println(s.charAt(i));
                    // System.out.println(st.peek());
                    // System.out.println(st.peek());
                    st.pop();
                    // System.out.println(st.peek());

                }
                
                else if(st.isEmpty()){ 
                    System.out.println("false");
                }
            }
        } 
        if(st.isEmpty()){
            System.out.println("true");

        }
        else {
            System.out.println(st);
            System.out.println("falsee");}
    }
    public static boolean isOpening(char a){
        if (a=='('||a=='{'||a=='[')
            return true;
        else return false;
    }
    public static boolean correctCombination(char a, char b){
        if((a=='('&& b==')')||(a=='{' && b=='}')|| (a=='[' && b==']'))
            return true;
        else 
            return false;
    }
}