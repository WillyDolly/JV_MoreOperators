/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public interface InterfaceQueue {
    void put(char a) throws QueueFullException;
    char get() throws QueueEmptyException;
}
