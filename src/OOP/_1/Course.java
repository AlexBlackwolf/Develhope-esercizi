package OOP._1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    int maxStudents;
    double qualityRatingOutOf10;
    boolean isCourseMandatory;
    String teacherName;
    List<Student> students = new ArrayList<>();
}