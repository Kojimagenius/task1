package com.company;

import java.lang.reflect.Field;
import java.util.Properties;

public class Injector {


    public void Inject(Object ob)
    {
        Class object = ob.getClass();
        Field[] fields = object.getDeclaredFields();
        Properties prop = new Properties();
        for(Field classField : fields)
        {
           if(classField.isAnnotationPresent(AutoInject.class))
           {
            classField.setAccessible(true);
            //classField.set();
           }
        }
    }
}
