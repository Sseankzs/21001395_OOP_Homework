public class Student {
    private Name name;
    private Address address;
    private School school;
    private float marks[] = new float[5];

    public Student() {
    }

    public Student(Name name, Address address, School school, float[] marks) {
        this.name = name;
        this.address = address;
        this.school = school;
        this.marks = marks;
    }

    public float calcAvg(){
        float average = 0;
        float total = 0;
        for(int i = 0; i < marks.length ; i++){
            total += marks[i];
        }
        average = total / 5;

        return average;
    }

    public Name getName() {
        return name;
    }

    public void setName(String fname, String mname, String lname){
        Name name = new Name(fname, mname, lname);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String unit, String street, String city, String zipcode, String state){
        this.address = new Address(unit, street, city, zipcode, state);
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public float getMarks(int i) {
        return marks[i];
    }

    public void setMarks(float marks, int i) {
        this.marks[i] = marks;
    }
}
