package se.lexicon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // Create a list of superHeroes

        List<Student> students = new ArrayList<>();

        // Add students to de list with Add method
        students.add(new Student(1,"John Doe",23));
        students.add(new Student(2,"Mike Pence",24));
        students.add(new Student(3,"Bobby Kirby",25));
        // Sorting the lis using Collections and Sort
        Collections.sort(students);
        for (Student student :students){
        System.out.println(student);}

        //Print
        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero(1,"SpiderMan",22));
        superHeroes.add(new SuperHero(2,"IronMan",40));
        superHeroes.add(new SuperHero(3,"DoctorStrange",45));
        superHeroes.add(new SuperHero(4,"CaptainPlanet",102));
        Collections.sort(superHeroes);
        for (SuperHero superHero : superHeroes){
            System.out.println(superHero);
        }

      










    }
}
