package ch18;

import java.sql.*;
import java.util.List;

public class JDBC {
    public static void main(String[] args) {
        // HolidayParkingDAO로 DB 연결 및 출력
        HolidayParkingDAO dao = new HolidayParkingDAO();
        // HolidayParkingDTO로 DAO의 결과 대입
        List result = dao.select();

        System.out.println(result);
    }
}
