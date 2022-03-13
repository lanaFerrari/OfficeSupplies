package com.nology;

public class OfficeSupplies implements Stationary {

    private int pens;
    private int staplers;
    private int staples;
    private int rulers;
    private int a4Booklets;
    private int totalSupplies;

    public OfficeSupplies(int pens, int staplers, int staples, int rulers, int a4Booklets, int totalSupplies) {
        this.pens = pens;
        this.staplers = staplers;
        this.staples = staples;
        this.rulers = rulers;
        this.a4Booklets = a4Booklets;
        this.totalSupplies = totalSupplies;
    }

    public OfficeSupplies(){}

    @Override
    public int totalPens() {
        return this.pens;
    }

    @Override
    public int totalStaplers() {
        return this.staplers;
    }

    @Override
    public int totalStaples() {
        return this.staples;
    }

    @Override
    public int totalRulers() {
        return this.rulers;
    }

    @Override
    public int totalA4Booklets() {
        return this.a4Booklets;
    }

    @Override
    public void addPens(int amount) {
        pens += amount;
    }

    @Override
    public void addStaplers(int amount) {
        staplers += amount;
    }

    @Override
    public void addStaples(int amount) {
        staples += amount;
    }

    @Override
    public void assRulers(int amount) {
        rulers+= amount;
    }

    @Override
    public void addA4Booklets(int amount) {
        a4Booklets += amount;
    }

    @Override
    public void removePens(int amount) {
        if( pens >= 0 || pens < amount){
            System.out.println("Not enough pens");
        }else{
            pens -= amount;
            System.out.println("You have "+ pens + " pens");
        }
    }

    @Override
    public void removeStaplers(int amount) {
        if( staplers >= 0 || staplers < amount){
            System.out.println("Not enough staplers");
        }else{
            staplers -= amount;
            System.out.println("You have "+ staplers + " staplers");
        }
    }

    @Override
    public void removeStaples(int amount) {
        if( staples >= 0 || staples < amount){
            System.out.println("Not enough staples");
        }else{
            staples -= amount;
            System.out.println("You have "+ staples + " staples");
        }
    }

    @Override
    public void removeRulers(int amount) {
        if( rulers >= 0 || rulers < amount){
            System.out.println("Not enough rulers");
        }else{
            rulers -= amount;
            System.out.println("You have "+ rulers + " rulers");
        }
    }

    @Override
    public void removeA4Booklets(int amount) {
        if( a4Booklets >= 0 || a4Booklets < amount){
            System.out.println("Not enough a4Booklets");
        }else{
            a4Booklets -= amount;
            System.out.println("You have "+ a4Booklets + " a4Booklets");
        }
    }

}
