/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class QueueFullException extends Exception{
    int size;
    QueueFullException(int s){
        size = s;
    }
    public String toString(){
        return "Full Queue. Maximum size is "+size;
    }
}
