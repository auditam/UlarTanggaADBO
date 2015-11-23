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
public class Snakes extends Transporter{
    
    private Box target;
    private String type;

    public Snakes(int x, int y, Box target, String type ) {
        super(x, y, target, type);
    }

    @Override
    public Box getTarget() {
        return this.target;
    }

    @Override
    public void setTarget(Box target) {
        this.target = target;
    }

    @Override
    public String getType() {
        return this.type;
    }
    
}
