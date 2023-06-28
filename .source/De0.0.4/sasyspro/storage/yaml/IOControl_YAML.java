package sasyspro.storage.yaml;


import java.io.*;
import java.util.ArrayList;

/**
 * @author Laola233
 * @version 0.1
 * @serial SchoolAdminSystemPro
 * @since 0.3B
 */

public class IOControl_YAML {

    public <T> void write(ArrayList<T> arr, String path, boolean ifAppendWrite) {
        File f = new File(path);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f, ifAppendWrite));
            oos.writeObject(arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public <T> ArrayList<T> read(String path) {
        File f = new File(path);
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            return (ArrayList<T>) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
