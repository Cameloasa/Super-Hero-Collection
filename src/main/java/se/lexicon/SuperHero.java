package se.lexicon;

public class SuperHero implements Comparable<SuperHero> {


    // fields
    private int id;
    private String name;
    private int age;

    //Constructor

    public SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(SuperHero superHero) {
        if (id > superHero.getId()) {
            return 1;
        } else if (id < superHero.getId()) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "SuperHero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}





