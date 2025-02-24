package io.oussamaib0.dao.impl;

import io.oussamaib0.dao.IDao;

public class Dao implements IDao {
    @Override
    public Long getData() {
        System.out.println("Expected data");
        return 99l;
    }
}
