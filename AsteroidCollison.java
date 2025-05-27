import java.util.Stack;

class AsteroidCollison {
    public int[] asteroidCollision(int[] asteroids) {
     Stack<Integer> st = new Stack<>();

     for(int a : asteroids){
        while(!st.isEmpty() && a < 0 && st.peek() > 0){
            int top = st.peek();
            if(top < Math.abs(a)){
                st.pop();
                continue;
            }
            else if( top == Math.abs(a)){
                st.pop();
            }
            
                a=0;
            }
        if(a !=0){
            st.push(a);
        }
     }
     int []res = new int[st.size()];
     for(int i = res.length -1; i>=0;i--){
        res[i] = st.pop();
     }
     return res;
    }
}