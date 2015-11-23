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
public interface String {
    public abstract Box getPosition();
    
    public abstract Box getHeadPosition();
    
    public abstract Box getTailPosition();
    
    public abstract String getName();
    
    public abstract void setHeadPosition();
    
    public abstract void setTailPosition();
    
    public abstract boolean checkOverBoard();
    
    
    
}
