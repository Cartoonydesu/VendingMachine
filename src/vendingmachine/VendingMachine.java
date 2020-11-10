
package vendingmachine;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        //DrinkTest();
        //System.out.println("");
        //MachineTest();
        TestApp();
    }
    
    public static void TestApp(){
        //show Menu
        Drink cola = new Drink("Cola",15,0);
        Drink water = new Drink("Water",7,6);
        Drink milk = new Drink("Milk",12,4);
        Drink juice = new Drink("Orange Juice",13,2);
        Machine m = new Machine(6);
        m.addDrink(cola);
        m.addDrink(water);
        m.addDrink(milk);
        m.addDrink(juice);
        int select;
        do{
        System.out.println(m);
        //input coin
        Scanner scn = new Scanner(System.in);
            // new money
            int money;
            System.out.print("Enter your money:");
            money = scn.nextInt();
            scn.nextLine();
            // select 
            System.out.print("Select Drink:");
            select = scn.nextInt();
            if(select!=-1){
                if(m.getNumdrink(select)==0){
                    m.soldOut(money);
                }
                else if(money<m.getCostdrink(money, select)){
                    // How to cancel
                    m.notEnough(money);
                }
                else if(money>=m.getCostdrink(money, select)){
                    m.buy(money, select);
                }
            }
            scn.nextLine();
            System.out.println("");
        }while(select != -1);
    }
    
    public static void DrinkTest(){
        Drink cola = new Drink("Cola",15,5);
        Drink water = new Drink("Water",7,6);
        Drink milk = new Drink("Milk",12,4);
        System.out.println(cola);
        System.out.println(water);
        System.out.println(milk);
        water.addNum(2);
        System.out.println(water);
    }
    
    public static void MachineTest(){
        //เมนู        
        Drink cola = new Drink("Cola",15,5);
        Drink water = new Drink("Water",7,6);
        Drink milk = new Drink("Milk",12,4);
        Drink juice = new Drink("Orange Juice",13,2);
        Machine m = new Machine(6);
        m.addDrink(cola);
        m.addDrink(water);
        m.addDrink(milk);
        m.addDrink(juice);
        System.out.println(m);
        
         
    }
    
}
