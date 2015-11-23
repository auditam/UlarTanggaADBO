/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Board;
import Model.Player;
import Model.Transporter;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author priambodo_pangestu
 */
public class GameController implements ActionListener{
    private Board board;
    
    //private GUI view; <----nama sementara nunggu bagian view
    
    private Timer timer;
    
    private int frame;
    
    public GameController(){
        this.timer=new Timer(30, this);
        //this.view=new GUI(); <----new buat nanti
        //view.setVisible(true);<--- nanti
    }
    public int getNumOfTrans(){
        return board.getNumOfTrans();
    }
    public Color getBoxColor(int a, int b){
        return board.getArrOfBox()[a][b].getColor();
    }
    public int getPos(int a){
        return board.getArrOfPlayer()[a].getPos();
    }
    public int[] getTrans(int a){
        Transporter trans=board.getArrOfTrans()[a];
        int tmp=0;
        if(trans.getType().equalsIgnoreCase("Snake")){
            tmp=1;
        }
            int[] tmp2={tmp,trans.getX(),trans.getY(),trans.getTarget().getX(),trans.getTarget().getY()};
        return tmp2;
    }
    public int getNumOfPlayers(){
        return board.getNumOfPlayers();
    }
   //method getPlayerPos        belum
    public boolean getPlayerFacingRight(int a){
        Player player=board.getArrOfPlayer()[a];
        return player.getIsFacingRight();
    }
    //method getIsPlayerSprite  belum
    //setPlayer                 belum
    //rolldice                  belum
    //gamestart                 belum
    //actionPerformed           belum
    //updatePlayers             belum
}