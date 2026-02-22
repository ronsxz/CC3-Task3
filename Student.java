public class Student {
    private int studID;
    private String firstName;
    private String lastName;
    private int age;
    private int contactNumber;
    private String address;

    public Student(int studID, String firstName, String lastName, int age, int contactNumber, String address) {
        this.studID = studID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    public int getStudID() { 
        return studID; 
    }
    public String getFirstName() { 
        return firstName; 
    }
    public String getLastName() { 
        return lastName; 
    }
    public int getAge() { 
        return age; 
    }
    public int getContactNumber() { 
        return contactNumber; 
    }
    public String getAddress() { 
        return address; 
    }
}