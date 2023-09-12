package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLastNames {

    public static void main(String[] args) {
        List<Employee> em = new ArrayList<>();

        em.add(new Employee("Henry",21));
        em.add(new Employee("Nal",60));
        em.add(new Employee("Frank",30));
        em.add(new Employee("Deborah",27));
        em.add(new Employee("George",24));
        em.add(new Employee("Tampy",45));
        em.add(new Employee("Jen",16));

        Collections.sort(em,(Employee::compareTo));
        for(Employee str:em){
            System.out.println(str.firstName+" : "+str.age);
        }

    }
}
