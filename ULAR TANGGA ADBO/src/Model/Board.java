package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priambodo_pangestu
 */
public class Board {
    private int numOfSnakes;
    private int numOfLadders;
    private int numOfPlayers;
    private Box[][] arrOfBox;
    private Transporter[] arrOfTrans;
    private Player[] arrOfPlayer;
    private Dice theDice;
    
    public Board(){
        
    }
    
    public void setArrOfPlayer(){
        
    }
    
    public Player[] getArrOfPlayer(){
        return arrOfPlayer;
    }
    
    public int getSumOfTransporter(){
        return 0;
    }
    
    public int getNumOfPlayers(){
        return 0;
    }
    
    
}
