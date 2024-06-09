package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

public class PointXYZMain {

    public static void main(String[] args) {
        User user = new User(120030104, "Alex", "Chatzis");

        UserCredentials userCredentials = new UserCredentials(123012052, "Christina", "K.");

        System.out.println("ID: " + user.getId());
        System.out.println("First Name: " + user.getFirstname());
        System.out.println("Last Name: " + user.getLastname());

        System.out.println("ID: " + userCredentials.getId());
        System.out.println("First Name: " + userCredentials.getFirstname());
        System.out.println("Last Name: " + userCredentials.getLastname());


    }
}
