package Model;

import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priambodo_pangestu
 */
public class Player {
    private int spotX, spotY, playerTurn, playerPos;
    
    private Box posInBox;
    
    private Board bigBoard;
    
    private BufferedImage picture;
    
    private boolean isComp;
    
    private boolean isFacingRight;
    
    public Player(int playerNum){
        
    }
    public boolean getIsFacingRight(){
        return this.isFacingRight;
    }
    public int getPos(){
        return this.playerPos;
    }
    public int getSpotX(){
        return this.spotX;
    }
    public int getSpotY(){
        return this.spotY;
    }
}
