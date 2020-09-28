package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean junior = true;
        boolean senior = true;
        boolean student = true;
        boolean ctestudy = true;
        boolean teachers = true;
        boolean admins = true;
        boolean workfromhome = true;

        if ((senior && junior) == ctestudy) {
            System.out.println("Windows Laptop Only");
        }
        if (teachers && admins == workfromhome) {
            System.out.println("Macbooks Only");
        } else {
            System.out.println("chromebook");
        }
    }