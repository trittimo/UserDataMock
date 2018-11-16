package com.trittimo.udm.util;

import java.util.HashMap;
import java.util.Map;

public class UDMContext {
    private Map context;
    public UDMContext() {
        this.context = new HashMap();
    }

    public void put(String key, Object object) {
        this.context.put(key, object);
    }

    public <T> T get(Class<T> clazz, String key) {
        return (T) this.context.get(key);
    }
}
