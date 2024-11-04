import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    // Constructor to initialize all variables
    public Student(String name, String studentID, String year, Degree degree) {
        super(name); // Initializes the name field in Person
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = new ArrayList<>(); // Initializes an empty ArrayList
    }

    // Method to display student information (implementation of abstract method from Person)
    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        System.out.println("Degree: " + (degree != null ? degree.getName() : "No Degree Assigned"));
    }

    // Getter and Setter for studentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter and Setter for year
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    // Method to register a degree
    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    // Method to display degree information
    public void displayDegreeInfo() {
        if (degree != null) {
            degree.displayInfo(); // Assuming Degree has a displayInfo() method
        } else {
            System.out.println("No degree registered.");
        }
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    // Method to unenroll from a course
    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    // Method to list all enrolled courses
    public void listCoursesEnrolled() {
        if (coursesEnrolled.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("Courses Enrolled:");
            for (Course course : coursesEnrolled) {
                course.displayInfo(); // Assuming Course has a displayInfo() method
            }
        }
    }
}
