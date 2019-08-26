package org.launchcode.Lineupcard.models;

public class Player {

    private static int idGenerator = 0;

    private String name;
    private int number;
    private int age;
    private int playerId;

    public Player(){
        idGenerator++;
        this.playerId = idGenerator;
    }

    public Player(String name, int number, int age) {
        this();
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }
}
