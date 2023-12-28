package JavaOOP_2.Company;

import JavaOOP_2.Person.Person;

public class Company extends Person {
    private String companyName;

    public Company(String name, int age, String gender, String address, int phone , String companyName) {
        super(name, age, gender, address, phone);
        this.companyName = companyName;
    }
    public void getInformation(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Company name: " + companyName);
    }

    public static void main(String[] args) {
        Person p = new Company("Tuấn Anh" , 22, "Nam Định","Nam Định",902278192,"Học Mãi");
        p.getInformation();
    }
}
