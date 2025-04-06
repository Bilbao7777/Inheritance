public class Character extends Person{
    private int height; 
    private int weight;
    private String hairColor;

    public Character(String name, int age, String gender, int height, int weight, String hairColor){
        super(name, age, gender);
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
      
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("height: "+ height);
        System.out.println("weight: "+ weight);
        System.out.println("hairColor: "+ hairColor);
    }


}
