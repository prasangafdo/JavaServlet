package com.northshore.web.DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by 150101002 on 5/20/2017.
 */
public class MYSQLAccess {
    private Connection connect;
public void readDatabase() throws Exception {
    try {
        Class.forName("com.mysql.jdbc.Driver");

        connect = DriverManager
                .getConnection("jdbc:mysql://localhost/AIRPORT_SYS?"
                + "user=root");
    }
    catch (Exception ex){
        ex.printStackTrace();

    }
}

    public static void main(String[] args) throws Exception {
        MYSQLAccess access = new MYSQLAccess();
        access.readDatabase();
    }
}
