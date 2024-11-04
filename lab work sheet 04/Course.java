public class Course {
    private String name;
    private String enrollType;
    private Integer numberofStudentsEnrolled;
    private Lecturer lectureIncharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, Integer numberofStudentsEnrolled){
        this.name = name;
        this.enrollType = enrollType;
        this.numberofStudentsEnrolled = numberofStudentsEnrolled;
    }

    public void displayInfo(){
        System.out.println("Course Name:" + name);
        System.out.println("Enroll Type:" + enrollType);
        System.out.println("Numberof Students Enrolled:" + numberofStudentsEnrolled);
        if(lectureIncharge != null){
            System.out.println("Lecture Incharge:" + lectureIncharge.getName());
        }else{
            System.out.println("no lecture assigned");
        }

        if(degreeBelongsTo != null){
            System.out.println("Degree associated:" + degreeBelongsTo.getName());
        }else{
            System.out.println("No degree assigned");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEnrollType(){
        return enrollType;
    }

    public void setEnrollType(String enrollType){
        this.enrollType = enrollType;
    }

    public Integer getNumberofStudentsEnrolled(){
        return numberofStudentsEnrolled;
    }

    public void setNumberofStudentsEnrolled(Integer numberofStudentsEnrolled){
        this.numberofStudentsEnrolled = numberofStudentsEnrolled;
    }

    public void addLectureIncharge(Lecturer lecture){
        this.lectureIncharge = lecture;
    }

    public void removeLectureIncharge(){
        this.lectureIncharge = null;
    }

    public void addDegreeBelongsTo(Degree degree){
        this.degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo(){
        this.degreeBelongsTo = null;
    }
}
