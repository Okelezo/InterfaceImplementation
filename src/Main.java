
/*
 * Implement the DequeueInterface. It functionality is described in the
 * comments
 *
 * You should demonstrate the use of this data structure
 * in the main method below
 */

import java.util.Deque;
import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {

        DequeueInterface dq = new DequeueInterfaceImpl();

        dq.addFront("John");


        dq.addFront("Paul");


        dq.addFront("Simon");
        System.out.println(dq.removeFront());

        dq.addRear("Peter");


        dq.addRear("Zack");


        dq.addRear("Bill");
        System.out.println(dq.removeRear());
        System.out.println(dq);
    }
}