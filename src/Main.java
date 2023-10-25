public class Main {
    public static void main(String[] args) {
        StudentSchoolDataValidator sdv = new StudentSchoolDataValidator();
        sdv.validate(new Student());
        sdv.send("your avg score ig good");
    }
}