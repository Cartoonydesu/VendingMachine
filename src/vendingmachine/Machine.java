
package vendingmachine;

public class Machine {
    private final Drink machine[];
    private int index = 0;
    
    public Machine(int size){
        machine = new Drink[size<=0 ? size : 12];
    }
    public void addDrink(Drink drink){
        if(index<=machine.length){
            machine[index] = drink;
            index++;
        }
    }
    @Override
    public String toString(){
        System.out.println("Allow drink in machine:");
        for (int i = 0; i < index; i++) {
            System.out.println(i + ": " +   machine[i]);
        }
        return "";
    }
}
