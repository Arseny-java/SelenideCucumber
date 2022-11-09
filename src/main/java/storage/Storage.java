package storage;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("FieldMayBeFinal")
public class Storage {
    private static Map<String, String> storage = new HashMap<>();

    public static String getStorageValue(String key) {
        return storage.get(key);
    }

    public static void setStorageValue(String key, String value) {
        storage.put(key, value);
    }
}
