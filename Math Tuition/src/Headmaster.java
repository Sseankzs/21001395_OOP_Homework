public class Headmaster {
    private Name name;

    public void setname(String fname, String mname, String lname){
        name = new Name(fname, mname, lname);
    }

    public String getName() {
        String fullname = name.getFullname();
        return fullname;
    }

}
