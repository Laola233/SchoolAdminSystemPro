package sasyspro;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * @author Laola233
 * @version 0.3B
 * @Title ConfigReader
 * @serial SchoolAdminSystemPro
 * @since 0.3B
 */
public class ConfigurationReader {
    private static Properties p = new Properties();

    static {
        try {
            p.load(ConfigurationReader.class.getResourceAsStream("config.properties"));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static String getProperty(String typename) throws Exception {
        return p.getProperty(typename);
    }

    public static @NotNull List getAllProperty() throws Exception {
        List list = new ArrayList<>();
        Set<String> typename = p.stringPropertyNames();
        for (String name : typename) {
            list.add(p.getProperty(name));
        }
        return list;
    }
}
