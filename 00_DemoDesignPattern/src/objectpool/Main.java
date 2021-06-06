package objectpool;

import java.sql.Connection;

public class Main {
    public static void main(String args[]) {
        // Do something...


        // Tạo ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Truy cập kết nối:
        Connection con = pool.checkOut();

        // Sử dụng kết nối...

        // Return the connection:
        pool.checkIn(con);

    }

}
