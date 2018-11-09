package com.FutureGadgetParkingLot.data;

import javax.sql.DataSource;
import java.util.List;

public interface DAO<T> {

    void setDataSource(DataSource ds);

    void create(String Query);

    List<T> get(String Query);
}
