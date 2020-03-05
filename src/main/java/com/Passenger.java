package com;

public class Passenger {
    private String title;
    private String name;
    private String ID;
    private String phone;
    private int age;

    public Passenger(String title, String name, String ID, String phone, int age) throws IllegalArgumentException {
        setTitle(title);
        setName(name);
        setID(ID);
        setPhone(phone);
        setAge(age);
    }

    private void setTitle(String title) throws IllegalArgumentException {
        if (title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid Title entered");
        }
    }


    private void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name entered");
        }
    }

    private void setID(String ID) {
        if (ID.length() >= 10) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("Invalid ID length entered");
        }
    }

    private void setPhone(String phone) {
        if (phone.length() >= 10) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone entered");
        }
    }

    private void setAge(int age) {
        if (age >= 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age entered");
        }
    }
}
