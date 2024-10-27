WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package model;

public class Customer extends User{
    
    public Customer(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
