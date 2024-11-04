
public class UniversityManagementSystem {
    public static void main(String[] args) {

        Department softwareEngineering = new Department("SoftwareEngineering");
        Department computerSystemEngineering = new Department("ComputerSystemEngineering");
        Department appliedComputing = new Department("AppliedComputing");

        Degree computerScience = new Degree("ComputerScience", 200);
        Degree BICT = new Degree("Information and Communication Technology", 300);
        Degree ET = new Degree("EngineeringTechnology", 400);

        Course OOP = new Course("objct-oriented-programming","core", 200);
        Course ADBMS = new Course("advance database management systems","core", 200);
        Course DSA = new Course("datastructures and algorithms","core", 200);
        Course CN = new Course("computer networking","core", 200);
        Course STAT = new Course("statistics","optional", 170);

        Lecturer lecturer1 = new Lecturer("Dr. Jone Doe", "senior lecturer");
        Lecturer lecturer2 = new Lecturer("Dr. Amarasiri Peeris", "senior lecturer");
        Lecturer lecturer3 = new Lecturer("Mr. Shani Abesekara", " assistant senior lecturer");
        Lecturer lecturer4 = new Lecturer("Dr. Latha Walpola", "junior lecturer");
        Lecturer lecturer5 = new Lecturer("Dr. Rosa", "senior lecturer");

        softwareEngineering.appointDepartmentHead(lecturer1);
        softwareEngineering.offerCourse(OOP);
        computerScience.offerCourse(OOP);

        OOP.addLectureIncharge(lecturer1);
        OOP.addDegreeBelongsTo(computerScience);


        Student student1 = new Student("chamika nimnajith","cs/2021/021","second year", computerScience);

        student1.enrollCourse(OOP);

        System.out.println("Lecture Information:");
        lecturer1.displayInfo();

        System.out.println("\nStudent Information");
        student1.displayInfo();

        System.out.println("\nDepartment Information");
        softwareEngineering.displayInfo();

        System.out.println("\nCourse Information");
        OOP.displayInfo();

        System.out.println("\nDegree Information");
        computerScience.displayInfo();



    }
}
