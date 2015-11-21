/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author priambodo_pangestu
 */
public class Box {
    protected int x, y;
    
    protected Transporter type;
    
    public Box(int x, int y){
        //fill this up
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Transporter getType(){
        return type;
    }
}
