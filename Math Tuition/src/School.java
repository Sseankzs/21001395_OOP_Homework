public class School {
    private Address address;
    private String name;

    public School() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String unit, String street, String city, String zipcode, String state) {
        this.address = new Address(unit, street, city, zipcode, state);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
