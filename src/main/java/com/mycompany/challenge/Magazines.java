/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.challenge;

/**
 *
 * @author edgargarcia
 */
public class Magazines implements Searchable{
    
    private String headLine;

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }
    @Override
    public void getName(String name){
        System.out.println("Implementation of the search of Magazines");
    }
    
}
