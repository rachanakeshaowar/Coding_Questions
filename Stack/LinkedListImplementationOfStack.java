public class LinkedListImplementationOfStack {
    public static class Node {// user define data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack {//user define data stucture
      private  Node head = null;
       private  int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrec(Node h){
            if(h==null) return;
         displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
          displayrec(head);
        }
        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp=temp.next;

            }
            System.out.println();
        }
        int size(){//getter
            return size;
        }
        int pop() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
       boolean isEmpty(){
            if(size==0) return true;
            return false;
       }


    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.push(9);
        st.push(7);

        System.out.println(st.size());


        st.push(7);
        st.push(0);
        st.display();
        st.push(100);

    }
}
// advantage of array implementation of stack over linked list
// size for every element we are taken space is one block
// disadvantage  fixed size is overflow
//size is wasted if more length array
// 0(1) in dispaly

//advantage of ll over array unlimited size
// disadvantage is two data members
// displaye d in reverse and space complexity
//0(n)
