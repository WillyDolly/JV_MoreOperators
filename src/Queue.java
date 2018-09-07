
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Queue implements InterfaceQueue{
    char q[];
    int putloc, getloc;
    Queue(int size){// make use of position 0
        q = new char[size];
        getloc = -1;
        putloc = 0;// can not use 1 field to put & get simultaneously
    }
    
    public void put(char ch) throws QueueFullException{
        if(putloc == q.length){
           throw new QueueFullException(q.length);
        }
     
        q[putloc] = ch;
          putloc++;
    }
    
    public char get()throws QueueEmptyException{
        if(getloc==putloc-1){
          throw new QueueEmptyException();
        }
        getloc++;
        return q[getloc];
    }
}
