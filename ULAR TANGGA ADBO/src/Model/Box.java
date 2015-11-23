/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author priambodo_pangestu
 */
public class Box {
    private int x, y;
    
    private String type;
    
    private Color color;
    
    public Box(int x, int y){
        this.x = x;
        this.y = y;
        Random random = new Random();
        int i = random.nextInt(4);
        if( i == 0){
            color = new Color(217, 30, 24);
        }
        else if(i == 1){
            color = new Color(34, 167, 240);
        }
        else if(i == 2){
            color = new Color(3, 201, 169);
        }
        else if(i == 3){
            color = new Color(249, 191, 59);
        }
        else{
            color = Color.WHITE;
        }
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
}
