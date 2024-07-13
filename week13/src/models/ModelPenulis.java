/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author D2K
 */
public class ModelPenulis {
    public int id;
    public String nama;
    
    public ModelPenulis(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }
    
}
