package org.eCommerce.repositories;

import org.eCommerce.entities._BaseEntity;
import java.util.ArrayList;
import java.util.List;

public class _BaseRepositoryImpl<T extends _BaseEntity> implements _BaseRepository<T>{

    List<T> entidades  = new ArrayList<T>();

    public _BaseRepositoryImpl(Class<T> tClass) {
    }

    @Override
    public void create(T obj) {
        entidades.add(obj);
    }

    @Override
    public List<T> read() {
        return entidades;
    }

    @Override
    public void update(T obj) {

    }

    @Override
    public void delete(int id) {
        entidades.remove(id);
    }

}



