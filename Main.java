public class Main {
    public static void main(String[] args) {
        Character Character1 = new Character ("Alice", 25, "Female",185, 80, "Blue"); 
        Character Character2 = new Character ("Bob", 30, "Male", 196, 190, "blonde");
        Character Character3 = new Character ("Charlie", 35, "Male", 185, 160, "red");
        Character Character4 = new Character ("David", 40, "Male", 123, 233,"black");
        Character Character5 = new Character ("Eve", 45, "Female", 123, 345, "brown");
        Character Character6 = new Character ("Frank", 50, "Male", 123, 1234, "green");
        Character Character7 = new Character ("George", 55, "Male", 322, 342, "pink");

        Character1.displayInfo();
        System.out.println();
        Character2.displayInfo();
        System.out.println();
        Character3.displayInfo();
        System.out.println();
        Character4.displayInfo();
        System.out.println();
        Character5.displayInfo();
        System.out.println();
        Character6.displayInfo();
        System.out.println();
        Character7.displayInfo();

        System.out.println("\nAccessing individual properties:");
    }

}
