import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    // Constructor to initialize all variables
    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>(); // Initializes an empty ArrayList for courses
        this.lecturersBelongsTo = new ArrayList<>(); // Initializes an empty ArrayList for lecturers
    }

    // Method to display department information
    public void displayInfo() {
        System.out.println("Department Name: " + name);
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        } else {
            System.out.println("No department head appointed.");
        }
        System.out.println("Courses Offered:");
        listCoursesOffering();
        System.out.println("Lecturers in Department:");
        listLecturers();
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to appoint a department head
    public void appointDepartmentHead(Lecturer lecturer) {
        this.departmentHead = lecturer;
    }

    // Method to display department head information
    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            departmentHead.displayInfo(); // Assuming Lecturer has a displayInfo() method
        } else {
            System.out.println("No department head appointed.");
        }
    }

    // Method to offer a course (add to coursesOffering list)
    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    // Method to withdraw a course (remove from coursesOffering list)
    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    // Method to add a lecturer to the department
    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    // Method to remove a lecturer from the department
    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }

    // Helper method to list all courses being offered in the department
    private void listCoursesOffering() {
        if (coursesOffering.isEmpty()) {
            System.out.println("No courses offered.");
        } else {
            for (Course course : coursesOffering) {
                course.displayInfo(); // Assuming Course has a displayInfo() method
            }
        }
    }

    // Helper method to list all lecturers in the department
    private void listLecturers() {
        if (lecturersBelongsTo.isEmpty()) {
            System.out.println("No lecturers in the department.");
        } else {
            for (Lecturer lecturer : lecturersBelongsTo) {
                lecturer.displayInfo(); // Assuming Lecturer has a displayInfo() method
            }
        }
    }
}
