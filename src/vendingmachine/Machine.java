
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
    public int getNumdrink(int select){
        return machine[select].getNum();
    }
    public int getCostdrink(int money,int select){
        return machine[select].getCost();
    }
    public void soldOut(int money){
            System.out.println("Sold Out");
            System.out.println("Return : " + money + " bahts");
    }
    public void notEnough(int money){
            System.out.println("Not enough money to buy");
            System.out.println("Return : " + money + " bahts");   
    }
    public void buy(int money,int number){
            money = money - machine[number].getCost();
            machine[number].tookOut();
            System.out.println("Output : " + machine[number].getName()+
                                "\nChange : " + money + " bahts");
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
