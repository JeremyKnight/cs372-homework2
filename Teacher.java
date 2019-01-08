public class Teacher extends Person {
    int gradeLevel;
    String certification;
    public Teacher(String name, int age, int phoneNumber, int gradeLevel, String certification){
        super(name, age, phoneNumber);
        this.gradeLevel = gradeLevel;
        this.certification = certification;
    }

    /**
     * @return the certification
     */
    public String getCertification() { return certification; }
    /**
     * @param certification the certification to set
     */
    public void setCertification(String certification) { this.certification = certification; }
    /**
     * @return the gradeLevel
     */
    public int getGradeLevel() { return gradeLevel; }
    /**
     * @param gradeLevel the gradeLevel to set
     */
    public void setGradeLevel(int gradeLevel) { this.gradeLevel = gradeLevel; }
}