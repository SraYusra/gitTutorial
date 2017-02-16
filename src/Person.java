import java.util.*;
/**
 * Created by ethan on 2017-02-07.
 */
abstract class Person {
    String name;
    String emailAddress;
    List<Course> courseList = new ArrayList<>();

    Person(String name, String emailAddress){
        this.name=name;
        this.emailAddress=emailAddress;
    }

    public void addCourse(Course c){
        courseList.add(c);
    }
}
