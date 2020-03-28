/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("yash", 60);
        obj.insert("Rohit", 1);
        obj.insert("kan", 20);
        obj.insert("vishwarya", 2);
        obj.insert("deshya", 9);
        System.out.println("Students according to their roll number are: ");
        obj.peep();
    }
}
