/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondyear_stack.queue_arrays;

/**
 *
 * @author jit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n*****************Stack*****************\n");
        Stack<String> Stack = new Stack();
        String str = "Abdullah";
        String str2 = "Mohammed";
        String str3 = "Ali";

        Stack.push(str);
        Stack.push(str2);
        Stack.push(str3);
        Stack.pop();

        for (int i = 0; i < Stack.size(); i++) {
            System.out.println(Stack.get(i));
        }

        System.out.println("\n*****************Queue*****************\n");

        Queue<String> Queue = new Queue();
        String str11 = "Abdullah";
        String str12 = "Mohammed";
        String str13 = "Ali";

        Queue.enqueue(str11);
        Queue.enqueue(str12);
        Queue.enqueue(str13);
        Queue.dequeue();

        for (int i = 0; i < Queue.size(); i++) {
            System.out.println(Queue.get(i));
        }
    }

}
