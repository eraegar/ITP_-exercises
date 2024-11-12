import java.util.Scanner;

public class Vending_machine{

    public enum Drinks {
        COKE_COLA("Coke_Cola", 85),
        SPRITE("Sprite", 80),
        FANTA("Sprite" , 75);

        private String name;
        private double price;

        Drinks(String name, double price){
            this.name = name;
            this.price = price;
        }

        public String getName(){
            return this.name;
        }

        public double getPrice(){
            return this.price;
        }
    }
}