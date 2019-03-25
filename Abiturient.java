import java.util.Arrays;

public class Abiturient {
    private int id;
    private String Surname;
    private String Firstname;
    private String Patronymic;
    private String Adress;
    private String PhoneNumber;
    private int[] Grades;

    public Abiturient (int id, String Surname, String Firstname, String Patronymic, String Adress, String PhoneNumber, int[] Grades) {
        this.setId(id);
        this.setSurname(Surname);
        this.setFirstname(Firstname);
        this.setPatronymic(Patronymic);
        this.setAdress(Adress);
        this.setPhoneNumber(PhoneNumber);
        this.setGrades(Grades);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int[] getGrades() {
        return Grades;
    }

    public void setGrades(int[] grades) {
        Grades = grades;
    }

    public String toString(){
        return String.format("Abit №%d: %s %s %s from %s, %s, %s", id,Surname,Firstname,Patronymic,Adress,PhoneNumber, Arrays.toString(getGrades()));
    }
}
