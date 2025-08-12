package Array_Implementation_Stack;

public class Main {
    public static void main(String[] args) {

        Stack st = new Stack(6);

        st.isEmpty();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        st.peek();

        st.pop();
        st.peek();
        st.isEmpty();

    }
}
