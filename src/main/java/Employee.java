public class Employee {
    String name;
    String pps;
    String phone;
    String gender;
    int age;

    public Employee(String eName, String ePps, String ePhone, String eGender, int eAge) {
       name = eName ;
       pps = ePps;
       phone = ePhone;
       gender = eGender;
       age = eAge;
    }

    public int Name(){
        int a = name.length();
        if (a < 5 || a > 22){
            throw new IllegalArgumentException("Name should be 5 to 22 characters");
        }
        return a;
    }
}
