
package vendingmachine;

public class VendingMachine {

    public static void main(String[] args) {
        //DrinkTest();
        //System.out.println("");
        MachineTest();
    }
    
    /*public static void DrinkTest(){
        Drink cola = new Drink("Cola",15,5);
        Drink water = new Drink("Water",7,6);
        Drink milk = new Drink("Milk",12,4);
        System.out.println(cola);
        System.out.println(water);
        System.out.println(milk);
        water.addNum(2);
        System.out.println(water);
    }*/
    
    public static void MachineTest(){
        Drink cola = new Drink("Cola",15,5);
        Drink water = new Drink("Water",7,6);
        Drink milk = new Drink("Milk",12,4);
        Machine m = new Machine(6);
        m.addDrink(cola);
        m.addDrink(water);
        m.addDrink(milk);
        System.out.println(m);
    }
    
}
