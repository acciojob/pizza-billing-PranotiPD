package com.driver;


public class Pizza {

    boolean extraCheese = false;
    boolean extraToppings = false;
    boolean paperBag = false;
    boolean getBill = false;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = price;
        this.bill = bill;
        if(isVeg){
            price += 300;
        }
        else{
            price += 400;
        }
        // your code goes here
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese==true){
            return;
        }
        price = price + 80;
        extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings == true){
            return;
        }
        if(isVeg){
            price = price + 70;
        }
        else{
            price = price + 120;
        }
        extraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag == true){
            return;
        }
        price = price + 20;
        paperBag = true;
    }

    public String getBill(){
        // your code goes here
        bill = "";
        if(getBill == false){
            if(isVeg){
                bill += "Base Price Of The Pizza: 300"+"\n";
            }
            else{
                bill += "Base Price Of The Pizza: 400"+"\n";
            }
            if(extraCheese){
                bill += "Extra Cheese Added: 80"+"\n";
            }
            if(extraToppings){
                if(isVeg){
                    bill += "Extra Toppings Added: 70"+"\n";
                }
                else{
                    bill += "Extra Toppings Added: 120"+"\n";
                }
            }
            if(paperBag){
                bill += "Paperbag Added: 20"+"\n";
            }
        }
        getBill = true;

        bill = "Total Price: "+ String.valueOf(getPrice())+"\n";
        return this.bill;
    }
}
