/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uaspbo;

import com.mycompany.uaspbo.db.NoteAppMenu;


/**
 *2
 * @author budi
 */
public class Main{

    public static void main(String[] args) {
        NoteAppMenu noteapp = new NoteAppMenu("notes.db");
        noteapp.start();
    }
}
