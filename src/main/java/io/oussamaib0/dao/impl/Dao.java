package io.oussamaib0.dao.impl;

import io.oussamaib0.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class Dao implements IDao {
    @Override
    public Long getData() {
        System.out.println("Expected data from Dao impl");
        return 99L;
    }
}
