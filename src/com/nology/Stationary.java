package com.nology;

public interface Stationary {

    int totalPens();
    int totalStaplers();
    int totalStaples();
    int totalRulers();
    int totalA4Booklets();

    void addPens(int amount);
    void addStaplers(int amount);
    void addStaples(int amount);
    void assRulers(int amount);
    void addA4Booklets(int amount);

    void removePens(int amount);
    void removeStaplers(int amount);
    void removeStaples(int amount);
    void removeRulers(int amount);
    void removeA4Booklets(int amount);
}
