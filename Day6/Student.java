// NOTE: This is a sample implementation. Give it your own go before looking at this.
// Another thing, I also wrote this class using a totally different IDE than I'm used to and high as a kite so it may have fewer comments.

public class Student {
    
    private final static int MAX_GRADES = 50;

    private String name;

    private int[] grades;
    private int gradeCount;

    public Student() {
        /**
         * Create the default student
         */

        this.name = "This student has not been named";
        this.grades = new int[MAX_GRADES];
        this.gradeCount = 0;
    }

    public Student(String name) {
        /**
         * Creates a student with the provided name
         *
         * @param name: String
         */

        this.name = name;
        this.grades = new int[MAX_GRADES];
        this.gradeCount = 0;
    }

    public String getName() {
        /**
         * Get the student's name.
         *
         * @return String
         */

        return this.name;
    }

    public int[] getGrades() {
        /**
         * Get the student's grades.
         *
         * @return int[]
         */

        return this.grades;
    }

    public int getGradeCount() {
        /**
         * Get the number of grades recorded for the student.
         *
         * @return int
         */

        return this.gradeCount;
    }

    public void setName(String name) {
        /**
         * Set the student's name to the name provided.
         *
         * @param name: String
         */

        this.name = name;
    }

    public void addGrade(int grade) {
        /**
         * Add a grade to the student's record.
         *
         * @param grade: int
         *
         * @throws IllegalArgmentException, if the grade is out of bounds or the grade record is full.
         */
        
        if (this.gradeCount == MAX_GRADES) {
            throw new IllegalArgumentException("The student's record is full.");
        }
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grades may not be negative, nor greater than 100.");
        }

        this.grades[gradeCount] = grade;
        gradeCount++;
    }

    public double getAverage() {
        /**
         * Get the student's current average.
         *
         * @return double
         */

        double sum = 0.0;
        for(int idx = 0; idx < this.gradeCount; idx++) {
            sum += this.grades[idx];
        }
        return sum / gradeCount;
    }

    public int getHighest() {
        /**
         * Get the student's highest grade.
         *
         * @return int
         */

        int max = -1;
        for (int idx = 0; idx < gradeCount; idx++) {
            if (this.grades[idx] > max) {
                max = this.grades[idx];
            }
        }
        return max;
    }

    public int getLowest() {
        /**
         * Get the student's lowest grade.
         *
         * @return int
         */

        int min = 100;
        for (int idx = 0; idx < gradeCount; idx++) {
            if (this.grades[idx] < min) {
                min = this.grades[idx];
            }
        }
        return min;
    }

    public static void printGradeRecord(Student student) {
        System.out.print(student.getName() + " has grades: [");
        for (int i = 0; i < student.getGradeCount(); i++) {
            System.out.print(student.getGrades()[i]);
            if (i != student.getGradeCount() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("].");

    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Human McPersonface");

        Student student2 = new Student("Luke Altamura");
        Student student3 = new Student("Armaan Vakharia");

        student1.addGrade(44); // he had a bad day.
        student2.addGrade(100); // fuck yea good job luke!
        student3.addGrade(36); // fun fact this was my grade on my Intro to Electrical Engineering midterm.
        
        student2.addGrade(99); // hell yea that's what we like to see
        student3.addGrade(99); // ok we back

        System.out.println(student1.getName() + " has " + student1.getGradeCount() + " grades recorded.");
        System.out.println(student2.getName() + " has " + student2.getGradeCount() + " grades recorded.");
        System.out.println(student3.getName() + " has " + student3.getGradeCount() + " grades recorded.");

        printGradeRecord(student1);
        printGradeRecord(student2);
        printGradeRecord(student3);

        System.out.println(student1.getName() + "'s higest grade was " + student1.getHighest() + ", lowest was " + student1.getLowest() + ", and they averaged " + student1.getAverage());
        System.out.println(student2.getName() + "'s higest grade was " + student2.getHighest() + ", lowest was " + student2.getLowest() + ", and they averaged " + student2.getAverage());
        System.out.println(student3.getName() + "'s higest grade was " + student3.getHighest() + ", lowest was " + student3.getLowest() + ", and they averaged " + student3.getAverage());
    }
}
