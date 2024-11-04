import java.util.ArrayList;

public class Degree {
    private String name;
    private Integer numberofStudents;
    private ArrayList<Course> coursesOffering;


    public Degree(String name, Integer numberofStudents){
        this.name = name;
        this.numberofStudents =numberofStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public void displayInfo(){
        System.out.println("Degree name:" + name);
        System.out.println("Number of Students:" + numberofStudents);
        System.out.println("Courses Offering:");
        listCourcesOffering();
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getNumberofStudents(){
        return  numberofStudents;
    }
    public void setNumberofStudents(Integer numberofStudents){
        this.numberofStudents = numberofStudents;
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void listCourcesOffering(){
        if(coursesOffering.isEmpty()){
            System.out.print("No courses offered");
        }else{
            for(Course course : coursesOffering){
                course.displayInfo();
            }
        }
    }
}
