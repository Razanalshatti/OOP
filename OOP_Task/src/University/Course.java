package University;
public class Course {
    String course;
    String instructor;
    int enrolledStudent;

   @Override
        public String toString(){
            return "Course name: "+ course +", Instructor: " + instructor +" Students num: "+ enrolledStudent;
        }

    Course(String courseName , String instructorName, int numberOfStudentEnrolled){
        course = courseName;
        instructor = instructorName;
        enrolledStudent = numberOfStudentEnrolled;
        }
        
    public String getCourse(){
            return course;
        }
        public void setCourse(String newCourse){
            course = newCourse;
        }
        public String getInstructor(){
            return instructor;
        }
        public void setInstructor(String newInstructor){
            course = newInstructor;
        }
        public int getEnrolledStudent(){
            return enrolledStudent;
        }
        public void setEnrolledStudent(String newEnrolledStudent){
            course = newEnrolledStudent;
        }


     

public static void main(String[] args) throws Exception {
    Course java = new Course("Java", "Salwa", 20);
    
System.out.println(java.toString());
}
}

    