/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    String Name;
    int roll;
    int acount;
    int backlog;

    public int getAcount() {
        return acount;
    }

    public int getBacklog() {
        return backlog;
    }

    public Student(int roll, int acount, int backlog) {
        this.roll = roll;
        this.acount = acount;
        this.backlog = backlog;
    }
}
