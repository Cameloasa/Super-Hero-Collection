package se.lexicon;

public class Student implements Comparable<Student> {
    //Fields
    private int id;
    private String name;
    private int age;

    //Constructor


    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student student) {
        if(age == student.age){
            return 0;
        }else if (age > student.age){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
