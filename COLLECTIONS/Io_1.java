package COLLECTIONS;

import javax.xml.crypto.Data;
import java.io.*;

public class Io_1 {
    public static void main(String[] args) {


        String filename = "datafile.dat";
        String message = "Hello World";

        try (DataOutputStream out = new DataOutputStream (new BufferedOutputStream (new FileOutputStream (filename)))) {
            out.writeByte (107);
            out.writeShort (0xFFF0);  // -1
            out.writeInt (0x10B7);
            out.writeFloat (55.87f);
            out.writeDouble (55.56);
            out.writeBoolean (true);
            out.writeBoolean (false);
            for (int i = 0; i < message.length (); ++i)
                out.writeChar (message.charAt (i));
            out.writeChars (message);
            out.writeBytes (message);
            out.flush ();
        } catch (IOException ex) {
            ex.printStackTrace ();
        }

        try (DataInputStream in = new DataInputStream( new BufferedInputStream( new FileInputStream(filename))))
        {
            System.out.println("byte:    " + in.readByte());
            System.out.println("short:   " + in.readShort());
            System.out.println("int:     " + in.readInt());
            System.out.println("float:   " + in.readFloat());
            System.out.println("double:  " + in.readDouble());
            System.out.println("boolean: " + in.readBoolean());
            System.out.println("boolean: " + in.readBoolean());

            System.out.print("char:    ");
            for (int i = 0; i < message.length(); ++i) {
                System.out.print(in.readChar());
                // Can also be done by System.out.print((char)in.readByte());
            }
            System.out.println();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
