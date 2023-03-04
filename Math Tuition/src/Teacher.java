public class Teacher {
    private Name name;
    private Address address;
    private String qualification;
    private int numyearexp;


    public Name getName() {
        return name;
    }

    public void setName(String fname, String mname, String lname) {
        this.name = new Name(fname, mname, lname);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String unit, String street, String city, String zipcode, String state) {
        this.address = new Address(unit, street, city, zipcode, state);
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getNumyearexp() {
        return numyearexp;
    }

    public void setNumyearexp(int numyearexp) {
        this.numyearexp = numyearexp;
    }
}
