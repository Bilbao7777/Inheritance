public class Person {
    //Instance Variable

    private String name;
    private int age;
    private String gender;


    public Person (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getgender() {
        return gender;
    }


    public void setgender(String gender) {
        this.gender = gender;
    }
    
    public void  displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("gender: " + gender);
    }

}
