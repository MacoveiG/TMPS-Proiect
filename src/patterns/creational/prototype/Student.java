package patterns.creational.prototype;

import internal.models.Library;

public class Student extends User{
    private String faculty;


    public Student( String name, String surname, int birthYear, String university, int accessGrade, Library library, String faculty) {
        super(name, surname, birthYear, university, accessGrade, library);
        this.faculty = faculty;
    }
    public Student(int id, String name, String surname, int birthYear, String university, int accessGrade, Library library, String faculty) {
        super(id, name, surname, birthYear, university, accessGrade, library);
        this.faculty = faculty;
    }
    public Student(){}

    Student(Student source){
        super(source);
        this.faculty = source.faculty;
    }
    @Override
    public void toStringUser(){
        System.out.println("id: \t" + getId());
        System.out.println("Name: \t" + getName());
        System.out.println("Surname: \t" + getSurname());
        System.out.println("Birth year: \t" + getBirthYear());
        System.out.println("University: \t" + getUniversity());
        System.out.println("Access grade: \t" + getAccessGrade());
        System.out.println("Library: \t" + getLibrary().getName());
        System.out.println("Faculty: \t" + getFaculty());
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
