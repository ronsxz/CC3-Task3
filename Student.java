public class Student {
    private int contactNumber;
    private String address;

    public Student(int contactNumber, String address) {

        this.contactNumber = contactNumber;
        this.address = address;
    }
    public int getContactNumber() { 
        return contactNumber; 
    }
    public String getAddress() { 
        return address; 
    }
}