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
public class Stack<E> {

    GenericArrayList<E> array;

    public Stack() {
        this.array = new GenericArrayList();
    }

    public void pop() {
        //remove from the end
        array.remove(array.size() - 1);
    }

    public void push(E obj) {
        //add in end
        array.add(obj);
    }

    public int size() {
        //get size
        return array.size();
    }

    public void purge() {
        //clear the array
        for (int i = 0; i < array.size(); i++) {
            pop();
        }
    }

    public Object peek() {
        //get the the value in the end
        return array.get(array.size() - 1);
    }

    public Object get(int index) {
        //get object in index
        return array.get(index);
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
