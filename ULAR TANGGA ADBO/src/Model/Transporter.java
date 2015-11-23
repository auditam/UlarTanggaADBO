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
public class Transporter extends Box {
    
    private Box target;
    String type;

    public Transporter(int x, int y, Box target,String type) {
        super(x, y);
        this.target = target;
        this.type = type;
    }

    public Box getTarget() {
        return this.target;
    }

    public void setTarget(Box target) {
        this.target = target;
    }

    public String getType(){
        return this.type;
    }
    
}
