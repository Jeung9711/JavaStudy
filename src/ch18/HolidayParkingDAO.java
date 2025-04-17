package ch18;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HolidayParkingDAO {
    public List<HolidayParkingDTO> select() {
        List<HolidayParkingDTO> list = new ArrayList<>();

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/java";
            String id = "root";
            String pw = "1234";
            // try - with - resources <- 자동 close()
            con = DriverManager.getConnection(url, id, pw);

            // SQL Injection 공격 예방을 위해 사용
            String sql = "SELECT * FROM holiday_parking";
            stmt = con.prepareStatement(sql);
            stmt.executeQuery();

            // SQL 결과 받아오기
            rs = stmt.executeQuery(); // 쿼리의 결과를 저장
            rs.next(); // 한줄씩 선택, 없으면 false 반환

            while (rs.next()) {
                HolidayParkingDTO dto = new HolidayParkingDTO();

                int id2 = rs.getInt("id"); // 컬럼의 명칭
                String name = rs.getString("name");
                String address = rs.getString("address");

                // dto 객체에 해당 쿼리 결과 저장
                dto.setId(id2);
                dto.setName(name);
                dto.setAddress(address);

                list.add(dto);
//                System.out.printf("%d, %s, %s\n", id2, address, name);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 연결했던 순서의 역순으로 연결 해제
            try {
                if(rs != null) rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return list;
    }
}
