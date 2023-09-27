/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manipulation;

/**
 *
 * @author Jordan
 */
public class Strings {
    private String text;
    
    public String reverseText(){
        StringBuffer buffer = new StringBuffer();
        
        if(text == null){
            return null;
        }
        
        //"gnitseT"
        for(int i = text.length()-1; i>= 0; i--){
            char c = text.charAt(i);
            buffer.append(c);
        }
        String reversedText = buffer.toString();
        return reversedText;
    }
    
    public void setText(String text){
        this.text = text;
    }
}
