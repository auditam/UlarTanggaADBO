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
public class Dice {
    private int number;
    
    /**
     * method yang digunakan untuk mendapatkan nomor dadu secara acak
     */
    public int rollDadu(){
        return (new Random().nextInt(6) + 1 );
    }
}
