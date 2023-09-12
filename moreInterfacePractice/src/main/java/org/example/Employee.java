package org.example;

public class Employee implements Comparable<Employee>{

    String firstName;
    int age;

    Employee(String name, int age){
        this.firstName = name;
        this.age = age;
    }


    public int getCardID() {
        return age;
    }

    public int compareTo(Employee emp){
        if(this.age==emp.getCardID()){
            return 0;
        }else if (this.age > emp.getCardID()){
            return 1;
        }else{
            return -1;
        }
    }
}
