/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    Node font;
    Node rear;
    int count;

    public MyCircularQueue() {
        this.font = null;
        this.rear = null;
        this.count = 0;
    }
}
