package Fer.company;

import java.util.HashMap;
import java.util.Map;

public class Bowling {

    HashMap<String, Integer> players;

    Bowling(){
        players = new HashMap<>();
    }
    public void addPlayer(String name, int points){
        players.put(name, points);
    }
    public void getWinner(){

        int maxPoint = 0;
        String winner = "";

        for(Map.Entry<String, Integer> item : players.entrySet()){

            if(maxPoint == 0){
                maxPoint = item.getValue();
                continue;
            }

            if(item.getValue() > maxPoint){
                maxPoint = item.getValue();
                winner = item.getKey();
            }
        }

        System.out.println(winner);
    }
}
