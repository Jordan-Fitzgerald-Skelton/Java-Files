/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hello;

/**
 *
 * @author Jordan
 */
public class Person {
    public String sName;
    public int iAge;

    public Person (String sInName, int iInAge)
    {
        this.sName = sInName;
        this.iAge = iInAge;
    }
    
    public String getsName()
    {
        return sName;
    }
    
    public void setsName(String sNewName)
    {
        this.sName= sNewName;
    }
    
    public int getiAge()
    {
        return iAge;
    }
    
    public void setiAge(int iNewAge)
    {
        this.iAge= iNewAge;
    }
    
    public String printPerson()
    {
        return sName + " is " + iAge + " years old";
    }
}
