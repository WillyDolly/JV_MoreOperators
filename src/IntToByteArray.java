
import java.nio.ByteBuffer;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class IntToByteArray {
    public static void main(String[] args) {
        byte[] b = new byte[4];// int 32 bit = 4 bytes = byte[4]
        ByteBuffer.wrap(b).putInt(129);
        System.out.println(Arrays.toString(b));

//       ByteBuffer bb = ByteBuffer.allocate(4);
//       bb.putInt(1222);
//       bb.flip();
//       bb.get(b);
//        System.out.println(Arrays.toString(b));
    }
}
