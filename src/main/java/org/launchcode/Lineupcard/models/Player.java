package org.launchcode.Lineupcard.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Player {

    private static int idGenerator = 0;

    @NotNull
    @Size(min = 3, message = "Must have at least 3 characters.")
    private String name;

    @NotNull
    @Min(value = 0, message = "Must be at least 0")
    @Max(value = 99, message = "Cannot have a number higher than 99")
    private int number;

    @NotNull
    @Min(value = 16, message = "Must be at least 16")
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
