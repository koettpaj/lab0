package xyz.hihat;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int count=0;
        List list= new ArrayList();
        while(list.size()<11){
            try{
                Student kompis= new Student();
                list.add(kompis);}

            catch(java.lang.IllegalArgumentException e1){
                System.out.println("bad guess dude");
            }

        }

        System.out.println(list);




    }
}

class Person {
    protected int age;
    protected String name;
    static String[] firstNames={"Ahmed","Berit","Carl","Doris","Edward","Frida","Gustav","Henrietta","Jesper","Kristina"};

    public Person(){
        this(firstNames[(int)(Math.random()*firstNames.length)],((int) (Math.random() * (100- 15) + 15)));
    }


    public Person(String nameIn, int ageIn) {
        age = ageIn;
        name = nameIn;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return ("namn: " + name + ", ålder: " + age);
    }
}

class Student extends Person{
    private int year;

    public Student(){
        this((int)(Math.random() * (2017- 1934) + 1934));
    }

    public Student(int inYear){
        if(inYear<1934 || inYear>2016 || (inYear-(2017-age)<15)){
            throw new IllegalArgumentException("Invalid year");}
        year=inYear;

    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return ("namn: " + name + ", ålder: " + age+", började på CINEK: "+year);
    }
}