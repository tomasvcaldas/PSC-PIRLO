package com.example.utilizador.pirloit;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;


public class BaseConfig extends OrmLiteConfigUtil {
    private static final Class<?>[] classes = new Class[] {
            Evento.class,
    };
    public static void main(String[] args) throws Exception {
        writeConfigFile("ormlite_config.txt", classes);
    }
}