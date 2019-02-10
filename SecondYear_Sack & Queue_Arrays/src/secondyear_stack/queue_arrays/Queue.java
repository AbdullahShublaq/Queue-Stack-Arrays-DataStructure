/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondyear_stack.queue_arrays;

/**
 *
 * @author jit
 * @param <E>
 */
public class Queue<E> {

    GenericArrayList<E> array;

    public Queue() {
        this.array = new GenericArrayList();
    }

    public void dequeue() {
        //REMOVE FROM THE FRONT
        array.remove(0);
    }

    public void enqueue(E obj) {
        //ADD IN THE END
        array.add(obj);
    }

    public int size() {
        //GET SIZE
        return array.size();
    }

    public Object get(int index) {
        //GET HTE OBJECT IN INDEX
        return array.get(index);
    }

    public void clear() {
        for (int i = 0; i < array.size(); i++) {
            dequeue();
        }
    }

    public Object getHead() {
        return array.get(0);
    }
}
