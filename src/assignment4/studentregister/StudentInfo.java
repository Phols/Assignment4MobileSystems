package assignment4.studentregister;

public class StudentInfo implements Comparable<StudentInfo>  {
    private String firstName;
    private String lastName;
    private String city;
    private String ipAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public StudentInfo(String firstName, String lastName, String city, String ipAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.ipAddress = ipAddress;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(firstName.compareTo(o.firstName) == 0){
         return lastName.compareTo(o.lastName);
        } else {
            return firstName.compareTo(o.firstName);
        }
    }

    @Override
    public boolean equals(Object o){
        if(this.equals(o)){ return true; }
        if (o == null || getClass() != o.getClass()) return false;
        StudentInfo info = (StudentInfo) o;
        if (info.firstName.equals(((StudentInfo) o).firstName) && info.lastName.equals(((StudentInfo) o).lastName)){
            return true;
        } else {
            return false;
        }
    }
}
