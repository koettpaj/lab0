package xyz.hihat;


public class Main {

    public static void main(String[] args) {
        Person jag = new Person();
        Student kompis;
        try{
            kompis= new Student();
            System.out.println(kompis);}

        catch(java.lang.IllegalArgumentException e1){
            System.out.println("fuck");
        }

        System.out.println(jag);


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

    public String toString(){
        return ("namn: " + name + ", ålder: " + age+", började på CINEK: "+year);
    }
}