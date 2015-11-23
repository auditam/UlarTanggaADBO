package Model;

import java.util.Random;

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
    
    private int currentPlayer;
    
    private boolean isThrowTwice;
    
    private Box[][] arrOfBox = new Box[10][10];
    
    private String typeOfTrans;
    
    private Transporter[] arrOfTrans;
    
    private Player[] arrOfPlayer;
    
    private Dice dice;
    
    public Board(int ladders, int snakes){
        this.numOfLadders =  ladders;
        this.numOfSnakes = snakes;
        this.arrOfPlayer = new Player[this.numOfPlayers];
        dice = new Dice();
        currentPlayer = 0;
        this.arrOfTrans = new Transporter[this.numOfLadders + this.numOfSnakes];
        placingTransporter(numOfLadders,numOfSnakes);
        for(int i = 0; i < arrOfBox.length; i++){
            for(int j = 0; i < arrOfBox[0].length; j++){
                if(arrOfBox[i][j] == null){
                    arrOfBox[i][j] = new Box(i, j);
                }
            }
        }
    }
    
    public int getNumOfTrans(){
        return (numOfSnakes + numOfLadders);
    }
    
    public int getNumOfPlayers(){
        return arrOfPlayer.length;
    }
    
    public Transporter[] getArrOfTrans(){
        return arrOfTrans;
    }
    
    public void setArrOfPlayer(Player[] player){
        this.arrOfPlayer = player;
    }
    
    public Box[][] getArrOfBox(){
        return arrOfBox;
    }
    
    public void nextPlayer(){
        if(isThrowTwice){
            isThrowTwice = false;
        }
        else{
            currentPlayer++;
            if(currentPlayer == arrOfPlayer.length){
                currentPlayer = 0;
            }
        }
        
    }
    
    private void placingTransporter(int ladders, int snakes){
        Random random = new Random();
        for(int i = 0; i < ladders; i++){
            
            int xStart = random.nextInt(10);
            int yStart = random.nextInt(8);
            int xEnd = random.nextInt(10);
            int yEnd = random.nextInt(9 - yStart) + yStart + 1;
            if(arrOfBox[xStart][yStart] == null && arrOfBox[xEnd][yEnd] == null){
                arrOfBox[xEnd][yEnd] = new Box(xEnd, yEnd);
                //arrOfBox[xStart][yStart] = new Transporter(xStart, yStart, arrOfBox[xEnd][yEnd],"Snake"); 
                arrOfTrans[i] = (Transporter) arrOfBox[xStart][yStart];
            }
        }
    }
}
