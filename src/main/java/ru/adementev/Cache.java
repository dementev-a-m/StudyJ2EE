package ru.adementev;

import java.util.HashMap;

/**
 * Created by Антон Дементьев on 04.09.2017.
 */
public class Cache {
    private static Cache instanse = new Cache();
    private HashMap<Long, Object> cache = new HashMap<Long, Object>();
    private Cache(){}

    public static synchronized Cache getInstanse() {
        return instanse;
    }

    public void addToCache(Long id, Object object){
        if(!cache.containsKey(id))
            cache.put(id,object);
    }

    public void removeFromCache(Long id) {
        if(cache.containsKey(id))
            cache.remove(id);
    }

    public Object getFromCashe(Long id){
        if(cache.containsKey(id))
            return cache.get(id);
        else
            return null;
    }
}
