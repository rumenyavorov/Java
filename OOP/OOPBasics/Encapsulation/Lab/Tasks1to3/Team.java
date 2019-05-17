package OOP.OOPBasics.Encapsulation.Lab.Tasks1to3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {
    private String name;
    private List<Person> firstTeamPlayers;
    private List<Person> reserveTeamPlayers;

    public Team(String name){
        this.setName(name);
        this.firstTeamPlayers = new ArrayList<>();
        this.reserveTeamPlayers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final List<Person> getFirstTeamPlayers() {
        return firstTeamPlayers;
    }

    public void setFirstTeamPlayers(List<Person> firstTeamPlayers) {
        this.firstTeamPlayers = firstTeamPlayers;
    }

    public final List<Person> getReserveTeamPlayers() {
        return reserveTeamPlayers;
    }

    public void setReserveTeamPlayers(List<Person> reserveTeamPlayers) {
        this.reserveTeamPlayers = reserveTeamPlayers;
    }

    public void addPlayer(Person person){
        if(person.getAge() < 40){
            firstTeamPlayers.add(person);
        } else {
            reserveTeamPlayers.add(person);
        }
    }
}
