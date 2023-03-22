package org.example;

public class Main {

    private int x;
    private int y;

    public Main(int x, int y) {
        this.x = x;
        this.y = y;
        Calculator();
    }

    public int Calculator(){
        int z;
        z = x + y;
        return z;
    }

}